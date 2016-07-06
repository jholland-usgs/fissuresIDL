// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2000
// Object Oriented Concepts, Inc.
// Billerica, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.0.5

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAttr:1.0
//
final public class DataSetAttrHelper
{
    public static void
    insert(org.omg.CORBA.Any any, DataSetAttr val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static DataSetAttr
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
            return read(any.create_input_stream());
        else
            throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[4];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "id";
            members[0].type = NodeIdHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "name";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "owner";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "parm_ids";
            members[3].type = orb.create_sequence_tc(0, ParameterRefHelper.type());

            typeCode_ = orb.create_struct_tc(id(), "DataSetAttr", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAttr:1.0";
    }

    public static DataSetAttr
    read(org.omg.CORBA.portable.InputStream in)
    {
        DataSetAttr _ob_v = new DataSetAttr();
        _ob_v.id = NodeIdHelper.read(in);
        _ob_v.name = in.read_string();
        _ob_v.owner = in.read_string();
        int len0 = in.read_ulong();
        _ob_v.parm_ids = new edu.iris.Fissures.IfParameterMgr.ParameterRef[len0];
        for(int i0 = 0 ; i0 < len0 ; i0++)
            _ob_v.parm_ids[i0] = ParameterRefHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, DataSetAttr val)
    {
        NodeIdHelper.write(out, val.id);
        out.write_string(val.name);
        out.write_string(val.owner);
        int len0 = val.parm_ids.length;
        out.write_ulong(len0);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            ParameterRefHelper.write(out, val.parm_ids[i0]);
    }
}
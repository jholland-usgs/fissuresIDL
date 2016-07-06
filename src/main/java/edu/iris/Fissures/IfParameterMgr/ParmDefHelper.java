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

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParmDef:1.0
//
final public class ParmDefHelper
{
    public static void
    insert(org.omg.CORBA.Any any, ParmDef val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static ParmDef
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[3];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "parm_name";
            members[0].type = ParameterNameHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "description";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "creator";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            typeCode_ = orb.create_struct_tc(id(), "ParmDef", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfParameterMgr/ParmDef:1.0";
    }

    public static ParmDef
    read(org.omg.CORBA.portable.InputStream in)
    {
        ParmDef _ob_v = new ParmDef();
        _ob_v.parm_name = ParameterNameHelper.read(in);
        _ob_v.description = in.read_string();
        _ob_v.creator = in.read_string();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, ParmDef val)
    {
        ParameterNameHelper.write(out, val.parm_name);
        out.write_string(val.description);
        out.write_string(val.creator);
    }
}
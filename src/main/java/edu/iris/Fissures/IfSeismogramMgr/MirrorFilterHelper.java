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

package edu.iris.Fissures.IfSeismogramMgr;

//
// IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFilter:1.0
//
final public class MirrorFilterHelper
{
    public static void
    insert(org.omg.CORBA.Any any, MirrorFilter val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static MirrorFilter
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
            members[0].name = "network_name";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "station_name";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "site_id";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "channel_code";
            members[3].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            typeCode_ = orb.create_struct_tc(id(), "MirrorFilter", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFilter:1.0";
    }

    public static MirrorFilter
    read(org.omg.CORBA.portable.InputStream in)
    {
        MirrorFilter _ob_v = new MirrorFilter();
        _ob_v.network_name = in.read_string();
        _ob_v.station_name = in.read_string();
        _ob_v.site_id = in.read_string();
        _ob_v.channel_code = in.read_string();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, MirrorFilter val)
    {
        out.write_string(val.network_name);
        out.write_string(val.station_name);
        out.write_string(val.site_id);
        out.write_string(val.channel_code);
    }
}

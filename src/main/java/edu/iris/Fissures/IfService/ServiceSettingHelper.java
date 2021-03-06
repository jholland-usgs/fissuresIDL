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

package edu.iris.Fissures.IfService;

//
// IDL:iris.edu/Fissures/IfService/ServiceSetting:1.0
//
final public class ServiceSettingHelper
{
    public static void
    insert(org.omg.CORBA.Any any, ServiceSetting val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static ServiceSetting
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[2];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "name";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "value";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_any);

            typeCode_ = orb.create_struct_tc(id(), "ServiceSetting", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfService/ServiceSetting:1.0";
    }

    public static ServiceSetting
    read(org.omg.CORBA.portable.InputStream in)
    {
        ServiceSetting _ob_v = new ServiceSetting();
        _ob_v.name = in.read_string();
        _ob_v.value = in.read_any();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, ServiceSetting val)
    {
        out.write_string(val.name);
        out.write_any(val.value);
    }
}

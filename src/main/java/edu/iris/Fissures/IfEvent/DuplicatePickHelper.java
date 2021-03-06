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

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/DuplicatePick:1.0
//
final public class DuplicatePickHelper
{
    public static void
    insert(org.omg.CORBA.Any any, DuplicatePick val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static DuplicatePick
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[0];

            typeCode_ = orb.create_exception_tc(id(), "DuplicatePick", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfEvent/DuplicatePick:1.0";
    }

    public static DuplicatePick
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!id().equals(in.read_string()))
            throw new org.omg.CORBA.MARSHAL();

        DuplicatePick _ob_v = new DuplicatePick();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, DuplicatePick val)
    {
        out.write_string(id());
    }
}

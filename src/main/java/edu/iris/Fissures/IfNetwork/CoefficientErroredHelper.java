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

package edu.iris.Fissures.IfNetwork;

//
// IDL:iris.edu/Fissures/IfNetwork/CoefficientErrored:1.0
//
final public class CoefficientErroredHelper
{
    public static void
    insert(org.omg.CORBA.Any any, CoefficientErrored val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static CoefficientErrored
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
            members[0].name = "value";
            members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "error";
            members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            typeCode_ = orb.create_struct_tc(id(), "CoefficientErrored", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfNetwork/CoefficientErrored:1.0";
    }

    public static CoefficientErrored
    read(org.omg.CORBA.portable.InputStream in)
    {
        CoefficientErrored _ob_v = new CoefficientErrored();
        _ob_v.value = in.read_float();
        _ob_v.error = in.read_float();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, CoefficientErrored val)
    {
        out.write_float(val.value);
        out.write_float(val.error);
    }
}

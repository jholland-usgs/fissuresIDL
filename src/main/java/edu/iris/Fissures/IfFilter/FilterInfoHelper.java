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

package edu.iris.Fissures.IfFilter;

//
// IDL:iris.edu/Fissures/IfFilter/FilterInfo:1.0
//
final public class FilterInfoHelper
{
    public static void
    insert(org.omg.CORBA.Any any, FilterInfo val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static FilterInfo
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
            members[0].name = "supported_algorithms";
            members[0].type = AlgorithmSeqHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "supported_croppings";
            members[1].type = CroppingSeqHelper.type();

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "supports_two_way";
            members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_boolean);

            typeCode_ = orb.create_struct_tc(id(), "FilterInfo", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfFilter/FilterInfo:1.0";
    }

    public static FilterInfo
    read(org.omg.CORBA.portable.InputStream in)
    {
        FilterInfo _ob_v = new FilterInfo();
        _ob_v.supported_algorithms = AlgorithmSeqHelper.read(in);
        _ob_v.supported_croppings = CroppingSeqHelper.read(in);
        _ob_v.supports_two_way = in.read_boolean();
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, FilterInfo val)
    {
        AlgorithmSeqHelper.write(out, val.supported_algorithms);
        CroppingSeqHelper.write(out, val.supported_croppings);
        out.write_boolean(val.supports_two_way);
    }
}
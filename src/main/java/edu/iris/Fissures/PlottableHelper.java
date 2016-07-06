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

package edu.iris.Fissures;

//
// IDL:iris.edu/Fissures/Plottable:1.0
//
final public class PlottableHelper
{
    public static void
    insert(org.omg.CORBA.Any any, Plottable val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static Plottable
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
            members[0].name = "x_coor";
            members[0].type = orb.create_sequence_tc(0, orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long));

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "y_coor";
            members[1].type = orb.create_sequence_tc(0, orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_long));

            typeCode_ = orb.create_struct_tc(id(), "Plottable", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/Plottable:1.0";
    }

    public static Plottable
    read(org.omg.CORBA.portable.InputStream in)
    {
        Plottable _ob_v = new Plottable();
        int len0 = in.read_ulong();
        _ob_v.x_coor = new int[len0];
        in.read_long_array(_ob_v.x_coor, 0, len0);
        int len1 = in.read_ulong();
        _ob_v.y_coor = new int[len1];
        in.read_long_array(_ob_v.y_coor, 0, len1);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, Plottable val)
    {
        int len0 = val.x_coor.length;
        out.write_ulong(len0);
        out.write_long_array(val.x_coor, 0, len0);
        int len1 = val.y_coor.length;
        out.write_ulong(len1);
        out.write_long_array(val.y_coor, 0, len1);
    }
}
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
// IDL:iris.edu/Fissures/Unit:1.0
//
/** A unit of measurement, derived from SI base units by
 *multiplication of other units, prefixing of powers of ten,
 *raising to exponents and multiplication by constants. The only
 *shortcoming is the inability to define offsets for Celsius and
 *Fahrenheit. */

public abstract class Unit implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/Unit/the_unit_base:1.0
    //
    /** The base, if a base unit, or COMPOSITE in not. */

    public UnitBase the_unit_base;

    //
    // IDL:iris.edu/Fissures/Unit/elements:1.0
    //
    /** The subunits if COMPOSITE, zero length array if not. */

    public Unit[] elements;

    //
    // IDL:iris.edu/Fissures/Unit/power:1.0
    //
    /** The power of ten to prefix. */

    public int power;

    //
    // IDL:iris.edu/Fissures/Unit/name:1.0
    //
    /** A name for the unit, may be empty if the name should be
     *automatically generated. */

    public String name;

    //
    // IDL:iris.edu/Fissures/Unit/multi_factor:1.0
    //
    /** A constant multiplier. */

    public double multi_factor;

    //
    // IDL:iris.edu/Fissures/Unit/exponent:1.0
    //
    /** An exponent for the entire unit, ie Hertz would be SECOND with
     *an exponent of -1. */

    public int exponent;

    private static String[] _OB_truncatableIds_ =
    {
        UnitHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        the_unit_base = UnitBaseHelper.read(in);
        int len0 = in.read_ulong();
        elements = new Unit[len0];
        for(int i0 = 0 ; i0 < len0 ; i0++)
            elements[i0] = UnitHelper.read(in);
        power = in.read_long();
        name = in.read_string();
        multi_factor = in.read_double();
        exponent = in.read_long();
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        UnitBaseHelper.write(out, the_unit_base);
        int len0 = elements.length;
        out.write_ulong(len0);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            UnitHelper.write(out, elements[i0]);
        out.write_long(power);
        out.write_string(name);
        out.write_double(multi_factor);
        out.write_long(exponent);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return UnitHelper.type();
    }
}

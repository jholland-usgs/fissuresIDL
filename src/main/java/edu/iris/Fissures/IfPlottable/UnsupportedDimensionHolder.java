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

package edu.iris.Fissures.IfPlottable;

//
// IDL:iris.edu/Fissures/IfPlottable/UnsupportedDimension:1.0
//
final public class UnsupportedDimensionHolder implements org.omg.CORBA.portable.Streamable
{
    public UnsupportedDimension value;

    public
    UnsupportedDimensionHolder()
    {
    }

    public
    UnsupportedDimensionHolder(UnsupportedDimension initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = UnsupportedDimensionHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        UnsupportedDimensionHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return UnsupportedDimensionHelper.type();
    }
}
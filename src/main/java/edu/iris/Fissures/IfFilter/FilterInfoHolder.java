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
final public class FilterInfoHolder implements org.omg.CORBA.portable.Streamable
{
    public FilterInfo value;

    public
    FilterInfoHolder()
    {
    }

    public
    FilterInfoHolder(FilterInfo initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = FilterInfoHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        FilterInfoHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return FilterInfoHelper.type();
    }
}

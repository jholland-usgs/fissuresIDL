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
// IDL:iris.edu/Fissures/IfNetwork/Instrumentation:1.0
//
final public class InstrumentationHolder implements org.omg.CORBA.portable.Streamable
{
    public Instrumentation value;

    public
    InstrumentationHolder()
    {
    }

    public
    InstrumentationHolder(Instrumentation initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = InstrumentationHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        InstrumentationHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return InstrumentationHelper.type();
    }
}
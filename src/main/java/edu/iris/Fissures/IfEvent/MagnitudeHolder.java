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
// IDL:iris.edu/Fissures/IfEvent/Magnitude:1.0
//
final public class MagnitudeHolder implements org.omg.CORBA.portable.Streamable
{
    public Magnitude value;

    public
    MagnitudeHolder()
    {
    }

    public
    MagnitudeHolder(Magnitude initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = MagnitudeHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        MagnitudeHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return MagnitudeHelper.type();
    }
}
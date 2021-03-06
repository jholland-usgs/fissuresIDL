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

package edu.iris.Fissures.IfSeismogramDC;

//
// IDL:iris.edu/Fissures/IfSeismogramDC/LocalSeismogram:1.0
//
final public class LocalSeismogramHolder implements org.omg.CORBA.portable.Streamable
{
    public LocalSeismogram value;

    public
    LocalSeismogramHolder()
    {
    }

    public
    LocalSeismogramHolder(LocalSeismogram initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = LocalSeismogramHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        LocalSeismogramHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return LocalSeismogramHelper.type();
    }
}

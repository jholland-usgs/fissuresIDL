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

package edu.iris.Fissures.IfService;

//
// IDL:iris.edu/Fissures/IfService/Service:1.0
//
final public class ServiceHolder implements org.omg.CORBA.portable.Streamable
{
    public Service value;

    public
    ServiceHolder()
    {
    }

    public
    ServiceHolder(Service initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ServiceHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ServiceHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ServiceHelper.type();
    }
}
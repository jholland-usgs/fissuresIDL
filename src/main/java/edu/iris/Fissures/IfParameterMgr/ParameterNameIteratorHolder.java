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

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParameterNameIterator:1.0
//
final public class ParameterNameIteratorHolder implements org.omg.CORBA.portable.Streamable
{
    public ParameterNameIterator value;

    public
    ParameterNameIteratorHolder()
    {
    }

    public
    ParameterNameIteratorHolder(ParameterNameIterator initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ParameterNameIteratorHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ParameterNameIteratorHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ParameterNameIteratorHelper.type();
    }
}
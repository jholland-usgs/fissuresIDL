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
// IDL:iris.edu/Fissures/IfNetwork/TransferType:1.0
//
final public class TransferTypeHolder implements org.omg.CORBA.portable.Streamable
{
    public TransferType value;

    public
    TransferTypeHolder()
    {
    }

    public
    TransferTypeHolder(TransferType initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = TransferTypeHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        TransferTypeHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return TransferTypeHelper.type();
    }
}
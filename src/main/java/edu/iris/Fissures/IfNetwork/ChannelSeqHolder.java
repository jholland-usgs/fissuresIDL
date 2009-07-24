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
// IDL:iris.edu/Fissures/IfNetwork/ChannelSeq:1.0
//
final public class ChannelSeqHolder implements org.omg.CORBA.portable.Streamable
{
    public Channel[] value;

    public
    ChannelSeqHolder()
    {
    }

    public
    ChannelSeqHolder(Channel[] initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ChannelSeqHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ChannelSeqHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ChannelSeqHelper.type();
    }
}
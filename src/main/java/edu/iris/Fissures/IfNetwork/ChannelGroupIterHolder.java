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
// IDL:iris.edu/Fissures/IfNetwork/ChannelGroupIter:1.0
//
final public class ChannelGroupIterHolder implements org.omg.CORBA.portable.Streamable
{
    public ChannelGroupIter value;

    public
    ChannelGroupIterHolder()
    {
    }

    public
    ChannelGroupIterHolder(ChannelGroupIter initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ChannelGroupIterHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ChannelGroupIterHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ChannelGroupIterHelper.type();
    }
}

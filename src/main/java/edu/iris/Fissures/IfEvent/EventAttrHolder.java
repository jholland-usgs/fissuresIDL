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
// IDL:iris.edu/Fissures/IfEvent/EventAttr:1.0
//
final public class EventAttrHolder implements org.omg.CORBA.portable.Streamable
{
    public EventAttr value;

    public
    EventAttrHolder()
    {
    }

    public
    EventAttrHolder(EventAttr initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = EventAttrHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        EventAttrHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return EventAttrHelper.type();
    }
}

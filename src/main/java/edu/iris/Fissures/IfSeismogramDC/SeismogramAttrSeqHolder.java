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
// IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttrSeq:1.0
//
final public class SeismogramAttrSeqHolder implements org.omg.CORBA.portable.Streamable
{
    public SeismogramAttr[] value;

    public
    SeismogramAttrSeqHolder()
    {
    }

    public
    SeismogramAttrSeqHolder(SeismogramAttr[] initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = SeismogramAttrSeqHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        SeismogramAttrSeqHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return SeismogramAttrSeqHelper.type();
    }
}
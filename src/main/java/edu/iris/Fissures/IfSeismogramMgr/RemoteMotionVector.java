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

package edu.iris.Fissures.IfSeismogramMgr;

//
// IDL:iris.edu/Fissures/IfSeismogramMgr/RemoteMotionVector:1.0
//
/***/

public abstract class RemoteMotionVector extends edu.iris.Fissures.IfSeismogramDC.MotionVectorAttr
{
    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/RemoteMotionVector/seismograms:1.0
    //
    /***/

    public Seismogram[] seismograms;

    private static String[] _OB_truncatableIds_ =
    {
        RemoteMotionVectorHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        super._read(in);
        seismograms = SeismogramSeqHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        super._write(out);
        SeismogramSeqHelper.write(out, seismograms);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return RemoteMotionVectorHelper.type();
    }
}
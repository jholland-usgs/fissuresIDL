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
// IDL:iris.edu/Fissures/IfNetwork/Calibration:1.0
//
/***/

public abstract class Calibration implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/IfNetwork/Calibration/frequency:1.0
    //
    /** frequency in hertz (HZ) */

    public float frequency;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Calibration/sensitivity:1.0
    //
    /***/

    public float sensitivity;

    //
    // IDL:iris.edu/Fissures/IfNetwork/Calibration/when:1.0
    //
    /***/

    public edu.iris.Fissures.Time when;

    private static String[] _OB_truncatableIds_ =
    {
        CalibrationHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        frequency = in.read_float();
        sensitivity = in.read_float();
        when = edu.iris.Fissures.TimeHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        out.write_float(frequency);
        out.write_float(sensitivity);
        edu.iris.Fissures.TimeHelper.write(out, when);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return CalibrationHelper.type();
    }
}

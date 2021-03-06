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

package edu.iris.Fissures.IfTimeSeries;

//
// IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin:1.0
//
/***/

public interface TimeSeriesAdmin extends org.omg.CORBA.portable.IDLEntity
{
    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/close:1.0
    //
    /***/

    void
    close();

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_longs:1.0
    //
    /**
     * Clients must resend failed calls with the same data for the
     * same sequence number until successful.
     **/

    void
    append_longs(int seq_num,
                 int[] data,
                 edu.iris.Fissures.AuditInfo[] audit_info)
        throws SequenceOutOfOrder;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_shorts:1.0
    //
    /***/

    void
    append_shorts(int seq_num,
                  short[] data,
                  edu.iris.Fissures.AuditInfo[] audit_info)
        throws SequenceOutOfOrder;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_floats:1.0
    //
    /***/

    void
    append_floats(int seq_num,
                  float[] data,
                  edu.iris.Fissures.AuditInfo[] audit_info)
        throws SequenceOutOfOrder;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_doubles:1.0
    //
    /***/

    void
    append_doubles(int seq_num,
                   double[] data,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws SequenceOutOfOrder;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_encoded_seq:1.0
    //
    /***/

    void
    append_encoded_seq(int seq_num,
                       EncodedData[] data,
                       edu.iris.Fissures.AuditInfo[] audit_info)
        throws SequenceOutOfOrder;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_encoded:1.0
    //
    /***/

    void
    append_encoded(int seq_num,
                   EncodedData data,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws SequenceOutOfOrder;
}

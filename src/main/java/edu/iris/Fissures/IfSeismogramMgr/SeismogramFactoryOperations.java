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
// IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory:1.0
//
/**
 * The factory interface provides the operations to create new
 * seismograms
 **/

public interface SeismogramFactoryOperations
{
    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/active_seismogram_count:1.0
    //
    /***/

    int
    active_seismogram_count();

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create:1.0
    //
    /***/

    Seismogram
    create(edu.iris.Fissures.IfSeismogramDC.SeismogramAttr the_attributes,
           edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create_from_value:1.0
    //
    /***/

    Seismogram
    create_from_value(edu.iris.Fissures.IfSeismogramDC.LocalSeismogram a_seismogram,
                      edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create_from_values:1.0
    //
    /***/

    Seismogram[]
    create_from_values(edu.iris.Fissures.IfSeismogramDC.LocalMotionVector a_seismogram,
                       edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFactory/create_from_ref:1.0
    //
    /***/

    Seismogram
    create_from_ref(Seismogram a_seismogram,
                    edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException;
}
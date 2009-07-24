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
// IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFinder:1.0
//
/**
 * The Finder interface contains the operation for location a
 * seismogram
 **/

public interface SeismogramFinderOperations extends SeismogramComponentOperations
{
    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFinder/find_seismograms:1.0
    //
    /***/

    SeismogramAccess[]
    find_seismograms(edu.iris.Fissures.IfSeismogramDC.RequestFilter[] a_request)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramFinder/find_group:1.0
    //
    /***/

    RemoteMotionVector
    find_group(edu.iris.Fissures.IfSeismogramDC.GroupRequest[] a_request)
        throws edu.iris.Fissures.FissuresException;
}
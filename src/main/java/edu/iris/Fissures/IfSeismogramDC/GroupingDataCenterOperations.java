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
// IDL:iris.edu/Fissures/IfSeismogramDC/GroupingDataCenter:1.0
//
/**
 * A grouping data center will group seismogram data into motion
 * vector groups. Motion vector grouping must come from the same
 * site and have the same begin time, sample rate and number of
 * points, ie they are the "3 components of motion".
 **/

public interface GroupingDataCenterOperations extends DataCenterOperations
{
    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/GroupingDataCenter/request_groups:1.0
    //
    /***/

    String
    request_groups(GroupRequest[] a_filterseq,
                   DataCenterCallBack a_client)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/GroupingDataCenter/retrieve_groups:1.0
    //
    /***/

    LocalMotionVector[]
    retrieve_groups(GroupRequest[] a_filterseq)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/GroupingDataCenter/queue_groups:1.0
    //
    /***/

    String
    queue_groups(GroupRequest[] a_filterseq)
        throws edu.iris.Fissures.FissuresException;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/GroupingDataCenter/retrieve_group_queue:1.0
    //
    /***/

    LocalMotionVector[]
    retrieve_group_queue(String a_request)
        throws edu.iris.Fissures.FissuresException;
}
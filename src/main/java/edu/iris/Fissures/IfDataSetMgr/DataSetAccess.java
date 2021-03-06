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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess:1.0
//
/***/

public interface DataSetAccess extends edu.iris.Fissures.AuditSystemAccess,
org.omg.CORBA.portable.IDLEntity
{
    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/a_writeable:1.0
    //
    /** Navigation to a reference that allows updates */

    DataSet
    a_writeable();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/parm_svc:1.0
    //
    /** Defines the ParameterMgr where parameters for this DataSet
     *reside */

    edu.iris.Fissures.IfParameterMgr.ParameterComponent
    parm_svc();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/localize:1.0
    //
    /** Retrieve a local copy of this dataset*/

    LocalDataSet
    localize();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_attributes:1.0
    //
    /** Retrieve the attributes */

    DataSetAttr
    get_attributes();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_datasets:1.0
    //
    /** Retrieve the dataset that are children of this dataset */

    DataSetAccess[]
    get_datasets();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_motion_vectors:1.0
    //
    /** Retrieve the motion vectors that are children of this dataset.
     **/

    MotionVectorNode[]
    get_motion_vectors();

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_seismograms:1.0
    //
    /** Retrieve the seismograms that are children of this dataset */

    SeismogramNode[]
    get_seismograms();
}

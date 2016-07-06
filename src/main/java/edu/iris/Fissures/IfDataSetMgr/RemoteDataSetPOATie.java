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
// IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSet:1.0
//
public class RemoteDataSetPOATie extends RemoteDataSetPOA
{
    private RemoteDataSetOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    RemoteDataSetPOATie(RemoteDataSetOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    RemoteDataSetPOATie(RemoteDataSetOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public RemoteDataSetOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(RemoteDataSetOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public org.omg.PortableServer.POA
    _default_POA()
    {
        if(_ob_poa_ != null)
            return _ob_poa_;
        else
            return super._default_POA();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/a_writeable:1.0
    //
    public DataSet
    a_writeable()
    {
        return _ob_delegate_.a_writeable();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/parm_svc:1.0
    //
    public edu.iris.Fissures.IfParameterMgr.ParameterComponent
    parm_svc()
    {
        return _ob_delegate_.parm_svc();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_finder:1.0
    //
    public DataSetFinder
    a_finder()
    {
        return _ob_delegate_.a_finder();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_factory:1.0
    //
    public DataSetFactory
    a_factory()
    {
        return _ob_delegate_.a_factory();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSet/destroy:1.0
    //
    public void
    destroy()
    {
        _ob_delegate_.destroy();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSet/update_dataset:1.0
    //
    public void
    update_dataset(DataSetAttr dataset_attr,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        _ob_delegate_.update_dataset(dataset_attr,
                                     audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSet/add_dataset:1.0
    //
    public void
    add_dataset(DataSetAccess a_dataset,
                edu.iris.Fissures.AuditInfo[] audit_info)
        throws NotFound,
               NotADataSet
    {
        _ob_delegate_.add_dataset(a_dataset,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSet/add_motion_vector:1.0
    //
    public String
    add_motion_vector(MotionVectorNode a_motion_vector,
                      edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.add_motion_vector(a_motion_vector,
                                               audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSet/add_seismogram:1.0
    //
    public String
    add_seismogram(edu.iris.Fissures.IfSeismogramMgr.SeismogramAccess a_seismogram,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        return _ob_delegate_.add_seismogram(a_seismogram,
                                            audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSet/remove_node:1.0
    //
    public void
    remove_node(String a_node,
                edu.iris.Fissures.AuditInfo[] audit_info)
        throws edu.iris.Fissures.FissuresException
    {
        _ob_delegate_.remove_node(a_node,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/localize:1.0
    //
    public LocalDataSet
    localize()
    {
        return _ob_delegate_.localize();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_attributes:1.0
    //
    public DataSetAttr
    get_attributes()
    {
        return _ob_delegate_.get_attributes();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_datasets:1.0
    //
    public DataSetAccess[]
    get_datasets()
    {
        return _ob_delegate_.get_datasets();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_motion_vectors:1.0
    //
    public MotionVectorNode[]
    get_motion_vectors()
    {
        return _ob_delegate_.get_motion_vectors();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_seismograms:1.0
    //
    public SeismogramNode[]
    get_seismograms()
    {
        return _ob_delegate_.get_seismograms();
    }

    //
    // IDL:iris.edu/Fissures/AuditSystemAccess/get_audit_trail:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail()
        throws edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail();
    }
}
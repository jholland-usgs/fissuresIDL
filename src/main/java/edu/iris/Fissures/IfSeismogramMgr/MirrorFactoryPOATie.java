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
// IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory:1.0
//
public class MirrorFactoryPOATie extends MirrorFactoryPOA
{
    private MirrorFactoryOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    MirrorFactoryPOATie(MirrorFactoryOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    MirrorFactoryPOATie(MirrorFactoryOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public MirrorFactoryOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(MirrorFactoryOperations delegate)
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
    // IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory/a_factory:1.0
    //
    public SeismogramFactory
    a_factory()
    {
        return _ob_delegate_.a_factory();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory/mirroring_stopped:1.0
    //
    public void
    mirroring_stopped(String a_id,
                      boolean unregistered)
    {
        _ob_delegate_.mirroring_stopped(a_id,
                                        unregistered);
    }
}
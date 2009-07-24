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

package edu.iris.Fissures.IfRealTimeCollector;

//
// IDL:iris.edu/Fissures/IfRealTimeCollector/DasSoh:1.0
//
public class DasSohPOATie extends DasSohPOA
{
    private DasSohOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    DasSohPOATie(DasSohOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    DasSohPOATie(DasSohOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public DasSohOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(DasSohOperations delegate)
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
    // IDL:iris.edu/Fissures/IfRealTimeCollector/DasSoh/soh_event:1.0
    //
    public void
    soh_event(String das_id,
              DasError error)
    {
        _ob_delegate_.soh_event(das_id,
                                error);
    }
}
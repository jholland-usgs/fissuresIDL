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

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/EventDC:1.0
//
public class EventDCPOATie extends EventDCPOA
{
    private EventDCOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    EventDCPOATie(EventDCOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    EventDCPOATie(EventDCOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public EventDCOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(EventDCOperations delegate)
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
    // IDL:iris.edu/Fissures/IfEvent/EventDC/a_finder:1.0
    //
    public EventFinder
    a_finder()
    {
        return _ob_delegate_.a_finder();
    }

    //
    // IDL:iris.edu/Fissures/IfEvent/EventDC/a_channel_finder:1.0
    //
    public EventChannelFinder
    a_channel_finder()
    {
        return _ob_delegate_.a_channel_finder();
    }
}
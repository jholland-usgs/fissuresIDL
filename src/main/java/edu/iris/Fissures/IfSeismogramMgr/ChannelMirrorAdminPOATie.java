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
// IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin:1.0
//
public class ChannelMirrorAdminPOATie extends ChannelMirrorAdminPOA
{
    private ChannelMirrorAdminOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    ChannelMirrorAdminPOATie(ChannelMirrorAdminOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    ChannelMirrorAdminPOATie(ChannelMirrorAdminOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public ChannelMirrorAdminOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(ChannelMirrorAdminOperations delegate)
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
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/active_seismogram_mirrors:1.0
    //
    public int
    active_seismogram_mirrors()
    {
        return _ob_delegate_.active_seismogram_mirrors();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/get_mirrored_seismograms:1.0
    //
    public Seismogram[]
    get_mirrored_seismograms()
    {
        return _ob_delegate_.get_mirrored_seismograms();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/get_factory_mirrors:1.0
    //
    public SeismogramFactory[]
    get_factory_mirrors()
    {
        return _ob_delegate_.get_factory_mirrors();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/stop_mirrors:1.0
    //
    public void
    stop_mirrors(SeismogramFactory[] mirrors)
    {
        _ob_delegate_.stop_mirrors(mirrors);
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/stop_mirroring:1.0
    //
    public void
    stop_mirroring()
    {
        _ob_delegate_.stop_mirroring();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/resume_mirroring:1.0
    //
    public void
    resume_mirroring()
    {
        _ob_delegate_.resume_mirroring();
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/ChannelMirrorAdmin/is_mirroring:1.0
    //
    public boolean
    is_mirroring()
    {
        return _ob_delegate_.is_mirroring();
    }
}
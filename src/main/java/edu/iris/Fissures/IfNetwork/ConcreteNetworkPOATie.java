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

package edu.iris.Fissures.IfNetwork;

//
// IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork:1.0
//
public class ConcreteNetworkPOATie extends ConcreteNetworkPOA
{
    private ConcreteNetworkOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    ConcreteNetworkPOATie(ConcreteNetworkOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    ConcreteNetworkPOATie(ConcreteNetworkOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public ConcreteNetworkOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(ConcreteNetworkOperations delegate)
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
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess/a_writeable:1.0
    //
    public ConcreteNetwork
    a_writeable()
    {
        return _ob_delegate_.a_writeable();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/deactivate:1.0
    //
    public void
    deactivate()
    {
        _ob_delegate_.deactivate();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/add_station:1.0
    //
    public void
    add_station(Station a_station,
                edu.iris.Fissures.AuditInfo[] audit_info)
        throws DuplicateStationId
    {
        _ob_delegate_.add_station(a_station,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/update_station:1.0
    //
    public void
    update_station(Station a_station,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws StationNotFound
    {
        _ob_delegate_.update_station(a_station,
                                     audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/deactivate_station:1.0
    //
    public void
    deactivate_station(StationId code,
                       edu.iris.Fissures.Time end_time,
                       edu.iris.Fissures.AuditInfo[] audit_info)
        throws StationNotFound
    {
        _ob_delegate_.deactivate_station(code,
                                         end_time,
                                         audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/delete_station:1.0
    //
    public void
    delete_station(StationId code,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws StationNotFound
    {
        _ob_delegate_.delete_station(code,
                                     audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/add_site:1.0
    //
    public void
    add_site(Site a_site,
             edu.iris.Fissures.AuditInfo[] audit_info)
        throws StationNotFound,
               DuplicateSiteId
    {
        _ob_delegate_.add_site(a_site,
                               audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/udpate_site:1.0
    //
    public void
    udpate_site(Site a_site,
                edu.iris.Fissures.AuditInfo[] audit_info)
        throws SiteNotFound
    {
        _ob_delegate_.udpate_site(a_site,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/deactivate_site:1.0
    //
    public void
    deactivate_site(SiteId site_id,
                    edu.iris.Fissures.Time end_time,
                    edu.iris.Fissures.AuditInfo[] audit_info)
        throws SiteNotFound
    {
        _ob_delegate_.deactivate_site(site_id,
                                      end_time,
                                      audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/delete_site:1.0
    //
    public void
    delete_site(SiteId site_id,
                edu.iris.Fissures.AuditInfo[] audit_info)
        throws SiteNotFound
    {
        _ob_delegate_.delete_site(site_id,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/add_channel:1.0
    //
    public void
    add_channel(Channel a_channel,
                Response the_response,
                Calibration[] the_calibrations,
                Clock the_clock,
                Sensor the_sensor,
                DataAcqSys das,
                TimeCorrection[] time_corrections,
                edu.iris.Fissures.AuditInfo[] audit_info)
        throws SiteNotFound,
               DuplicateChannelId
    {
        _ob_delegate_.add_channel(a_channel,
                                  the_response,
                                  the_calibrations,
                                  the_clock,
                                  the_sensor,
                                  das,
                                  time_corrections,
                                  audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/update_channel:1.0
    //
    public void
    update_channel(Channel a_channel,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.update_channel(a_channel,
                                     audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/deactivate_channel:1.0
    //
    public void
    deactivate_channel(ChannelId channel_id,
                       edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.deactivate_channel(channel_id,
                                         audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/delete_channel:1.0
    //
    public void
    delete_channel(ChannelId channel_id,
                   edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.delete_channel(channel_id,
                                     audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/update_clock:1.0
    //
    public void
    update_clock(ChannelId the_channel,
                 Clock new_clock,
                 edu.iris.Fissures.Time start_time,
                 edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.update_clock(the_channel,
                                   new_clock,
                                   start_time,
                                   audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/update_sensor:1.0
    //
    public void
    update_sensor(ChannelId the_channel,
                  Sensor new_sensor,
                  edu.iris.Fissures.Time start_time,
                  edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.update_sensor(the_channel,
                                    new_sensor,
                                    start_time,
                                    audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/update_response:1.0
    //
    public void
    update_response(ChannelId the_channel,
                    Response new_response,
                    edu.iris.Fissures.Time start_time,
                    edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.update_response(the_channel,
                                      new_response,
                                      start_time,
                                      audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/update_das:1.0
    //
    public void
    update_das(ChannelId the_channel,
               DataAcqSys new_das,
               edu.iris.Fissures.Time start_time,
               edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.update_das(the_channel,
                                 new_das,
                                 start_time,
                                 audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/add_calibration:1.0
    //
    public void
    add_calibration(ChannelId the_channel,
                    Calibration new_calibration,
                    edu.iris.Fissures.Time start_time,
                    edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.add_calibration(the_channel,
                                      new_calibration,
                                      start_time,
                                      audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetwork/add_time_correction:1.0
    //
    public void
    add_time_correction(ChannelId the_channel,
                        TimeCorrection new_correction,
                        edu.iris.Fissures.Time start_time,
                        edu.iris.Fissures.AuditInfo[] audit_info)
        throws ChannelNotFound
    {
        _ob_delegate_.add_time_correction(the_channel,
                                          new_correction,
                                          start_time,
                                          audit_info);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess/get_audit_trail_for_station:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail_for_station(StationId id)
        throws StationNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail_for_station(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/ConcreteNetworkAccess/get_audit_trail_for_site:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail_for_site(SiteId id)
        throws SiteNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail_for_site(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/get_attributes:1.0
    //
    public NetworkAttr
    get_attributes()
    {
        return _ob_delegate_.get_attributes();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_stations:1.0
    //
    public Station[]
    retrieve_stations()
    {
        return _ob_delegate_.retrieve_stations();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_for_station:1.0
    //
    public Channel[]
    retrieve_for_station(StationId id)
    {
        return _ob_delegate_.retrieve_for_station(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_grouping:1.0
    //
    public ChannelId[]
    retrieve_grouping(ChannelId id)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_grouping(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_groupings:1.0
    //
    public ChannelId[][]
    retrieve_groupings()
    {
        return _ob_delegate_.retrieve_groupings();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_channel:1.0
    //
    public Channel
    retrieve_channel(ChannelId id)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_channel(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_channels_by_code:1.0
    //
    public Channel[]
    retrieve_channels_by_code(String station_code,
                              String site_code,
                              String channel_code)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_channels_by_code(station_code,
                                                       site_code,
                                                       channel_code);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/locate_channels:1.0
    //
    public Channel[]
    locate_channels(edu.iris.Fissures.Area the_area,
                    SamplingRange sampling,
                    OrientationRange orientation)
    {
        return _ob_delegate_.locate_channels(the_area,
                                             sampling,
                                             orientation);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_instrumentation:1.0
    //
    public Instrumentation
    retrieve_instrumentation(ChannelId id,
                             edu.iris.Fissures.Time the_time)
        throws ChannelNotFound
    {
        return _ob_delegate_.retrieve_instrumentation(id,
                                                      the_time);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_calibrations:1.0
    //
    public Calibration[]
    retrieve_calibrations(ChannelId id,
                          edu.iris.Fissures.TimeRange the_time)
        throws ChannelNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.retrieve_calibrations(id,
                                                   the_time);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_time_corrections:1.0
    //
    public TimeCorrection[]
    retrieve_time_corrections(ChannelId id,
                              edu.iris.Fissures.TimeRange time_range)
        throws ChannelNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.retrieve_time_corrections(id,
                                                       time_range);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/retrieve_all_channels:1.0
    //
    public ChannelId[]
    retrieve_all_channels(int seq_max,
                          ChannelIdIterHolder iter)
    {
        return _ob_delegate_.retrieve_all_channels(seq_max,
                                                   iter);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkAccess/get_audit_trail_for_channel:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail_for_channel(ChannelId id)
        throws ChannelNotFound,
               edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_audit_trail_for_channel(id);
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
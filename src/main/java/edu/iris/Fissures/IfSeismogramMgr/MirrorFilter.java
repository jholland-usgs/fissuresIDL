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
// IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFilter:1.0
//
/** MirrorFilter elements will allow for wildcard characters
 *? for a single character, and * for 0 or more characters
 **/

final public class MirrorFilter implements org.omg.CORBA.portable.IDLEntity
{
    public
    MirrorFilter()
    {
    }

    public
    MirrorFilter(String network_name,
                 String station_name,
                 String site_id,
                 String channel_code)
    {
        this.network_name = network_name;
        this.station_name = station_name;
        this.site_id = site_id;
        this.channel_code = channel_code;
    }

    public String network_name;
    public String station_name;
    public String site_id;
    public String channel_code;
}

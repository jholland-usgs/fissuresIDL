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
// IDL:iris.edu/Fissures/IfNetwork/DuplicateSiteId:1.0
//
/***/

final public class DuplicateSiteId extends org.omg.CORBA.UserException
{
    public
    DuplicateSiteId()
    {
        super(DuplicateSiteIdHelper.id());
    }

    public
    DuplicateSiteId(SiteId site)
    {
        super(DuplicateSiteIdHelper.id());
        this.site = site;
    }

    public
    DuplicateSiteId(String _reason,
                    SiteId site)
    {
        super(DuplicateSiteIdHelper.id() + " " + _reason);
        this.site = site;
    }

    public SiteId site;
}
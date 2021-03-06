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

package edu.iris.Fissures.IfPickMgr;

//
// IDL:iris.edu/Fissures/IfPickMgr/UnknownPickGroup:1.0
//
/***/

final public class UnknownPickGroup extends org.omg.CORBA.UserException
{
    public
    UnknownPickGroup()
    {
        super(UnknownPickGroupHelper.id());
    }

    public
    UnknownPickGroup(String id)
    {
        super(UnknownPickGroupHelper.id());
        this.id = id;
    }

    public
    UnknownPickGroup(String _reason,
                     String id)
    {
        super(UnknownPickGroupHelper.id() + " " + _reason);
        this.id = id;
    }

    public String id;
}

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
// IDL:iris.edu/Fissures/IfNetwork/NetworkNotFound:1.0
//
/***/

final public class NetworkNotFound extends org.omg.CORBA.UserException
{
    public
    NetworkNotFound()
    {
        super(NetworkNotFoundHelper.id());
    }

    public
    NetworkNotFound(String _reason)
    {
        super(NetworkNotFoundHelper.id() + " " + _reason);
    }
}
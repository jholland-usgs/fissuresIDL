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
// IDL:iris.edu/Fissures/IfEvent/EventFactory:1.0
//
/**
 * The EventFactory interface provides operations to create events
 **/

public interface EventFactoryOperations extends EventMgrOperations
{
    //
    // IDL:iris.edu/Fissures/IfEvent/EventFactory/create:1.0
    //
    /***/

    Event
    create(EventAttr attributes,
           edu.iris.Fissures.AuditInfo[] audit_info);
}
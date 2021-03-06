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
/**
 * MirrorFactory - remote clients will provide this interface to
 * enable the the mirroring service to mirror to the client and
 * inform the client that mirroring has been halted.
 **/

public interface MirrorFactoryOperations
{
    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory/a_factory:1.0
    //
    /***/

    SeismogramFactory
    a_factory();

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory/mirroring_stopped:1.0
    //
    /** If the Mirroring service stops mirroring the client will
     * receive this operation. The unregistered will tell the client
     * whether or not its registrations is sill active and may be
     * restarted or not
     **/

    void
    mirroring_stopped(String a_id,
                      boolean unregistered);
}

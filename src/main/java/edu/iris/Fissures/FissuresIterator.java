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

package edu.iris.Fissures;

//
// IDL:iris.edu/Fissures/FissuresIterator:1.0
//
/**     Do provide a common Iterator operation a */

public interface FissuresIterator extends org.omg.CORBA.portable.IDLEntity
{
    //
    // IDL:iris.edu/Fissures/FissuresIterator/how_many:1.0
    //
    /** Returns the count of elements remain in the iterator */

    int
    how_many();

    //
    // IDL:iris.edu/Fissures/FissuresIterator/reset:1.0
    //
    /** Reset the iterator to the beginning of the element list */

    void
    reset();

    //
    // IDL:iris.edu/Fissures/FissuresIterator/destroy:1.0
    //
    /** Destroy the iterator and drop all resources it holds */

    void
    destroy();
}
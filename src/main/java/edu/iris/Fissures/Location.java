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
// IDL:iris.edu/Fissures/Location:1.0
//
/** A location on or in the earth. */

final public class Location implements org.omg.CORBA.portable.IDLEntity
{
    public
    Location()
    {
    }

    public
    Location(float latitude,
             float longitude,
             Quantity elevation,
             Quantity depth,
             LocationType type)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.depth = depth;
        this.type = type;
    }

    public float latitude;
    public float longitude;
    public Quantity elevation;
    public Quantity depth;
    public LocationType type;
}
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

package edu.iris.Fissures.IfService;

//
// IDL:iris.edu/Fissures/IfService/ServiceOption:1.0
//
/***/

final public class ServiceOption implements org.omg.CORBA.portable.IDLEntity
{
    public
    ServiceOption()
    {
    }

    public
    ServiceOption(String name,
                  String description,
                  String type,
                  String[] allowed_values)
    {
        this.name = name;
        this.description = description;
        this.type = type;
        this.allowed_values = allowed_values;
    }

    public String name;
    public String description;
    public String type;
    public String[] allowed_values;
}

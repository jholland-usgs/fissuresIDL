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

package edu.iris.Fissures.IfParameterMgr;

//
// IDL:iris.edu/Fissures/IfParameterMgr/ParmSetAttr:1.0
//
/***/

final public class ParmSetAttr implements org.omg.CORBA.portable.IDLEntity
{
    public
    ParmSetAttr()
    {
    }

    public
    ParmSetAttr(String name,
                String description,
                String creator)
    {
        this.name = name;
        this.description = description;
        this.creator = creator;
    }

    public String name;
    public String description;
    public String creator;
}

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

package edu.iris.Fissures.IfRealTimeCollector;

//
// IDL:iris.edu/Fissures/IfRealTimeCollector/DasError:1.0
//
/***/

final public class DasError implements org.omg.CORBA.portable.IDLEntity
{
    public
    DasError()
    {
    }

    public
    DasError(String error_num,
             String error_msg)
    {
        this.error_num = error_num;
        this.error_msg = error_msg;
    }

    public String error_num;
    public String error_msg;
}
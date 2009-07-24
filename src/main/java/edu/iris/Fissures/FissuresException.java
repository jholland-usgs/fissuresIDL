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
// IDL:iris.edu/Fissures/FissuresException:1.0
//
/** The FissuresException is defined as a general exception to be
 *used only when a more specific exceptions do not exist for the
 *occuring exception.
 **/

final public class FissuresException extends org.omg.CORBA.UserException
{
    public
    FissuresException()
    {
        super(FissuresExceptionHelper.id());
    }

    public
    FissuresException(Error the_error)
    {
        super(FissuresExceptionHelper.id());
        this.the_error = the_error;
    }

    public
    FissuresException(String _reason,
                      Error the_error)
    {
        super(FissuresExceptionHelper.id() + " " + _reason);
        this.the_error = the_error;
    }

    public Error the_error;
}
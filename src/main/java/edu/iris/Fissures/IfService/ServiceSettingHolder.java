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
// IDL:iris.edu/Fissures/IfService/ServiceSetting:1.0
//
final public class ServiceSettingHolder implements org.omg.CORBA.portable.Streamable
{
    public ServiceSetting value;

    public
    ServiceSettingHolder()
    {
    }

    public
    ServiceSettingHolder(ServiceSetting initial)
    {
        value = initial;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        value = ServiceSettingHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        ServiceSettingHelper.write(out, value);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return ServiceSettingHelper.type();
    }
}

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
// IDL:iris.edu/Fissures/IfService/Service:1.0
//
public class _ServiceStub extends org.omg.CORBA.portable.ObjectImpl
                          implements Service
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfService/Service:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = Service.class;

    //
    // IDL:iris.edu/Fissures/IfService/Service/get_configuration_options:1.0
    //
    public ServiceOption[]
    get_configuration_options()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_configuration_options", true);
                    in = _invoke(out);
                    ServiceOption[] _ob_r = ServiceOptionSeqHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_configuration_options", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                Service _ob_self = (Service)_ob_so.servant;
                try
                {
                    return _ob_self.get_configuration_options();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfService/Service/get_default_configuration:1.0
    //
    public ServiceSetting[]
    get_default_configuration()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_default_configuration", true);
                    in = _invoke(out);
                    ServiceSetting[] _ob_r = ServiceConfigurationHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_default_configuration", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                Service _ob_self = (Service)_ob_so.servant;
                try
                {
                    return _ob_self.get_default_configuration();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfService/Service/get_configuration:1.0
    //
    public ServiceSetting[]
    get_configuration(String _ob_a0)
        throws UnknownConfiguration
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_configuration", true);
                    ConfigurationIdHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    ServiceSetting[] _ob_r = ServiceConfigurationHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(UnknownConfigurationHelper.id()))
                        throw UnknownConfigurationHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_configuration", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                Service _ob_self = (Service)_ob_so.servant;
                try
                {
                    return _ob_self.get_configuration(_ob_a0);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfService/Service/get_setting_for:1.0
    //
    public ServiceSetting
    get_setting_for(String _ob_a0)
        throws UnknownOption
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_setting_for", true);
                    out.write_string(_ob_a0);
                    in = _invoke(out);
                    ServiceSetting _ob_r = ServiceSettingHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(UnknownOptionHelper.id()))
                        throw UnknownOptionHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_setting_for", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                Service _ob_self = (Service)_ob_so.servant;
                try
                {
                    return _ob_self.get_setting_for(_ob_a0);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfService/Service/set_configuration:1.0
    //
    public String
    set_configuration(ServiceSetting[] _ob_a0)
        throws UnknownOption,
               InvalidValue
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("set_configuration", true);
                    ServiceConfigurationHelper.write(out, _ob_a0);
                    in = _invoke(out);
                    String _ob_r = ConfigurationIdHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(UnknownOptionHelper.id()))
                        throw UnknownOptionHelper.read(in);
                    if(_ob_id.equals(InvalidValueHelper.id()))
                        throw InvalidValueHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("set_configuration", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                Service _ob_self = (Service)_ob_so.servant;
                try
                {
                    return _ob_self.set_configuration(_ob_a0);
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfService/Service/reset_to_default:1.0
    //
    public String
    reset_to_default()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("reset_to_default", true);
                    in = _invoke(out);
                    String _ob_r = ConfigurationIdHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("reset_to_default", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                Service _ob_self = (Service)_ob_so.servant;
                try
                {
                    return _ob_self.reset_to_default();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}

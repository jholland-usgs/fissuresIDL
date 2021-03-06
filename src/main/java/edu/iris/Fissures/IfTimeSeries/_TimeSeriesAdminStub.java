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

package edu.iris.Fissures.IfTimeSeries;

//
// IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin:1.0
//
public class _TimeSeriesAdminStub extends org.omg.CORBA.portable.ObjectImpl
                                  implements TimeSeriesAdmin
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = TimeSeriesAdmin.class;

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/close:1.0
    //
    public void
    close()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("close", true);
                    in = _invoke(out);
                    return;
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("close", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.close();
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_longs:1.0
    //
    public void
    append_longs(int _ob_a0,
                 int[] _ob_a1,
                 edu.iris.Fissures.AuditInfo[] _ob_a2)
        throws SequenceOutOfOrder
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("append_longs", true);
                    out.write_long(_ob_a0);
                    LongSeqHelper.write(out, _ob_a1);
                    edu.iris.Fissures.AuditInfoOptHelper.write(out, _ob_a2);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(SequenceOutOfOrderHelper.id()))
                        throw SequenceOutOfOrderHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("append_longs", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.append_longs(_ob_a0, _ob_a1, _ob_a2);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_shorts:1.0
    //
    public void
    append_shorts(int _ob_a0,
                  short[] _ob_a1,
                  edu.iris.Fissures.AuditInfo[] _ob_a2)
        throws SequenceOutOfOrder
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("append_shorts", true);
                    out.write_long(_ob_a0);
                    ShortSeqHelper.write(out, _ob_a1);
                    edu.iris.Fissures.AuditInfoOptHelper.write(out, _ob_a2);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(SequenceOutOfOrderHelper.id()))
                        throw SequenceOutOfOrderHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("append_shorts", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.append_shorts(_ob_a0, _ob_a1, _ob_a2);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_floats:1.0
    //
    public void
    append_floats(int _ob_a0,
                  float[] _ob_a1,
                  edu.iris.Fissures.AuditInfo[] _ob_a2)
        throws SequenceOutOfOrder
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("append_floats", true);
                    out.write_long(_ob_a0);
                    FloatSeqHelper.write(out, _ob_a1);
                    edu.iris.Fissures.AuditInfoOptHelper.write(out, _ob_a2);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(SequenceOutOfOrderHelper.id()))
                        throw SequenceOutOfOrderHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("append_floats", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.append_floats(_ob_a0, _ob_a1, _ob_a2);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_doubles:1.0
    //
    public void
    append_doubles(int _ob_a0,
                   double[] _ob_a1,
                   edu.iris.Fissures.AuditInfo[] _ob_a2)
        throws SequenceOutOfOrder
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("append_doubles", true);
                    out.write_long(_ob_a0);
                    DoubleSeqHelper.write(out, _ob_a1);
                    edu.iris.Fissures.AuditInfoOptHelper.write(out, _ob_a2);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(SequenceOutOfOrderHelper.id()))
                        throw SequenceOutOfOrderHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("append_doubles", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.append_doubles(_ob_a0, _ob_a1, _ob_a2);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_encoded_seq:1.0
    //
    public void
    append_encoded_seq(int _ob_a0,
                       EncodedData[] _ob_a1,
                       edu.iris.Fissures.AuditInfo[] _ob_a2)
        throws SequenceOutOfOrder
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("append_encoded_seq", true);
                    out.write_long(_ob_a0);
                    EncodedSeqHelper.write(out, _ob_a1);
                    edu.iris.Fissures.AuditInfoOptHelper.write(out, _ob_a2);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(SequenceOutOfOrderHelper.id()))
                        throw SequenceOutOfOrderHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("append_encoded_seq", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.append_encoded_seq(_ob_a0, _ob_a1, _ob_a2);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin/append_encoded:1.0
    //
    public void
    append_encoded(int _ob_a0,
                   EncodedData _ob_a1,
                   edu.iris.Fissures.AuditInfo[] _ob_a2)
        throws SequenceOutOfOrder
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("append_encoded", true);
                    out.write_long(_ob_a0);
                    EncodedDataHelper.write(out, _ob_a1);
                    edu.iris.Fissures.AuditInfoOptHelper.write(out, _ob_a2);
                    in = _invoke(out);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    in = _ob_aex.getInputStream();

                    if(_ob_id.equals(SequenceOutOfOrderHelper.id()))
                        throw SequenceOutOfOrderHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("append_encoded", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                TimeSeriesAdmin _ob_self = (TimeSeriesAdmin)_ob_so.servant;
                try
                {
                    _ob_self.append_encoded(_ob_a0, _ob_a1, _ob_a2);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}

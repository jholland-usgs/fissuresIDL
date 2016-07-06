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
// IDL:iris.edu/Fissures/IfSeismogramMgr/Seismogram:1.0
//
public abstract class SeismogramPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               SeismogramOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfSeismogramMgr/Seismogram:1.0",
        "IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramAccess:1.0",
        "IDL:iris.edu/Fissures/IfSeismogramMgr/SeismogramComponent:1.0",
        "IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAccess:1.0",
        "IDL:iris.edu/Fissures/AuditSystemAccess:1.0",
        "IDL:iris.edu/Fissures/IfTimeSeries/TimeSeriesAdmin:1.0"
    };

    public Seismogram
    _this()
    {
        return SeismogramHelper.narrow(super._this_object());
    }

    public Seismogram
    _this(org.omg.CORBA.ORB orb)
    {
        return SeismogramHelper.narrow(super._this_object(orb));
    }

    public String[]
    _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return _ob_ids_;
    }

    public org.omg.CORBA.portable.OutputStream
    _invoke(String opName,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler handler)
    {
        final String[] _ob_names =
        {
            "_get_a_factory",
            "_get_a_finder",
            "_get_a_writeable",
            "_get_parm_svc",
            "append_doubles",
            "append_encoded",
            "append_encoded_seq",
            "append_floats",
            "append_longs",
            "append_shorts",
            "can_convert_to_double",
            "can_convert_to_float",
            "can_convert_to_long",
            "can_convert_to_short",
            "close",
            "destroy",
            "get_as_doubles",
            "get_as_encoded",
            "get_as_floats",
            "get_as_longs",
            "get_as_shorts",
            "get_attributes",
            "get_audit_trail",
            "get_range_as_doubles",
            "get_range_as_encoded",
            "get_range_as_floats",
            "get_range_as_longs",
            "get_range_as_shorts",
            "is_closed",
            "is_double",
            "is_encoded",
            "is_float",
            "is_long",
            "is_short",
            "process_time_corrections",
            "set_attributes"
        };

        int _ob_left = 0;
        int _ob_right = _ob_names.length;
        int _ob_index = -1;

        while(_ob_left < _ob_right)
        {
            int _ob_m = (_ob_left + _ob_right) / 2;
            int _ob_res = _ob_names[_ob_m].compareTo(opName);
            if(_ob_res == 0)
            {
                _ob_index = _ob_m;
                break;
            }
            else if(_ob_res > 0)
                _ob_right = _ob_m;
            else
                _ob_left = _ob_m + 1;
        }

        switch(_ob_index)
        {
        case 0: // _get_a_factory
            return _OB_att_get_a_factory(in, handler);

        case 1: // _get_a_finder
            return _OB_att_get_a_finder(in, handler);

        case 2: // _get_a_writeable
            return _OB_att_get_a_writeable(in, handler);

        case 3: // _get_parm_svc
            return _OB_att_get_parm_svc(in, handler);

        case 4: // append_doubles
            return _OB_op_append_doubles(in, handler);

        case 5: // append_encoded
            return _OB_op_append_encoded(in, handler);

        case 6: // append_encoded_seq
            return _OB_op_append_encoded_seq(in, handler);

        case 7: // append_floats
            return _OB_op_append_floats(in, handler);

        case 8: // append_longs
            return _OB_op_append_longs(in, handler);

        case 9: // append_shorts
            return _OB_op_append_shorts(in, handler);

        case 10: // can_convert_to_double
            return _OB_op_can_convert_to_double(in, handler);

        case 11: // can_convert_to_float
            return _OB_op_can_convert_to_float(in, handler);

        case 12: // can_convert_to_long
            return _OB_op_can_convert_to_long(in, handler);

        case 13: // can_convert_to_short
            return _OB_op_can_convert_to_short(in, handler);

        case 14: // close
            return _OB_op_close(in, handler);

        case 15: // destroy
            return _OB_op_destroy(in, handler);

        case 16: // get_as_doubles
            return _OB_op_get_as_doubles(in, handler);

        case 17: // get_as_encoded
            return _OB_op_get_as_encoded(in, handler);

        case 18: // get_as_floats
            return _OB_op_get_as_floats(in, handler);

        case 19: // get_as_longs
            return _OB_op_get_as_longs(in, handler);

        case 20: // get_as_shorts
            return _OB_op_get_as_shorts(in, handler);

        case 21: // get_attributes
            return _OB_op_get_attributes(in, handler);

        case 22: // get_audit_trail
            return _OB_op_get_audit_trail(in, handler);

        case 23: // get_range_as_doubles
            return _OB_op_get_range_as_doubles(in, handler);

        case 24: // get_range_as_encoded
            return _OB_op_get_range_as_encoded(in, handler);

        case 25: // get_range_as_floats
            return _OB_op_get_range_as_floats(in, handler);

        case 26: // get_range_as_longs
            return _OB_op_get_range_as_longs(in, handler);

        case 27: // get_range_as_shorts
            return _OB_op_get_range_as_shorts(in, handler);

        case 28: // is_closed
            return _OB_op_is_closed(in, handler);

        case 29: // is_double
            return _OB_op_is_double(in, handler);

        case 30: // is_encoded
            return _OB_op_is_encoded(in, handler);

        case 31: // is_float
            return _OB_op_is_float(in, handler);

        case 32: // is_long
            return _OB_op_is_long(in, handler);

        case 33: // is_short
            return _OB_op_is_short(in, handler);

        case 34: // process_time_corrections
            return _OB_op_process_time_corrections(in, handler);

        case 35: // set_attributes
            return _OB_op_set_attributes(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_factory(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        SeismogramFactory _ob_r = a_factory();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        SeismogramFactoryHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_finder(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        SeismogramFinder _ob_r = a_finder();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        SeismogramFinderHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_writeable(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        Seismogram _ob_r = a_writeable();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        SeismogramHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_parm_svc(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        edu.iris.Fissures.IfParameterMgr.ParameterComponent _ob_r = parm_svc();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        edu.iris.Fissures.IfParameterMgr.ParameterComponentHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_append_doubles(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int _ob_a0 = in.read_long();
            double[] _ob_a1 = edu.iris.Fissures.IfTimeSeries.DoubleSeqHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            append_doubles(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrder _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrderHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_append_encoded(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int _ob_a0 = in.read_long();
            edu.iris.Fissures.IfTimeSeries.EncodedData _ob_a1 = edu.iris.Fissures.IfTimeSeries.EncodedDataHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            append_encoded(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrder _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrderHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_append_encoded_seq(org.omg.CORBA.portable.InputStream in,
                              org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int _ob_a0 = in.read_long();
            edu.iris.Fissures.IfTimeSeries.EncodedData[] _ob_a1 = edu.iris.Fissures.IfTimeSeries.EncodedSeqHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            append_encoded_seq(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrder _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrderHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_append_floats(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int _ob_a0 = in.read_long();
            float[] _ob_a1 = edu.iris.Fissures.IfTimeSeries.FloatSeqHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            append_floats(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrder _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrderHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_append_longs(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int _ob_a0 = in.read_long();
            int[] _ob_a1 = edu.iris.Fissures.IfTimeSeries.LongSeqHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            append_longs(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrder _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrderHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_append_shorts(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int _ob_a0 = in.read_long();
            short[] _ob_a1 = edu.iris.Fissures.IfTimeSeries.ShortSeqHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a2 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            append_shorts(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrder _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.IfTimeSeries.SequenceOutOfOrderHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_can_convert_to_double(org.omg.CORBA.portable.InputStream in,
                                 org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = can_convert_to_double();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_can_convert_to_float(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = can_convert_to_float();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_can_convert_to_long(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = can_convert_to_long();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_can_convert_to_short(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = can_convert_to_short();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_close(org.omg.CORBA.portable.InputStream in,
                 org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        close();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_destroy(org.omg.CORBA.portable.InputStream in,
                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        destroy();
        out = handler.createReply();
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_as_doubles(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            double[] _ob_r = get_as_doubles();
            out = handler.createReply();
            edu.iris.Fissures.IfTimeSeries.DoubleSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_as_encoded(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfTimeSeries.EncodedData[] _ob_r = get_as_encoded();
            out = handler.createReply();
            edu.iris.Fissures.IfTimeSeries.EncodedSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_as_floats(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            float[] _ob_r = get_as_floats();
            out = handler.createReply();
            edu.iris.Fissures.IfTimeSeries.FloatSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_as_longs(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            int[] _ob_r = get_as_longs();
            out = handler.createReply();
            edu.iris.Fissures.IfTimeSeries.LongSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_as_shorts(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            short[] _ob_r = get_as_shorts();
            out = handler.createReply();
            edu.iris.Fissures.IfTimeSeries.ShortSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_attributes(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        edu.iris.Fissures.IfSeismogramDC.SeismogramAttr _ob_r = get_attributes();
        out = handler.createReply();
        edu.iris.Fissures.IfSeismogramDC.SeismogramAttrHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_audit_trail(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.AuditElement[] _ob_r = get_audit_trail();
            out = handler.createReply();
            edu.iris.Fissures.AuditTrailHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_range_as_doubles(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.Quantity _ob_a0 = edu.iris.Fissures.TimeIntervalHelper.read(in);
            double[] _ob_r = get_range_as_doubles(_ob_a0);
            out = handler.createReply();
            DoubleSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_range_as_encoded(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.Quantity _ob_a0 = edu.iris.Fissures.TimeIntervalHelper.read(in);
            edu.iris.Fissures.IfTimeSeries.EncodedData[] _ob_r = get_range_as_encoded(_ob_a0);
            out = handler.createReply();
            EncodedDataSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_range_as_floats(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.Quantity _ob_a0 = edu.iris.Fissures.TimeIntervalHelper.read(in);
            float[] _ob_r = get_range_as_floats(_ob_a0);
            out = handler.createReply();
            FloatSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_range_as_longs(org.omg.CORBA.portable.InputStream in,
                              org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.Quantity _ob_a0 = edu.iris.Fissures.TimeIntervalHelper.read(in);
            int[] _ob_r = get_range_as_longs(_ob_a0);
            out = handler.createReply();
            LongSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_range_as_shorts(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.Quantity _ob_a0 = edu.iris.Fissures.TimeIntervalHelper.read(in);
            short[] _ob_r = get_range_as_shorts(_ob_a0);
            out = handler.createReply();
            ShortSeqHelper.write(out, _ob_r);
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_closed(org.omg.CORBA.portable.InputStream in,
                     org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_closed();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_double(org.omg.CORBA.portable.InputStream in,
                     org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_double();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_encoded(org.omg.CORBA.portable.InputStream in,
                      org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_encoded();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_float(org.omg.CORBA.portable.InputStream in,
                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_float();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_long(org.omg.CORBA.portable.InputStream in,
                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_long();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_is_short(org.omg.CORBA.portable.InputStream in,
                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = is_short();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_process_time_corrections(org.omg.CORBA.portable.InputStream in,
                                    org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.AuditInfo[] _ob_a0 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            process_time_corrections(_ob_a0);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_set_attributes(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfSeismogramDC.SeismogramAttr _ob_a0 = edu.iris.Fissures.IfSeismogramDC.SeismogramAttrHelper.read(in);
            edu.iris.Fissures.AuditInfo[] _ob_a1 = edu.iris.Fissures.AuditInfoOptHelper.read(in);
            set_attributes(_ob_a0, _ob_a1);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.FissuresException _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.FissuresExceptionHelper.write(out, _ob_ex);
        }
        return out;
    }
}
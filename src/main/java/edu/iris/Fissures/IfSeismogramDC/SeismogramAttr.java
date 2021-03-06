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

package edu.iris.Fissures.IfSeismogramDC;

//
// IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr:1.0
//
/***/

public abstract class SeismogramAttr implements org.omg.CORBA.portable.StreamableValue
{
    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/id:1.0
    //
    /***/

    protected String id;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/properties:1.0
    //
    /***/

    public Property[] properties;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/begin_time:1.0
    //
    /***/

    public edu.iris.Fissures.Time begin_time;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/num_points:1.0
    //
    /***/

    public int num_points;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/sampling_info:1.0
    //
    /***/

    public edu.iris.Fissures.Sampling sampling_info;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/y_unit:1.0
    //
    /***/

    public edu.iris.Fissures.Unit y_unit;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/channel_id:1.0
    //
    /***/

    public edu.iris.Fissures.IfNetwork.ChannelId channel_id;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/parm_ids:1.0
    //
    /***/

    public edu.iris.Fissures.IfParameterMgr.ParameterRef[] parm_ids;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/time_corrections:1.0
    //
    /** These last two items deal with time corrections.<br>
     *the time adjustments that have been applied to the begin time. */

    public edu.iris.Fissures.Quantity[] time_corrections;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/sample_rate_history:1.0
    //
    /** Sampling rate changed that have been applied */

    public edu.iris.Fissures.Sampling[] sample_rate_history;

    //
    // IDL:iris.edu/Fissures/IfSeismogramDC/SeismogramAttr/get_id:1.0
    //
    /***/

    public abstract String
    get_id();

    private static String[] _OB_truncatableIds_ =
    {
        SeismogramAttrHelper.id()
    };

    public String[]
    _truncatable_ids()
    {
        return _OB_truncatableIds_;
    }

    public void
    _read(org.omg.CORBA.portable.InputStream in)
    {
        id = SeismogramIdHelper.read(in);
        properties = PropertySeqHelper.read(in);
        begin_time = edu.iris.Fissures.TimeHelper.read(in);
        num_points = in.read_long();
        sampling_info = edu.iris.Fissures.SamplingHelper.read(in);
        y_unit = edu.iris.Fissures.UnitHelper.read(in);
        channel_id = ChannelIdHelper.read(in);
        int len0 = in.read_ulong();
        parm_ids = new edu.iris.Fissures.IfParameterMgr.ParameterRef[len0];
        for(int i0 = 0 ; i0 < len0 ; i0++)
            parm_ids[i0] = ParameterRefHelper.read(in);
        time_corrections = edu.iris.Fissures.TimeIntervalSeqHelper.read(in);
        sample_rate_history = edu.iris.Fissures.SamplingSeqHelper.read(in);
    }

    public void
    _write(org.omg.CORBA.portable.OutputStream out)
    {
        SeismogramIdHelper.write(out, id);
        PropertySeqHelper.write(out, properties);
        edu.iris.Fissures.TimeHelper.write(out, begin_time);
        out.write_long(num_points);
        edu.iris.Fissures.SamplingHelper.write(out, sampling_info);
        edu.iris.Fissures.UnitHelper.write(out, y_unit);
        ChannelIdHelper.write(out, channel_id);
        int len0 = parm_ids.length;
        out.write_ulong(len0);
        for(int i0 = 0 ; i0 < len0 ; i0++)
            ParameterRefHelper.write(out, parm_ids[i0]);
        edu.iris.Fissures.TimeIntervalSeqHelper.write(out, time_corrections);
        edu.iris.Fissures.SamplingSeqHelper.write(out, sample_rate_history);
    }

    public org.omg.CORBA.TypeCode
    _type()
    {
        return SeismogramAttrHelper.type();
    }
}

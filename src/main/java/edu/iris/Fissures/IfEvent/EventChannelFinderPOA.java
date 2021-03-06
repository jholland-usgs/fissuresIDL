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

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/EventChannelFinder:1.0
//
public abstract class EventChannelFinderPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               EventChannelFinderOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfEvent/EventChannelFinder:1.0",
    };

    public EventChannelFinder
    _this()
    {
        return EventChannelFinderHelper.narrow(super._this_object());
    }

    public EventChannelFinder
    _this(org.omg.CORBA.ORB orb)
    {
        return EventChannelFinderHelper.narrow(super._this_object(orb));
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
            "list_channels",
            "retrieve_channel"
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
        case 0: // list_channels
            return _OB_op_list_channels(in, handler);

        case 1: // retrieve_channel
            return _OB_op_retrieve_channel(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_list_channels(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        EventChannelDefinition[] _ob_r = list_channels();
        out = handler.createReply();
        EventChannelDefinitionSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_retrieve_channel(org.omg.CORBA.portable.InputStream in,
                            org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String _ob_a0 = EventChannelNameHelper.read(in);
            org.omg.CosEventChannelAdmin.ConsumerAdmin _ob_r = retrieve_channel(_ob_a0);
            out = handler.createReply();
            org.omg.CosEventChannelAdmin.ConsumerAdminHelper.write(out, _ob_r);
        }
        catch(NotFound _ob_ex)
        {
            out = handler.createExceptionReply();
            NotFoundHelper.write(out, _ob_ex);
        }
        return out;
    }
}

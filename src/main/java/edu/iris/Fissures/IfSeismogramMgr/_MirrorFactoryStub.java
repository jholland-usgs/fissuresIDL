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
// IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory:1.0
//
public class _MirrorFactoryStub extends org.omg.CORBA.portable.ObjectImpl
                                implements MirrorFactory
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory:1.0",
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = MirrorFactoryOperations.class;

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory/a_factory:1.0
    //
    public SeismogramFactory
    a_factory()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_factory", true);
                    in = _invoke(out);
                    SeismogramFactory _ob_r = SeismogramFactoryHelper.read(in);
                    return _ob_r;
                }
                catch(org.omg.CORBA.portable.RemarshalException _ob_ex)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _ob_aex)
                {
                    final String _ob_id = _ob_aex.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_factory", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                MirrorFactoryOperations _ob_self = (MirrorFactoryOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_factory();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfSeismogramMgr/MirrorFactory/mirroring_stopped:1.0
    //
    public void
    mirroring_stopped(String _ob_a0,
                      boolean _ob_a1)
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("mirroring_stopped", true);
                    MirrorIdHelper.write(out, _ob_a0);
                    out.write_boolean(_ob_a1);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("mirroring_stopped", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                MirrorFactoryOperations _ob_self = (MirrorFactoryOperations)_ob_so.servant;
                try
                {
                    _ob_self.mirroring_stopped(_ob_a0, _ob_a1);
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
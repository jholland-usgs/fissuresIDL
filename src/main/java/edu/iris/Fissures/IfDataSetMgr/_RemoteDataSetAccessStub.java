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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSetAccess:1.0
//
public class _RemoteDataSetAccessStub extends org.omg.CORBA.portable.ObjectImpl
                                      implements RemoteDataSetAccess
{
    private static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfDataSetMgr/RemoteDataSetAccess:1.0",
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess:1.0",
        "IDL:iris.edu/Fissures/AuditSystemAccess:1.0",
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0"
    };

    public String[]
    _ids()
    {
        return _ob_ids_;
    }

    final public static java.lang.Class _ob_opsClass = RemoteDataSetAccessOperations.class;

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/a_writeable:1.0
    //
    public DataSet
    a_writeable()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_writeable", true);
                    in = _invoke(out);
                    DataSet _ob_r = DataSetHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_writeable", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    DataSet _ob_r = _ob_self.a_writeable();
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    DataSetHelper.write(_ob_out, _ob_r);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    _ob_r = DataSetHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/parm_svc:1.0
    //
    public edu.iris.Fissures.IfParameterMgr.ParameterComponent
    parm_svc()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_parm_svc", true);
                    in = _invoke(out);
                    edu.iris.Fissures.IfParameterMgr.ParameterComponent _ob_r = edu.iris.Fissures.IfParameterMgr.ParameterComponentHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("parm_svc", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    return _ob_self.parm_svc();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_finder:1.0
    //
    public DataSetFinder
    a_finder()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("_get_a_finder", true);
                    in = _invoke(out);
                    DataSetFinder _ob_r = DataSetFinderHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("a_finder", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    return _ob_self.a_finder();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_factory:1.0
    //
    public DataSetFactory
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
                    DataSetFactory _ob_r = DataSetFactoryHelper.read(in);
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
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
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
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/localize:1.0
    //
    public LocalDataSet
    localize()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("localize", true);
                    in = _invoke(out);
                    LocalDataSet _ob_r = LocalDataSetHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("localize", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    LocalDataSet _ob_r = _ob_self.localize();
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    LocalDataSetHelper.write(_ob_out, _ob_r);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    _ob_r = LocalDataSetHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_attributes:1.0
    //
    public DataSetAttr
    get_attributes()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_attributes", true);
                    in = _invoke(out);
                    DataSetAttr _ob_r = DataSetAttrHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_attributes", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_attributes();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_datasets:1.0
    //
    public DataSetAccess[]
    get_datasets()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_datasets", true);
                    in = _invoke(out);
                    DataSetAccess[] _ob_r = DataSetAccessSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_datasets", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    DataSetAccess[] _ob_r = _ob_self.get_datasets();
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        DataSetAccessHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new DataSetAccess[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = DataSetAccessHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_motion_vectors:1.0
    //
    public MotionVectorNode[]
    get_motion_vectors()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_motion_vectors", true);
                    in = _invoke(out);
                    MotionVectorNode[] _ob_r = MotionVectorNodeSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_motion_vectors", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    MotionVectorNode[] _ob_r = _ob_self.get_motion_vectors();
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        MotionVectorNodeHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new MotionVectorNode[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = MotionVectorNodeHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAccess/get_seismograms:1.0
    //
    public SeismogramNode[]
    get_seismograms()
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_seismograms", true);
                    in = _invoke(out);
                    SeismogramNode[] _ob_r = SeismogramNodeSeqHelper.read(in);
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
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_seismograms", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    SeismogramNode[] _ob_r = _ob_self.get_seismograms();
                    org.omg.CORBA.portable.OutputStream _ob_out = _orb().create_output_stream();
                    int len0 = _ob_r.length;
                    _ob_out.write_ulong(len0);
                    for(int i0 = 0 ; i0 < len0 ; i0++)
                        SeismogramNodeHelper.write(_ob_out, _ob_r[i0]);
                    org.omg.CORBA.portable.InputStream _ob_in = _ob_out.create_input_stream();
                    int len1 = _ob_in.read_ulong();
                    _ob_r = new SeismogramNode[len1];
                    for(int i1 = 0 ; i1 < len1 ; i1++)
                        _ob_r[i1] = SeismogramNodeHelper.read(_ob_in);
                    return _ob_r;
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }

    //
    // IDL:iris.edu/Fissures/AuditSystemAccess/get_audit_trail:1.0
    //
    public edu.iris.Fissures.AuditElement[]
    get_audit_trail()
        throws edu.iris.Fissures.NotImplemented
    {
        while(true)
        {
            if(!this._is_local())
            {
                org.omg.CORBA.portable.OutputStream out = null;
                org.omg.CORBA.portable.InputStream in = null;
                try
                {
                    out = _request("get_audit_trail", true);
                    in = _invoke(out);
                    edu.iris.Fissures.AuditElement[] _ob_r = edu.iris.Fissures.AuditTrailHelper.read(in);
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

                    if(_ob_id.equals(edu.iris.Fissures.NotImplementedHelper.id()))
                        throw edu.iris.Fissures.NotImplementedHelper.read(in);
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _ob_id);
                }
                finally
                {
                    _releaseReply(in);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _ob_so = _servant_preinvoke("get_audit_trail", _ob_opsClass);
                if(_ob_so == null)
                    continue;
                RemoteDataSetAccessOperations _ob_self = (RemoteDataSetAccessOperations)_ob_so.servant;
                try
                {
                    return _ob_self.get_audit_trail();
                }
                finally
                {
                    _servant_postinvoke(_ob_so);
                }
            }
        }
    }
}
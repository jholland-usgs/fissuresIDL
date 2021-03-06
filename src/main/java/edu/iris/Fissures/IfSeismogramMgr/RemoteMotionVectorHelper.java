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
// IDL:iris.edu/Fissures/IfSeismogramMgr/RemoteMotionVector:1.0
//
final public class RemoteMotionVectorHelper
{
    public static void
    insert(org.omg.CORBA.Any any, RemoteMotionVector val)
    {
        any.insert_Value(val, type());
    }

    public static RemoteMotionVector
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
        {
            java.io.Serializable _ob_v = any.extract_Value();
            if(_ob_v instanceof RemoteMotionVector)
                return (RemoteMotionVector)_ob_v;
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            org.omg.CORBA.ValueMember[] members = new org.omg.CORBA.ValueMember[1];

            members[0] = new org.omg.CORBA.ValueMember();
            members[0].name = "seismograms";
            members[0].type = SeismogramSeqHelper.type();
            members[0].access = org.omg.CORBA.PUBLIC_MEMBER.value;

            org.omg.CORBA.TypeCode baseType = edu.iris.Fissures.IfSeismogramDC.MotionVectorAttrHelper.type();

            typeCode_ = orb.create_value_tc(id(), "RemoteMotionVector", org.omg.CORBA.VM_NONE.value, baseType, members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfSeismogramMgr/RemoteMotionVector:1.0";
    }

    public static RemoteMotionVector
    read(org.omg.CORBA.portable.InputStream in)
    {
        if(!(in instanceof org.omg.CORBA_2_3.portable.InputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        return (RemoteMotionVector)((org.omg.CORBA_2_3.portable.InputStream)in).read_value(id());
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, RemoteMotionVector val)
    {
        if(!(out instanceof org.omg.CORBA_2_3.portable.OutputStream))
            throw new org.omg.CORBA.BAD_PARAM();
        ((org.omg.CORBA_2_3.portable.OutputStream)out).write_value(val, id());
    }
}

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
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetAttr:1.0
//
/** Defines the attributes of a DataSet. The more important element
 *  here is that a user can attach parameters to a DataSet.
 **/

final public class DataSetAttr implements org.omg.CORBA.portable.IDLEntity
{
    public
    DataSetAttr()
    {
    }

    public
    DataSetAttr(String id,
                String name,
                String owner,
                edu.iris.Fissures.IfParameterMgr.ParameterRef[] parm_ids)
    {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.parm_ids = parm_ids;
    }

    public String id;
    public String name;
    public String owner;
    public edu.iris.Fissures.IfParameterMgr.ParameterRef[] parm_ids;
}

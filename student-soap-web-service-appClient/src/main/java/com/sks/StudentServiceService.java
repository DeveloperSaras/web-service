/**
 * StudentServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sks;

public interface StudentServiceService extends javax.xml.rpc.Service {
    public java.lang.String getStudentServiceAddress();

    public com.sks.StudentService getStudentService() throws javax.xml.rpc.ServiceException;

    public com.sks.StudentService getStudentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

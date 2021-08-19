/**
 * StudentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sks;

public interface StudentService extends java.rmi.Remote {
    public boolean addStudent() throws java.rmi.RemoteException;
    public boolean deleteStudent() throws java.rmi.RemoteException;
    public com.sks.Student[] getAllStudent() throws java.rmi.RemoteException;
}

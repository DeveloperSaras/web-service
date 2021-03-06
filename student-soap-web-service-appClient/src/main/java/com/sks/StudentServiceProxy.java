package com.sks;

public class StudentServiceProxy implements com.sks.StudentService {
  private String _endpoint = null;
  private com.sks.StudentService studentService = null;
  
  public StudentServiceProxy() {
    _initStudentServiceProxy();
  }
  
  public StudentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentServiceProxy();
  }
  
  private void _initStudentServiceProxy() {
    try {
      studentService = (new com.sks.StudentServiceServiceLocator()).getStudentService();
      if (studentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentService != null)
      ((javax.xml.rpc.Stub)studentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sks.StudentService getStudentService() {
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService;
  }
  
  public boolean addStudent() throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService.addStudent();
  }
  
  public boolean deleteStudent() throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService.deleteStudent();
  }
  
  public com.sks.Student[] getAllStudent() throws java.rmi.RemoteException{
    if (studentService == null)
      _initStudentServiceProxy();
    return studentService.getAllStudent();
  }
  
  
}
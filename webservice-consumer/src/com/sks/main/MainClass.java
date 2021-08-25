package com.sks.main;

import java.util.List;

import com.sks.Student;
import com.sks.StudentService;
import com.sks.StudentServiceService;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		StudentServiceService service = new StudentServiceService();
		
		//List<Student> students = service.getStudentService().getAllStudent();
		
		StudentService serviceInterface = service.getStudentService();
		
		serviceInterface.addStudent();
		List<Student> students = serviceInterface.getAllStudent();
		
		System.out.println("Service is executed.");
		
		for(Student student : students) {
			
			System.out.println("Student info is : " + student);
		}
		
	}

}

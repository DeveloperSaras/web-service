package com.sks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentService implements StudentServiceI{
	
	private static Map<Integer, Student> map = new HashMap<Integer, Student>();

	@Override
	public boolean addStudent() {

		Student s1 = new Student(1, "Sam", 22);
		Student s2 = new Student(2, "Joe", 23);
		
		map.put(1, s1);
		map.put(2, s2);
		
		return true;
	}

	@Override
	public boolean deleteStudent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student[] getAllStudent() {
		
		Student[] studentArr= new Student[map.size()];
		
		int i = 0;
		
		for(Entry<Integer, Student> entry : map.entrySet()) {
			
			studentArr[i] = entry.getValue();
			i++;
		}
		
		
		return studentArr;
	}

}

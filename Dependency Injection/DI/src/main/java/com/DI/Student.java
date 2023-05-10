package com.DI;

public class Student {
	//Dependencies
	private String studentName;
	private String city;

	//We are injecting dependencies using setter methods
	/*
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */
	
	
	//injecting dependencies with constructor'
	public Student(String studentName,String city) {
		this.studentName = studentName;
		this.city=city;
	}

	public void printStudentName() {
		System.out.print("StudentName is "+ studentName + " City is "+ city);
		
	}
}

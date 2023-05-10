package com.Spring.loadingfrompropertyfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.studentName}")
	private String studentName;
	@Value("${student.courseEnrolled}")
	private String courseEnrolled;
	@Value("${student.hobby}")
	private String hobby;
	
	
	//When annotations(@autowiring,value) is been used we can remove setter method
	/*
	 * @Value("${student.studentName}") 
	 * public void setStudentName(String
	 * studentName) { this.studentName = studentName;
	 * System.out.print("Setting Name"); } //@Required - use to make the field
	 * required
	 * 
	 * @Value("${student.courseEnrolled}") 
	 * public void setCourseEnrolled(String
	 * courseEnrolled) { this.courseEnrolled = courseEnrolled; }
	 * 
	 * @Value("${student.hobby}") 
	 * public void setHobby(String hobby) { this.hobby =
	 * hobby; }
	 */
	public void printStudent() {
		System.out.println("Student Name : " + studentName + " courseEnrolled : "+ courseEnrolled + " hobby : "+ hobby);
	}
}

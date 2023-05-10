package com.Spring.Annotations;

import org.springframework.stereotype.Component;

//@Component("campusBean")
//using @bean
@Component
public class Campus {
	private College college;
    //Constructor
	/*
	 * public Campus(College college) { this.college = college; }
	 */

	//Setter method
	public void setCollege(College college) {
		this.college = college;
	}
	public void printCampusCollege() {
		college.collegeName();
	}
	
}

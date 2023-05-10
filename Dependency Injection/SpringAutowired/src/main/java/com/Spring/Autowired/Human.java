package com.Spring.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	public Human() {}
	public Human(Heart heart) {
		this.heart = heart;
	}
	@Autowired
	@Qualifier("heartObjectType")
	//We can remove SetMethods when Autowired is used
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method in human");
	}
	
	public void humanHearthWorking() {
		if(heart!=null) {
			System.out.println("Human heart is pumping");
			heart.heartFunction();
		}
		else {
			System.out.println("You are dead");
		}
	}
}

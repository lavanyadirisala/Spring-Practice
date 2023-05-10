package demo;

import org.springframework.stereotype.Component;

//Annoation
//@Component
public class Animal implements Livingbeings{
	
	
	public void eats() {
		System.out.print("eats flesh of other animals");
	}
}

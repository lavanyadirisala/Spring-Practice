package com.Spring.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
        //Annotation based notation i.e @component
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml");
		 * System.out.println("bean calling"); Campus
		 * c=(Campus)context.getBean("campusBean");
		 */
		//Java based notation
		ApplicationContext context = new AnnotationConfigApplicationContext(CampusConfig.class);
		System.out.println("bean calling");
		Campus c=(Campus)context.getBean("campusBean");
		c.printCampusCollege();
	}

}

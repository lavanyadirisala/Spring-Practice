package com.InjectingObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//OBJECT INJECTION

public class Client {
	public static void main(String args[]) {
	
		//in xml implemented
//		Engineer e= new Engineer();
//		Cheater ch=new Cheater();
//		e.setCheater(ch);
		
		//here implemented
//		e.printcheater();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("beans.xml file loaded");
		Engineer eng=(Engineer)context.getBean("engineerObject");
		eng.printEngineer();
		
		
		OtherEngineer othereng=(OtherEngineer)context.getBean("otherengineerObject");
		othereng.printOtherEngineerCheater();
		
	}
}

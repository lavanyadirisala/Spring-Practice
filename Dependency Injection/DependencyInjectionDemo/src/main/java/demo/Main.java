package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		//xml notation
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");				
//		//interface calling
//		Livingbeings livingbeing= context.getBean(Human.class);
//		livingbeing.eats();
//		
//		//with beam id calling
//		//Human human= (Human)context.getBean("human");
//		
//		//Human beam with maxlifespan field
//		Human human = context.getBean(Human.class);
//		System.out.println(human.getMaxLifeSpan());
		
		//Annotation based
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring2.xml");	
		Animal animal=context1.getBean(Animal.class);
		animal.eats();
		
		//Java Based configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigue.class);		
		Animal an=context.getBean(Animal.class);
		an.eats();
		
	}
}

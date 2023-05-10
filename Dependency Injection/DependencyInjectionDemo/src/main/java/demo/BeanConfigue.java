package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Annotation based Notation
@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfigue {
	
	@Bean
	public Animal animal() {
		return new Animal();
	}
	
	
	
	
}

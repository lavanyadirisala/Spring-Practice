package com.Spring.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
/*
@ComponentScan(basePackages = "com.Spring.Annotations")
*/
public class CampusConfig {
	
	//Creating bean by @Bean Annotation
	/*
	 * @Bean(name = "campusBeanId") 
	 * public Campus campusBean()
	 *  { Campus cam = new Campus(); 
	 *  return cam; }
	 */
	@Bean
	public College collegeBean() {
		return new College();
	}
	@Bean
	public Campus campusBean() {		
		//Constructor
		//Campus cam = new Campus(collegeBean());
		//Setter
		Campus campus = new Campus();
		campus.setCollege(collegeBean());		
		return campus;
	}
	
	
}

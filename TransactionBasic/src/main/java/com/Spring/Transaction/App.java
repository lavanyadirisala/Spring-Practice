package com.Spring.Transaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ProductConfig;
import com.service.ProductService;

public class App {
	public static void main(String args[]) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);		
		context.registerShutdownHook();
		ProductService productService =context.getBean("productService",ProductService.class);
		productService.savePointInfo();
		
		context.close();
	}
}

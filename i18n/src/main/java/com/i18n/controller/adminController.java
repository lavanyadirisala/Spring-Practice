package com.i18n.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
public class adminController {
   org.slf4j.Logger log =LoggerFactory.getLogger(adminController.class);
	@RequestMapping("/getadmin") 
	/* Internationalization is a process that makes your application adaptable to
	* different languages and regions without engineering changes on the source
	* code.
	*the externalized configuration to work with the same application code in different environments*/
	public String gotoView() {
		return "adminpage";
	}
	
	 @Value("${test.prop}")
	    private String extPropertyValue;

	    public void printValue(){
	        log.info(extPropertyValue);
	    }
	
}

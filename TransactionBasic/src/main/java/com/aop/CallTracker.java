package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component 
@Aspect
//AOP class for Non-functional (logging/security)
public class CallTracker {
	@Pointcut("within(com.service.*)||within(comm.config.*)")
	private void logPointCutMethod() {}
	
	//Before calling Methods - logging
	@Before("logPointCutMethod()")
	private void logBeforeMethodCall() {
		System.out.println("---Method starting--- ");
	}

	//After calling Methods - logging
	@After("logPointCutMethod()")
	private void logAfterMethodCall() {
		System.out.println("---Method ending--- ");
	}
	/*
	 * @Around("logPointCutMethod()")//both before and after is called 
	 * private void logBeforeAfterMethodCall(ProceedingJoinPoint proceedingjoinpoint) throws Throwable{
	 *  String name = proceedingjoinpoint.getSignature().getName();
	 * System.out.println("Method starting here " + name);
	 * 
	 * Object returnValue = proceedingjoinpoint.proceed();
	 * System.out.println(returnValue);//savePointInfo
	 * 
	 * System.out.println("Method ending here " +name); }
	 */
}

package com.Servlet.learner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LifecycleServlet
 */
@WebServlet("/LifecycleServlet")
public class LifecycleServlet implements Servlet {

	ServletConfig config=null;  
	//create servlet
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.print("Servlet created");
		
	}
	//computing response for the incoming request
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");  
		  
		PrintWriter out=response.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello simple Lifecycle servlet</b>");  
		out.print("</body></html>");		
	}

	// servlet is being destroyed
	public void destroy() {
		System.out.println("servlet is destroyed");
	}
	//return config object
	public ServletConfig getServletConfig() {		
		return config;
	}
	
	//get servlet information 
	public String getServletInfo() {
		//System.out.print("copyright 2007-1090");
		return "copyright 2007-1090";
		
	}

}

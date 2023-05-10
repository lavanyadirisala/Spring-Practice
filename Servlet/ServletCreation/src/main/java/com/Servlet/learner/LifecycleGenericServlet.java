package com.Servlet.learner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleGenericServlet
 */
@WebServlet("/LifecycleGenericServlet")
public class LifecycleGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/xml");
		PrintWriter pr = res.getWriter();
		pr.print("<html><body><p>Extending GenericServlet class </p></body></html>");
		res.getOutputStream();
		
	}
	

}

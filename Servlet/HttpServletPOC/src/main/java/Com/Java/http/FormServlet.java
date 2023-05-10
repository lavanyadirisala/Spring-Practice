package Com.Java.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.getWriter().print("Printing from get method in webpage");
	 * 
	 * }
	 */

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.print("Starting the Servlet");
		Cookie c = new Cookie("User", "Lavanya");
		res.addCookie(c);
		Cookie ch[] = req.getCookies();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i].getName() + " " + ch[i].getValue());
		}
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		pw.println("Welcome " + name);
	}

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		this.doPost(req, res);
//	}
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.setContentType("text/xml"); String
	 * name=request.getParameter("name");
	 * response.getWriter().print("Printing from get method in webpage");
	 * response.getWriter().print("Name"+name); }
	 */
}
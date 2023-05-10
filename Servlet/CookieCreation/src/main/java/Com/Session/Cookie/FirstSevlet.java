package Com.Session.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstSevlet")
public class FirstSevlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("UserName");

		// creating cookie (response + cookie)
		out.print("Welcome user" + name);
		//Working 
		Cookie c = new Cookie("user","Madhu");
		//Not working
		//Cookie c = new Cookie("user",""+req.getParameter("UserName"));
		resp.addCookie(c);
		
		// creating submit button
		out.print("<form action='SecondServlet' method='post'>");
		out.print("<input type='submit' value='Next'/>");
		out.print("</form>");
		out.close();
	}

}

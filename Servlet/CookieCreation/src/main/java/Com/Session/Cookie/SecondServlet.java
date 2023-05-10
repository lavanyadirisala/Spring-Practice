package Com.Session.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		//request+cookie
		Cookie ch[] = req.getCookies();
		for(int i=0;i<ch.length;i++) {
			resp.getWriter().print("Hello users from servlet 1 "+ ch[i].getValue());
			
		}
		PrintWriter pw=resp.getWriter();
		
	}

}

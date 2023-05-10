package Com.Servlet.Filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.stream.EventFilter;
import javax.xml.stream.events.XMLEvent;
 
public class MyFilter implements Filter {

    public void init(FilterConfig arg0) {}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = resp.getWriter();     
		out.print("Before filter - Preprocessing before servlet");

		chain.doFilter(req, resp); //it passes the control to the next filter or resource.
		out.println(" After servlet - Following code will execute after running the servlet - PostProcessing");
	}
	public void destroy() {
		
	}
 
}

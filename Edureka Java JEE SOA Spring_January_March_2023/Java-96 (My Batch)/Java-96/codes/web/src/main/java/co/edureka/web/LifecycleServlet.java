package co.edureka.web;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/life")
public class LifecycleServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("in init() method");
	}	

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("in service() method");
	}
	
	public void destroy() {	}
}

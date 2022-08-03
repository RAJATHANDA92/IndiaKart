package org.cdac.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * @author RajatHanda
 * this is a login servlet for IndiaKart
 * HTTP protocall is state less - clinet browser
 */
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	//instance variables
	@SuppressWarnings("unused")
	private String name;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("My Login Servlet!!");
		super.doGet(req, resp);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		super.service(req, resp);
	}
	
	public void destroy() {
		name = null;
		super.destroy();
	}

}

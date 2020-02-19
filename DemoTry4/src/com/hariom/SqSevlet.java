package com.hariom;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqSevlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("sq servlet");
		//m1 : old req + added some data on req obj
//		String s = (String) request.getAttribute("key");
//		response.getWriter().println(s);
		
		//m2 : old req obj + session value
//		HttpSession session = request.getSession();
//		String name = (String) session.getAttribute("key");
//		response.getWriter().println(name);
		
		//m3 : new req obj + value set in url
		int j = Integer.parseInt(request.getParameter("key"));
		response.getWriter().println(j);
	}
}

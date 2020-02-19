package com.hariom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("val1"));
		int j = Integer.parseInt(request.getParameter("val2"));
		System.out.println(i + j);
		response.getWriter().println(i + j);
		//m1
//		request.setAttribute("key", "hariom yadav");
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
		
		//m2
//		HttpSession session = request.getSession();
//		session.setAttribute("key", "hariom from session");
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
		
		//m3 : paypay : sending diff req obj
		response.sendRedirect("sq?key="+100);
		
	}
}

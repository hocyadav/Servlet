package com.hariom;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Add servlet..");
		int i = Integer.parseInt(request.getParameter("val1"));
		int j = Integer.parseInt(request.getParameter("val2"));
		//m1
		//response.getWriter().println("Add servlet.."+ (i + j));
		
		//m2 : getting global key value pair.
		ServletContext contextObj = getServletContext();//this methos is present in Generic servlet class and GS class is extended by HttpServlet class
		String globalKeyValue = contextObj.getInitParameter("name");

		
		//m3 : getting key value that is only assign to this servlet
		ServletConfig configObj = getServletConfig();//this method is present in generic servlet class
		String localKeyValue = configObj.getInitParameter("name");
		response.getWriter().print("Servlet Context global : "+globalKeyValue+"\n Servlet Config local: "+localKeyValue);
		
	}
}

package com.hariom;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")//this is same as servlet key value pair mapping: <request, url> mapping
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().println("add servlet..");
	}
}

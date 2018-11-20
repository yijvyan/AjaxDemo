
package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** AjaxServlet：AJAX的入门的Servlet； */
public class AjaxServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//System.out.println("1.在控制台输出：Hello World...");
		//response.getWriter().println("2.Hello AJAX GET...");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		//3.输出中文；
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("4.Hello AJAX GET...名称是：" + name + " 密码是：" + pass + "");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//response.getWriter().println("5.Hello AJAX POST...");
		
		//8.接收中文参数；
		request.setCharacterEncoding("UTF-8");
		
		//6.输出中文；
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("7.Hello AJAX POST...名称是：" + name + " 密码是：" + pass + "");
	}
	
}


package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.User;
import com.service.UserService;


/** UsernameServlet：异步校验用户名的Servlet； */
public class UsernameServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			//1.接收参数；
			String username = request.getParameter("username");
			//2.调用业务层；
			UserService userService = new UserService();
			User user = userService.findByUsername(username);
			//3.判断；
			if (user == null)
			{
				//3.1.用户名可以使用；
				response.getWriter().println(1);
			}
			else
			{
				//3.2.用户名已经被占用；
				response.getWriter().println(2);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
	}
	
}

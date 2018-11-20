
package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Word;
import com.service.WordService;


/** BaiduServlet：JQ仿百度提示的Servlet； */
public class BaiduServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			//1.接收参数，包括中文；
			request.setCharacterEncoding("UTF-8");
			String word = request.getParameter("word");
			
			//2.调用业务层；
			WordService wordService = new WordService();
			List<Word> list = wordService.search(word);
			
			//3.将查询到的数据返回到页面上；
			request.setAttribute("list", list);
			request.getRequestDispatcher("/search/info.jsp").forward(request, response);
		}
		catch (SQLException e)
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

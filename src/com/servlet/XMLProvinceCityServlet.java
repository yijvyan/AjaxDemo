
package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Province;
import com.service.ProvinceCityService;


/** XMLProvinceCityServlet：响应XML数据的JQ的案例，查询所有的省份信息显示到注册页面； */
public class XMLProvinceCityServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			//1.查询所有的省份的信息；
			ProvinceCityService provinceCityService = new ProvinceCityService();
			List<Province> list = provinceCityService.findAll();
			
			//2.跳转到页面；
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jq_provinceCity/province.jsp").forward(request, response);
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

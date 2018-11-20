
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


/** ProvinceCityServlet：响应JSON的JQ案例，跳转到注册页面； */
public class ProvinceCityServlet extends HttpServlet
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
			request.getRequestDispatcher("/jq_provinceCity_json/province.jsp").forward(request, response);
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


package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.City;
import com.service.ProvinceCityService;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;


/** JSONCityServlet：根据省份的ID查询市的信息； */
public class JSONCityServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String pid = request.getParameter("pid");
			ProvinceCityService provinceCityService = new ProvinceCityService();
			List<City> list = provinceCityService.findByPid(pid);
			
			//1.将List集合转成JSON；
			//			JSONArray jsonArray = JSONArray.fromObject(list);
			//2.将对象Object转成JSON；
			//JSONObject.fromObject(object);
			
			//3.转成JSON时，需要对JSON串的内容进行限定，去除不需要的参数，如去除pid、cid；
			JsonConfig config = new JsonConfig();
			//config.setExcludes(new String[] { "pid", "cid" });
			config.setExcludes(new String[] { "pid" });
			JSONArray jsonArray = JSONArray.fromObject(list, config);
			
			//			System.out.println(jsonArray.toString());
			
			//4.将查询到的数据返回到页面上，输出中文；
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println(jsonArray.toString());
			
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

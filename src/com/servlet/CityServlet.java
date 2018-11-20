
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
import com.thoughtworks.xstream.XStream;


/** CityServlet：根据省份的ID查询市的信息的Servlet； */
public class CityServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			//1.接收数据；
			String pid = request.getParameter("pid");
			//2.调用业务层查询所有的市的信息；
			ProvinceCityService provinceCityService = new ProvinceCityService();
			List<City> list = provinceCityService.findByPid(pid);
			
			//3.将List集合生成XML；
			XStream xStream = new XStream();
			//3.1.修改标签名，使用city标签替换city类的全类名；
			xStream.alias("city", City.class);
			//3.2.将类中属性作为标签的属性，即将标签cid，cname，pid都变成city标签中的cid属性，如cid=""，其他的类似；
			/* xStream.useAttributeFor(City.class, "cid");
			 * xStream.useAttributeFor(City.class, "cname");
			 * xStream.useAttributeFor(City.class, "pid"); */
			
			String xmlStr = xStream.toXML(list);
			
			//System.out.println(xmlStr);
			
			//4.将查询到的数据返回到页面上，输出中文；
			//response.setContentType("text/html;charset=UTF-8");
			//4.1.text/xml，这样前端才能当成xml去解析，不然text/html，前端会当成html标签去解析；
			response.setContentType("text/xml;charset=UTF-8");
			response.getWriter().println(xmlStr);
			
			//			<list>
			//			  <city>
			//			    <cid>9</cid>
			//			    <cname>郑州</cname>
			//			    <pid>2</pid>
			//			  </city>
			//			  <city>
			//			    <cid>10</cid>
			//			    <cname>洛阳</cname>
			//			    <pid>2</pid>
			//			  </city>
			//			</list>
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

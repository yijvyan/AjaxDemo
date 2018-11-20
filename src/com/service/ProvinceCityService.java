
/**    
* @Title: ProvinceCityService.java  
* @Package com.service  
* @Description: TODO(业务层；)  
* @author yijvyan  
* @date 2018年6月26日  
* @version V1.0    
*/

package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ProvinceCityDao;
import com.domain.City;
import com.domain.Province;


/** @ClassName: ProvinceCityService
 * @Description: TODO(省市联动的类；)
 * @author yijvyan
 * @date 2018年6月26日 */

public class ProvinceCityService
{
	
	/** @throws SQLException
	 * @Title: findAll @Description: TODO(1.查询所有省份信息的方法；) @param @return
	 *         参数 @return List<Province> 返回类型 @throws */
	
	public List<Province> findAll() throws SQLException
	{
		ProvinceCityDao provinceCityDao = new ProvinceCityDao();
		return provinceCityDao.findAll();
	}
	
	/** @throws SQLException
	 * @Title: findByPid @Description: TODO(2.根据省份ID查询对应的市的信息的方法；) @param @param
	 *         pid @param @return 参数 @return List<Province> 返回类型 @throws */
	
	public List<City> findByPid(String pid) throws SQLException
	{
		ProvinceCityDao provinceCityDao = new ProvinceCityDao();
		return provinceCityDao.findByPid(pid);
	}
	
}

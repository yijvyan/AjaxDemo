
/**    
* @Title: ProvinceCityDao.java  
* @Package com.dao  
* @Description: TODO(数据处理层；)  
* @author yijvyan  
* @date 2018年6月26日  
* @version V1.0    
*/

package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.domain.City;
import com.domain.Province;
import com.utils.JDBCUtils;


/** @ClassName: ProvinceCityDao
 * @Description: TODO(省市联动的DAO的代码；)
 * @author yijvyan
 * @date 2018年6月26日 */

public class ProvinceCityDao
{
	
	/** @throws SQLException
	 * @Title: findAll @Description: TODO(1.DAO中查询所有省份信息的方法；) @param @return
	 *         参数 @return List<Province> 返回类型 @throws */
	
	public List<Province> findAll() throws SQLException
	{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from province";
		List<Province> list = queryRunner.query(sql, new BeanListHandler<Province>(Province.class));
		return list;
	}
	
	/** @throws SQLException
	 * @Title: findByPid @Description:
	 *         TODO(2.DAO中根据省份ID查询对应的市的信息的方法；) @param @param pid @param @return
	 *         参数 @return List<Province> 返回类型 @throws */
	
	public List<City> findByPid(String pid) throws SQLException
	{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from city where pid = ?";
		List<City> list = queryRunner.query(sql, new BeanListHandler<City>(City.class), pid);
		return list;
	}
	
}

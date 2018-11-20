
/**    
* @Title: UserDao.java  
* @Package com.dao  
* @Description: TODO(数据处理层；)  
* @author yijvyan  
* @date 2018年6月23日  
* @version V1.0    
*/

package com.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.domain.User;
import com.utils.JDBCUtils;


/** @ClassName: UserDao
 * @Description: TODO(异步校验用户名的DAO的代码；)
 * @author yijvyan
 * @date 2018年6月23日 */

public class UserDao
{
	
	/** @throws SQLException @Title: findByUsername @Description:
	 * TODO(DAO中根据用户名查询用户的方法；) @param @param username @param @return 参数 @return
	 * User 返回类型 @throws */
	
	public User findByUsername(String username) throws SQLException
	{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		User user = queryRunner.query("select * from user where username = ?", new BeanHandler<User>(User.class), username);
		return user;
	}
	
}

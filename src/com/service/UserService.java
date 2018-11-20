
/**    
* @Title: UserService.java  
* @Package com.service  
* @Description: TODO(业务层；)  
* @author yijvyan  
* @date 2018年6月23日  
* @version V1.0    
*/

package com.service;

import java.sql.SQLException;

import com.dao.UserDao;
import com.domain.User;


/** @ClassName: UserService
 * @Description: TODO(异步校验用户名的类；)
 * @author yijvyan
 * @date 2018年6月23日 */

public class UserService
{
	
	/** @throws SQLException
	 * @Title: findByUsername @Description: TODO(根据用户名查询用户的方法；) @param @param
	 *         username @param @return 参数 @return User 返回类型 @throws */
	
	public User findByUsername(String username) throws SQLException
	{
		UserDao userDao = new UserDao();
		return userDao.findByUsername(username);
	}
	
}


/**    
* @Title: WordDao.java  
* @Package com.dao  
* @Description: TODO(数据处理层；)  
* @author yijvyan  
* @date 2018年6月24日  
* @version V1.0    
*/

package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.domain.Word;
import com.utils.JDBCUtils;


/** @ClassName: WordDao
 * @Description: TODO(仿百度提示的DAO的代码；)
 * @author yijvyan
 * @date 2018年6月24日 */

public class WordDao
{
	
	/** @throws SQLException
	 * @Title: search @Description: TODO(1.DAO中根据输入的字母查找单词的方法；) @param @param
	 *         word @param @return 参数 @return List<Word> 返回类型 @throws */
	
	public List<Word> search(String word) throws SQLException
	{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		//1.限制查询5条，等同于：select * from words where word like ? limit 0,5;
		String sql = "select * from words where word like ? limit 5";
		List<Word> list = queryRunner.query(sql, new BeanListHandler<Word>(Word.class), word + "%");
		return list;
	}
	
}

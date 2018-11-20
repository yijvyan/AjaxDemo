
/**    
* @Title: WordService.java  
* @Package com.service  
* @Description: TODO(业务层；)  
* @author yijvyan  
* @date 2018年6月24日  
* @version V1.0    
*/

package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.WordDao;
import com.domain.Word;


/** @ClassName: WordService
 * @Description: TODO(仿百度提示的类；)
 * @author yijvyan
 * @date 2018年6月24日 */

public class WordService
{
	
	/** @throws SQLException
	 * @Title: search @Description: TODO(1.根据输入的字母查找单词的方法；) @param @param
	 *         word @param @return 参数 @return List<Word> 返回类型 @throws */
	
	public List<Word> search(String word) throws SQLException
	{
		WordDao wordDao = new WordDao();
		return wordDao.search(word);
	}
	
}

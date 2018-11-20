
/**    
* @Title: Word.java  
* @Package com.domain  
* @Description: TODO(实体类；)  
* @author yijvyan  
* @date 2018年6月24日  
* @version V1.0    
*/

package com.domain;

/** @ClassName: Word
 * @Description: TODO(单词的实体对象；)
 * @author yijvyan
 * @date 2018年6月24日 */

public class Word
{
	private int		id;
	private String	word;
	
	/** @return id */
	
	public int getId()
	{
		return id;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	/** @return word */
	
	public String getWord()
	{
		return word;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setWord(String word)
	{
		this.word = word;
	}
	
}

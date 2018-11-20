
/**    
* @Title: User.java  
* @Package com.domain  
* @Description: TODO(实体类；)  
* @author yijvyan  
* @date 2018年6月23日  
* @version V1.0    
*/

package com.domain;

/** @ClassName: User
 * @Description: TODO(用户的实体对象；)
 * @author yijvyan
 * @date 2018年6月23日 */

public class User
{
	private int		id;
	private String	username;
	private String	password;
	private String	nickname;
	private String	type;
	
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
	
	/** @return username */
	
	public String getUsername()
	{
		return username;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	/** @return password */
	
	public String getPassword()
	{
		return password;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/** @return nickname */
	
	public String getNickname()
	{
		return nickname;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	
	/** @return type */
	
	public String getType()
	{
		return type;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setType(String type)
	{
		this.type = type;
	}
}

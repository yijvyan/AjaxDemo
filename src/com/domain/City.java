
/**    
* @Title: City.java  
* @Package com.domain  
* @Description: TODO(实体类；)  
* @author yijvyan  
* @date 2018年6月26日  
* @version V1.0    
*/

package com.domain;

/** @ClassName: City
 * @Description: TODO(市县的实体对象；)
 * @author yijvyan
 * @date 2018年6月26日 */

public class City
{
	private int		cid;
	private String	cname;
	private int		pid;
	
	/** @return cid */
	
	public int getCid()
	{
		return cid;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	
	/** @return cname */
	
	public String getCname()
	{
		return cname;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	
	/** @return pid */
	
	public int getPid()
	{
		return pid;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setPid(int pid)
	{
		this.pid = pid;
	}
}

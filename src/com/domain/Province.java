
/**    
* @Title: Province.java  
* @Package com.domain  
* @Description: TODO(实体类；)  
* @author yijvyan  
* @date 2018年6月26日  
* @version V1.0    
*/

package com.domain;

/** @ClassName: Province
 * @Description: TODO(省份的实体对象；)
 * @author yijvyan
 * @date 2018年6月26日 */

public class Province
{
	private int		pid;
	private String	pname;
	
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
	
	/** @return pname */
	
	public String getPname()
	{
		return pname;
	}
	
	/** @param paramtheparamthe{bare_field_name}
	 *            to set */
	
	public void setPname(String pname)
	{
		this.pname = pname;
	}
}

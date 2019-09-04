package cn.action.modules.bas.entity;

import cn.action.common.persistence.DataEntity;

/**
 * 车间实体类
 * @author Administrator
 *
 */

public class WorkShop extends DataEntity<WorkShop>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopName;		//车间名称
	private String shopNo;			//车间编号
	private String master;			//车间负责人
	private String description;		//车间描述
	private Factory factory;		//所属工厂
	
	public Factory getFactory() {
		return factory;
	}
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	public WorkShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkShop(String id) {
		super(id);
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopNo() {
		return shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

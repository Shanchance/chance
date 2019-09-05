package cn.action.modules.bas.entity;

import cn.action.common.persistence.DataEntity;

/**
 * ����ʵ����
 * @author Administrator
 *
 */

public class WorkShop extends DataEntity<WorkShop>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopName;		//��������
	private String shopNo;			//������
	private String master;			//���为����
	private String description;		//��������
	private Factory factory;		//��������
	
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

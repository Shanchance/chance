package cn.action.modules.bas.entity;

import cn.action.common.persistence.DataEntity;

public class Factory extends DataEntity<Factory>{

	/**
	 * 工厂的实体类
	 */
	private static final long serialVersionUID = 1L;

	private String factoryName;//工厂名称
	private String factoryBuildDate;//创建日期
	private String factoryAddress;//地址
	private String factoryPhone;//电话
	private String factoryECode;//邮政编码
	private String factoryBuildM;//建筑面积
	
	private Enterprise enterprise; //所属企业
	
	
	
	public Factory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Factory(String id) {
		super(id);
	}
	
	
	public Enterprise getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getFactoryBuildDate() {
		return factoryBuildDate;
	}
	public void setFactoryBuildDate(String factoryBuildDate) {
		this.factoryBuildDate = factoryBuildDate;
	}
	public String getFactoryAddress() {
		return factoryAddress;
	}
	public void setFactoryAddress(String factoryAddress) {
		this.factoryAddress = factoryAddress;
	}
	public String getFactoryPhone() {
		return factoryPhone;
	}
	public void setFactoryPhone(String factoryPhone) {
		this.factoryPhone = factoryPhone;
	}
	public String getFactoryECode() {
		return factoryECode;
	}
	public void setFactoryECode(String factoryECode) {
		this.factoryECode = factoryECode;
	}
	public String getFactoryBuildM() {
		return factoryBuildM;
	}
	public void setFactoryBuildM(String factoryBuildM) {
		this.factoryBuildM = factoryBuildM;
	}
	
	
}

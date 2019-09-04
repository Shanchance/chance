package cn.action.modules.bas.entity;

import cn.action.common.persistence.DataEntity;

public class Enterprise extends DataEntity<Enterprise>{

	/**
	 * 企业的实体类，author:shanchance
	 */
	private static final long serialVersionUID = 1L;
	
	private String enterName;//企业名称
	private String enterCode;//组织机构代码
	private String enterLevel;//单位层次
	private String enterNature;//单位性质
	private String enterCapital;//企业注册资本
	private String enterLperson;//法人
	private String enterLpCard;//法人身份证
	private String enterAddress;//企业地址
	private String emailCode;//邮政编码
	private String enterRemarks;//备注
	public String getEnterName() {
		return enterName;
	}
	public void setEnterName(String enterName) {
		this.enterName = enterName;
	}
	public String getEnterCode() {
		return enterCode;
	}
	public void setEnterCode(String enterCode) {
		this.enterCode = enterCode;
	}
	public String getEnterLevel() {
		return enterLevel;
	}
	public void setEnterLevel(String enterLevel) {
		this.enterLevel = enterLevel;
	}
	public String getEnterNature() {
		return enterNature;
	}
	public void setEnterNature(String enterNature) {
		this.enterNature = enterNature;
	}
	public String getEnterCapital() {
		return enterCapital;
	}
	public void setEnterCapital(String enterCapital) {
		this.enterCapital = enterCapital;
	}
	public String getEnterLperson() {
		return enterLperson;
	}
	public void setEnterLperson(String enterLperson) {
		this.enterLperson = enterLperson;
	}
	public String getEnterLpCard() {
		return enterLpCard;
	}
	public void setEnterLpCard(String enterLpCard) {
		this.enterLpCard = enterLpCard;
	}
	public String getEnterAddress() {
		return enterAddress;
	}
	public void setEnterAddress(String enterAddress) {
		this.enterAddress = enterAddress;
	}
	public String getEmailCode() {
		return emailCode;
	}
	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}
	public String getEnterRemarks() {
		return enterRemarks;
	}
	public void setEnterRemarks(String enterRemarks) {
		this.enterRemarks = enterRemarks;
	}
}
 
package cn.action.modules.bas.entity;

import cn.action.common.persistence.DataEntity;

/**
 * 产线实体类
 * @author Administrator
 *
 */

public class Line extends DataEntity<Line>{


	private static final long serialVersionUID = 1L;
	private String lineName;//产线名称
	private String lineNumber;//产线编码
	private String lineMaster;//产线负责人
	private String lineDescription;//产线描述
	private WorkShop workshop; //所属车间
	
	public WorkShop getWorkshop() {
		return workshop;
	}
	public void setWorkshop(WorkShop workshop) {
		this.workshop = workshop;
	}
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Line(String id) {
		super(id);
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getLineMaster() {
		return lineMaster;
	}
	public void setLineMaster(String lineMaster) {
		this.lineMaster = lineMaster;
	}
	public String getLineDescription() {
		return lineDescription;
	}
	public void setLineDescription(String lineDescription) {
		this.lineDescription = lineDescription;
	}
	
	

}

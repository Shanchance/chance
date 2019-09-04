package cn.action.modules.bas.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.action.common.persistence.Page;
import cn.action.common.web.BaseController;
import cn.action.modules.bas.entity.Enterprise;
import cn.action.modules.bas.entity.Factory;
import cn.action.modules.bas.service.EnterpriseService;
import cn.action.modules.bas.service.FactoryService;
/** 
 * 工厂Controller
 * @author Administrator
 *
 */

@Controller
@RequestMapping(value="${adminPath}/bas/factory")
public class FactoryController extends BaseController{
	@Autowired
	private FactoryService factoryService;
	@Autowired
	private EnterpriseService enterService;
	
	@ModelAttribute("factory")
	public Factory get(@RequestParam(required=false)String id) {
		
		if(StringUtils.isNotBlank(id)) {
			return factoryService.get(id);
			
		}
		return new Factory();
	}
	
	@RequestMapping(value= {"list",""})
	public String list(Factory factory,Model model,HttpServletRequest request,HttpServletResponse response) {
		Page<Factory> page = factoryService.findPage(new Page<Factory>(request,response),factory);
		model.addAttribute("page",page);
		return "modules/bas/factoryList";
	}
	
	@RequestMapping(value= "save")
	public String save(Factory factory,Model model,RedirectAttributes redirectAttributes) {
		factoryService.save(factory);
		addMessage(redirectAttributes, "保存工厂信息成功！！！！");
		return "redirect:"+adminPath+"/bas/factory";
	}
	
	@RequestMapping(value="delete")
	public String delete(Factory factory,RedirectAttributes redirectAttribute) {
		factoryService.delete(factory);
		addMessage(redirectAttribute, "删除工厂成功");
		return "redirect:" + adminPath + "/bas/factory/?repage&factoryName="+factory.getFactoryName();
	}
	
	@RequestMapping(value="form")
	public String form (Factory factory,Model model) {
		List<Enterprise> enters =enterService.findList(new Enterprise());
		model.addAttribute("enterpriseList",enters);
		model.addAttribute("factory",factory);
//		System.out.println("11111111:"+factory.getFactoryName()+"1111111"+factory.getFactoryAddress());
		return "modules/bas/factoryForm";
	}
	
	
}












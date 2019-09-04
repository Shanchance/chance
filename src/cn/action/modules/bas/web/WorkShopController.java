package cn.action.modules.bas.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.action.common.persistence.Page;
import cn.action.common.utils.StringUtils;
import cn.action.common.web.BaseController;
import cn.action.modules.bas.entity.Factory;
import cn.action.modules.bas.entity.WorkShop;
import cn.action.modules.bas.service.FactoryService;
import cn.action.modules.bas.service.WorkShopService;

	@Controller
	@RequestMapping(value="${adminPath}/bas/workShop")
	public class WorkShopController extends BaseController{
		@Autowired
		private WorkShopService workShopService;
		@Autowired
		private FactoryService factoryService;
		@ModelAttribute("workShop")
		public WorkShop get(@RequestParam(required=false) String id) {
			if (StringUtils.isNotBlank(id)){
				return workShopService.get(id);
			}else{
				return new WorkShop();
			}
		}
		

		@RequestMapping(value = {"list", ""})
		public String list(WorkShop workShop, HttpServletRequest request, HttpServletResponse response, Model model) {
	        Page<WorkShop> page = workShopService.findPage(new Page<WorkShop>(request, response), workShop); 
	        model.addAttribute("page", page);
			return "modules/bas/workShopList";
		}


		@RequestMapping(value = "form")
		public String form(WorkShop workShop, Model model) {
			List<Factory> factory =factoryService.findList(new Factory());
			model.addAttribute("factoryList",factory);
			model.addAttribute("workShop", workShop);
			return "modules/bas/workShopForm";
		}


		@RequestMapping(value = "save")//@Valid 
		public String save(WorkShop workShop, Model model, RedirectAttributes redirectAttributes) {
			workShopService.save(workShop);
			addMessage(redirectAttributes, "保存车间信息'成功");
			return "redirect:" + adminPath + "/bas/workShop";
		}
		

		@RequestMapping(value = "delete")
		public String delete(WorkShop workShop, RedirectAttributes redirectAttributes) {
			workShopService.delete(workShop);
			addMessage(redirectAttributes, "删除车间成功");
			return "redirect:" + adminPath + "/bas/workShop";
		}
		

	

}

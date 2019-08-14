package com.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.entity.SysRole;
import com.project.service.SysRoleService;

@Controller
@RequestMapping("/pages")
public class SysRoleController  {
	@Autowired
	private SysRoleService sysRoleService;
	
	  @RequestMapping("/hello")
	   public ModelAndView Hello(ModelAndView mv){
		   System.out.println("222");
		   mv.setViewName("helloPage");
		return mv;
	   }
	  
   @RequestMapping("/index")
   public ModelAndView Index(ModelAndView mv){
	   System.out.println("555");
	   mv.setViewName("index");
	return mv;
   }
   @RequestMapping("/getLoad")
   public ModelAndView Load(ModelAndView mv){
	   System.out.println("444");
	   mv.setViewName("load");
	return mv;
   }
   @RequestMapping("/findSysRoleObject")
   @ResponseBody
   @JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
   public List<SysRole> testJson(ModelAndView mv){
	   List<SysRole> list =sysRoleService.findSysRoleObject(); 
	return list;
   }
   
}

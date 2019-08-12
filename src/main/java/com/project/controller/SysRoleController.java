package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.entity.SysRole;
import com.project.service.SysRoleService;

@Controller
@RequestMapping("/req")
public class SysRoleController  {
	@Autowired
	private SysRoleService sysRoleService;
	
   @RequestMapping("/hello")
   public ModelAndView Hello(ModelAndView mv){
	   mv.setViewName("helloPage");
	   mv.addObject("msg", "hello world!!!");
	return mv;
   }

   @RequestMapping("/findObject")
   @ResponseBody
   @JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
   public List<SysRole> testJson(ModelAndView mv){
	   List<SysRole> list =sysRoleService.findSysRoleObject(); 
	return list;
   }
   
}

package com.project.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
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
   public List<SysRole> findSysRoleObject(){
	   List<SysRole> list =sysRoleService.findSysRoleObject(); 
	return list;
   }
   
   @RequestMapping("/deleteSysRoleObject")
   @ResponseBody
   public Integer deleteSysRoleObject(@Param("ids") String ids){
	   System.out.println(ids);
	   String[] list=ids.split(",");
	   System.out.println(Arrays.toString(list));
	   Integer result=sysRoleService.deleteSysRoleObject(list); 
	return result;
   }
   
   @RequestMapping("/insertSysRoleObject")
   @ResponseBody
   public Integer insertSysRoleObject(SysRole entity){
	   System.out.println(entity);
	   Integer result=sysRoleService.insertSysRoleObject(entity); 
	return result;
   }
   
}

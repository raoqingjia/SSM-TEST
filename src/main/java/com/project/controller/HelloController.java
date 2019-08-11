package com.project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/req")
public class HelloController  {
   @RequestMapping("/hello")
   public ModelAndView Hello(ModelAndView mv){
	   mv.setViewName("helloPage");
	   mv.addObject("msg", "hello world!!!");
	return mv;
   }

   @RequestMapping("/testJson")
   @ResponseBody
   public Map testJson(ModelAndView mv){
	   Map<String, Object> map=new HashMap<>();
	   map.put("id", 100);
	   map.put("name", "name");
	  
	return map;
   }
   
}

package com.project.unit;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.alibaba.druid.pool.DruidDataSource;
import com.project.entity.SysRole;
import com.project.service.SysRoleService;

public class TestBeanObject {
	@Test
	public void testPool() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-configs.xml");
		DruidDataSource dataSource = (DruidDataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);

	}

	@Test
	public void testSessionFactory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-configs.xml");
		Object sessionFactory = ctx.getBean("sqlSessionFactory");
		System.out.println(sessionFactory);

	}

	@Test
	public void testService() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-configs.xml");
		SysRoleService sysRoleService =  ctx.getBean("sysRoleServiceImpl",SysRoleService.class);
		System.out.println(sysRoleService);
		List<SysRole> list=sysRoleService.findSysRoleObject();
		System.out.println(list);

	}

}
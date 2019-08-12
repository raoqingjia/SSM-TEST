package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.SysRoleDao;
import com.project.entity.SysRole;
import com.project.service.SysRoleService;
@Service
public class SysRoleServiceImpl implements SysRoleService{
	@Autowired
     private SysRoleDao sysroledao;

	public List<SysRole> findSysRoleObject() {
		List<SysRole> result=sysroledao.findSysRoleObject();
		return   result;
	}
	
	

}

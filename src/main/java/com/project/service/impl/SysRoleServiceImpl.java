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
    
    // 查找数据方法	
	public List<SysRole> findSysRoleObject() {
		List<SysRole> result=sysroledao.findSysRoleObject();
		return   result;
	}
	// 删除数据
	public Integer deleteSysRoleObject(String[] ids) {
		Integer result=sysroledao.deleteSysRoleObject(ids);
		return result;
	}
	// 插入数据
	public Integer insertSysRoleObject(SysRole entity) {
		Integer result=sysroledao.insertSysRoleObject(entity);
		return result;
	}
	
	

}

package com.project.service;

import java.util.List;

import com.project.entity.SysRole;

public interface SysRoleService {
	List<SysRole> findSysRoleObject ();
	Integer deleteSysRoleObject (String[] ids);
	Integer insertSysRoleObject (SysRole entity);
}

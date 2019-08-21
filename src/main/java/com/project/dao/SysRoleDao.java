package com.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.project.entity.SysRole;

public interface SysRoleDao {
	List<SysRole> findSysRoleObject ();
	Integer deleteSysRoleObject (@Param("ids") String[] ids);
	Integer insertSysRoleObject (SysRole entity);
}

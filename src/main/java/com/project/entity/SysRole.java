package com.project.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SysRole  implements Serializable{
	private static final long serialVersionUID = -4916543590737925184L;
    private Integer id;
    private String name;
    private String note;
    private Date createdTime;
    private Date modifiedTime;
    private String createdUser;
    private String modifiedUser;

	public SysRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
//	指定日期格式
	public String getCreatedTime() {
		if(createdTime==null){
			return "--";
		}else{
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.format(createdTime);
		}
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
//	指定日期格式   timezone="GMT+8"东八区
	@JsonFormat(pattern="yyyy-MM-dd",locale="zh",timezone="GMT+8")
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SysRole [id=" + id + ", name=" + name + ", note=" + note + ", createdTime=" + createdTime
				+ ", modifiedTime=" + modifiedTime + ", createdUser=" + createdUser + ", modifiedUser=" + modifiedUser
				+ "]";
	}

}

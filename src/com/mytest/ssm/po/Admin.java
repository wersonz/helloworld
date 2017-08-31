package com.mytest.ssm.po;

public class Admin {
	
	String adminname;
	String password;
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminname, String password) {
		super();
		this.adminname = adminname;
		this.password = password;
	}
	

}

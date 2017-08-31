package com.mytest.ssm.po;

import java.util.List;

public class UserQueryVo {


	private User user;
	private UserCustom userCustom;
	private List<UserCustom> userList;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	public List<UserCustom> getUserList() {
		return userList;
	}
	public void setUserList(List<UserCustom> userList) {
		this.userList = userList;
	}
	
}

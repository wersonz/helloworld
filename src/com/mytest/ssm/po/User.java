package com.mytest.ssm.po;

import java.util.Date;

public class User {
	    private Integer userID;
	    
	    private String username;
	    
	    private String password;
	    
	    private String regtime;
	    
		private String phone;
	    
	    private Integer userrank;
	    
	    private String sex;
	    
	    private Integer upstate;
	    
	   

		public Integer getUpstate() {
			return upstate;
		}

		public void setUpstate(Integer upstate) {
			this.upstate = upstate;
		}

		public String getRegtime() {
			return regtime;
		}

		public void setRegtime(String regtime) {
			this.regtime = regtime;
		}

		public Integer getUserID() {
			return userID;
		}

		public void setUserID(Integer userID) {
			this.userID = userID;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Integer getUserrank() {
			return userrank;
		}

		public void setUserrank(Integer userrank) {
			this.userrank = userrank;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public User() {
			
			// TODO Auto-generated constructor stub
		}

		public User(Integer userID, String username, String password, String regtime, String phone, Integer userrank,
				String sex, Integer upstate) {
			super();
			this.userID = userID;
			this.username = username;
			this.password = password;
			this.regtime = regtime;
			this.phone = phone;
			this.userrank = userrank;
			this.sex = sex;
			this.upstate = upstate;
		}

		

}

package com.mytest.ssm.po;

public class UserCustom extends User{
	
	public UserCustom() {
		
	}

    public UserCustom(Integer userID, String username, String password, String regtime, String phone, Integer userrank,
			String sex, Integer upstate) {
		super(userID,username,password,regtime,phone,userrank,sex,upstate);
	}
    
}

package com.mytest.ssm.service;

import java.util.List;

import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.User;
import com.mytest.ssm.po.UserCustom;
import com.mytest.ssm.po.UserQueryVo;

public interface UserService {
	public User getUserById(int userID); 
//	public void register(String username,String password,String sex,String email,String rankname,String regtime);
	public void register(User user);
	public User getUserByName(String username);
	
	public void upstate(User user);
    
	public List<UserCustom> findUserList(UserQueryVo userQueryVo);
	
	public List<UserCustom> findUpList(UserQueryVo userQueryVo);
	
	public void uprank(User user);
}

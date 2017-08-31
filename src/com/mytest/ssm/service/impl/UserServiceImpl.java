package com.mytest.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.mytest.ssm.po.User;
import com.mytest.ssm.po.UserCustom;
import com.mytest.ssm.po.UserQueryVo;
import com.mytest.ssm.service.UserService;
import com.mytest.ssm.mapper.UserMapper; 


public class UserServiceImpl implements UserService {  
	@Autowired
	UserMapper userMapper;
	
	@Override
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return userMapper.getUserById(userId);
}
	@Override
//	public void register(String username,String password,String sex,String email,String rankname,String regtime) 
	public void register(User user){

		userMapper.register(user);
	}
	
	public User getUserByName(String username) {
		
		return userMapper.getUserByName(username);
	}
	@Override
	public void upstate(User user) {
		userMapper.upstate(user);
		
	}
	@Override
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) {
		// TODO Auto-generated method stub
		return userMapper.findUserList(userQueryVo);
	}
	@Override
	public List<UserCustom> findUpList(UserQueryVo userQueryVo) {
		// TODO Auto-generated method stub
		return userMapper.findUpList(userQueryVo);
	}
	@Override
	public void uprank(User user) {
		userMapper.uprank(user);
		
	}
	

}
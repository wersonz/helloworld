package com.mytest.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.User;
import com.mytest.ssm.po.UserCustom;
import com.mytest.ssm.po.UserQueryVo;

public interface UserMapper {
	public User getUserById(int userID);

	@Insert("insert into user values(#{userID},#{username},#{password},#{regtime},#{phone},#{userrank},#{sex},#{upstate})")
	public void register(User user);
	public User getUserByName(String username);
	
	@Update("update user set upstate = 1 where userId = #{userID}")
	public void upstate(User user);
	
	@Select("select * from user")
	public List<UserCustom> findUserList(UserQueryVo userQueryVo);
	
	@Select("select * from user where upstate = 1")
	public List<UserCustom> findUpList(UserQueryVo userQueryVo);
	
	@Update("update user set userrank = 2,upstate = 0 where userID=#{userID}")
	public void uprank(User user);
}

package com.mytest.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mytest.ssm.po.User;
import com.mytest.ssm.service.UserService;

@Controller

public class UserController {
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/goregister")
	public ModelAndView goregister() throws Exception{

		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	@RequestMapping("/golog")
	public ModelAndView goLog() throws Exception{

		ModelAndView modelAndView =  new ModelAndView();

		modelAndView.setViewName("login");
		return modelAndView;
	}
	

	@RequestMapping("/upuserrank")
	public ModelAndView upuserrank(HttpSession session) {
		
		ModelAndView modelAndView =  new ModelAndView();
		User user = (User)session.getAttribute("User");
		Integer rank =user.getUserrank();
		if(rank==2) {
			modelAndView.addObject("message", "你已经是白金会员！");
			modelAndView.setViewName("home_1");
			return modelAndView;
		}
		userService.upstate(user);
		modelAndView.addObject("message1", "你的申请已提交，请等待管理员审核！");
		modelAndView.setViewName("home_1");
		return modelAndView;
			
	}
	
	@RequestMapping("/register")
	public ModelAndView register(@RequestParam(value="username") String username,@RequestParam(value="password") String password,@RequestParam(value="phone") String phone,@RequestParam(value="sex") String sex) throws Exception{
		
		ModelAndView modelAndView =  new ModelAndView();
		User user=new User();
		user=userService.getUserByName(username);
		if(user!=null)
		{
			modelAndView.addObject("result", 0);
			modelAndView.setViewName("login");
			return modelAndView;
			
		}
		Date date=new Date();
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String regtime = formatter.format(date);
		  User user0=new User();
		  user0.setUserID(null);
		  user0.setUsername(username);
		  user0.setPassword(password);
		  user0.setPhone(phone);
		  user0.setSex(sex);
	      user0.setRegtime(regtime);
		  user0.setUserrank(1);
		  user0.setUpstate(0);
		  userService.register(user0);
			
		  modelAndView.addObject("result",1);
		  modelAndView.setViewName("login");
		  return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="username") String username,@RequestParam(value="password") String password,HttpSession session) throws Exception{
		
		ModelAndView modelAndView =  new ModelAndView();
		User user=new User();
		user=userService.getUserByName(username);
		
		if(user==null)
		{
			modelAndView.addObject("result", 0);
			modelAndView.setViewName("logResu");
			return modelAndView;
		}
		if(user.getPassword().equals(password))
		{
			modelAndView.addObject("result", 1);
			session.setAttribute("User", user);
			modelAndView.setViewName("home_1");
			return modelAndView;
		}
		else {
			modelAndView.addObject("result", 2);
			modelAndView.setViewName("logResu");
			return modelAndView;
		}
		
	}

}

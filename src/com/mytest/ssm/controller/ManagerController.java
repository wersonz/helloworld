package com.mytest.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mytest.ssm.po.Admin;
import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.User;
import com.mytest.ssm.po.UserCustom;
import com.mytest.ssm.service.AdminService;
import com.mytest.ssm.service.ManagerService;
import com.mytest.ssm.service.TestService;
import com.mytest.ssm.service.UserService;

import sun.print.DialogOwner;

@Controller
public class ManagerController {
	@Autowired
	ManagerService managerService;
	@Autowired
	AdminService adminService;
	@Autowired
	TestService testService;
	@Autowired
	UserService userService;
	
	@RequestMapping("/uprank")
	public ModelAndView uprank(@RequestParam(value="userID") Integer userID) {
		
		User user = userService.getUserById(userID);
		userService.uprank(user);
		List<UserCustom> userList = new ArrayList<UserCustom>();
		userList = userService.findUpList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "用户升级成功！");
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("manager/lookupstate");
		return  modelAndView;
		
	}
	
	@RequestMapping("/managepaperrank")
	public ModelAndView managepaperrank() {
		List<UserCustom> userList = new ArrayList<UserCustom>();
		userList = userService.findUpList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("manager/lookupstate");
		return  modelAndView;
		
	}
	
	@RequestMapping("managerpaper")
	public ModelAndView lookpaper() {
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/lookpaper");
		return  modelAndView;
	}
	
	
	
	@RequestMapping("/agreepaper")
	public ModelAndView agreepaper(@RequestParam(value="paperID") Integer paperID) {
		ModelAndView modelAndView = new ModelAndView();
		TestPaper testPaper = testService.getTestPaperbyId(paperID);
		managerService.despaperrank(testPaper);
		modelAndView.addObject("message", "试卷已成功发布！");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = managerService.findWaitPaperList(null);
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/waitpaper");
		return modelAndView;
	}
	
	@RequestMapping("/downpaerrank")
	public ModelAndView downpaperrank(@RequestParam(value="paperID") Integer paperID) {
		ModelAndView modelAndView = new ModelAndView();
		TestPaper testPaper = testService.getTestPaperbyId(paperID);
		Integer paperrank = testPaper.getPaperrank();
		if(paperrank==0) {
			modelAndView.addObject("message", "你的操作有误");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("manager/lookpaper");
			return modelAndView;
		}
		managerService.despaperrank(testPaper);
		modelAndView.addObject("message1", "试卷等级已经降低！");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/lookpaper");
		return modelAndView;
	}
	
	@RequestMapping("uppaperrank")
	public ModelAndView uppaperrank(@RequestParam(value="paperID") Integer paperID) {
		ModelAndView modelAndView = new ModelAndView();
		TestPaper testPaper = testService.getTestPaperbyId(paperID);
		Integer paperrank = testPaper.getPaperrank();
		if(paperrank==3) {
			modelAndView.addObject("message", "你的操作有误");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("manager/lookpaper");
			return modelAndView;
		}
		managerService.uppaperrank(testPaper);
		modelAndView.addObject("message2", "试卷等级已经提升！");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/lookpaper");
		return modelAndView;
		
		
//		User user = (User)session.getAttribute("User");
//		Integer rank =user.getUserrank();
//		if(rank==2) {
//			modelAndView.addObject("message", "你已经是白金会员！");
//			modelAndView.setViewName("home_1");
//			return modelAndView;
//		}
//		userService.upstate(user);
//		modelAndView.addObject("message1", "你的申请已提交，请等待管理员审核！");
//		modelAndView.setViewName("home_1");
//		return modelAndView;
		
	}
	
	@RequestMapping("/findpaper")
	public ModelAndView findpaper(@RequestParam(value="paperID") Integer paperID) {
		ModelAndView modelAndView = new ModelAndView();
		TestPaper testPaper0 = new TestPaper();
		testPaper0 = testService.getTestPaperbyId(paperID);
		managerService.recyclepaper(testPaper0);
		modelAndView.addObject("message", "试卷回收成功！");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = managerService.findDeletedPaperList(null);
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/deletedpaper");
		return modelAndView;
		
	}
	
	@RequestMapping("/deletedpaper")
	public ModelAndView deletedpaper() {
		ModelAndView modelAndView = new ModelAndView();
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = managerService.findDeletedPaperList(null);
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/deletedpaper");
		return modelAndView;
		
	}
	
	@RequestMapping("/waitpaper")
	public ModelAndView waitpaper() {
		ModelAndView modelAndView = new ModelAndView();
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = managerService.findWaitPaperList(null);
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("manager/waitpaper");
		return modelAndView;
		
	}
	
	
	
	@RequestMapping("/lookuser")
	public ModelAndView lookuser() {

		List<UserCustom> userList = new ArrayList<UserCustom>();
		userList = userService.findUserList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("manager/lookuser");
		return  modelAndView;
	}
	
	@RequestMapping("/manageradmin")
	public ModelAndView manageradmin(@RequestParam(value="adminname") String adminname,@RequestParam(value="password") String password,HttpSession session) {
		
		ModelAndView modelAndView = new ModelAndView();
		Admin admin = new Admin();
		admin = managerService.getAdminByName(adminname);
		if(admin.getPassword().equals(password))
		{
			modelAndView.setViewName("manager/home");
			return modelAndView;
		}
		else {
		modelAndView.addObject("message", "用户名密码错误！");
		modelAndView.setViewName("../../admin");
		return modelAndView;}
		
	}
}

package com.mytest.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mytest.ssm.po.Issuer;
import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;
import com.mytest.ssm.po.TestsCustom;
import com.mytest.ssm.po.User;
import com.mytest.ssm.service.AdminService;
import com.mytest.ssm.service.TestService;

@Controller
public class AdminController {

	
	@Autowired
	AdminService adminService;
	@Autowired
	TestService testService;
	
	@RequestMapping("/deletetests")
	public ModelAndView deletetests(@RequestParam(value="testsID") Integer testsID) {
		ModelAndView modelAndView = new ModelAndView();
		Tests tests = new Tests();
		tests = testService.geTestsById(testsID);
		adminService.deleteTests(tests);
		modelAndView.addObject("message1","删除成功！");
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyName(tests.getPapername());
		modelAndView.addObject("TestPaper",testPaper);
		List<TestsCustom> testsList = new ArrayList<TestsCustom>();
		testsList = testService.getTestsListById(tests.getPaperID());
		modelAndView.addObject("testsList", testsList);
		modelAndView.setViewName("admin/testsmanage");
		return modelAndView;
		
	}
	
	@RequestMapping("/altertests")
	public ModelAndView altertests(Tests tests) {
		ModelAndView modelAndView = new ModelAndView();
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyName(tests.getPapername());
		tests.setPaperID(testPaper.getPaperID());
		adminService.alterTests(tests);
		modelAndView.addObject("TestPaper",testPaper);
	    modelAndView.addObject("message","修改成功");
	    List<TestsCustom> testsList = new ArrayList<TestsCustom>();
		testsList = testService.getTestsListById(tests.getPaperID());
		modelAndView.addObject("testsList", testsList);
		modelAndView.setViewName("admin/testsmanage");
		return modelAndView;
		
	}
	
	@RequestMapping("/testsmanage")
	public  ModelAndView testsmanage(@RequestParam(value="paperID") Integer paperID, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Issuer issuer = (Issuer)session.getAttribute("Issuer");
		Integer issuerID = issuer.getIssuerID();
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyId(paperID);
		if(issuerID!=testPaper.getIssuerID()) {
			modelAndView.addObject("testPaper",testPaper);
			modelAndView.addObject("message3","你没有此权限！");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("admin/lookpaper");
			return modelAndView;
		}
		List<TestsCustom> testsList = new ArrayList<TestsCustom>();
		testsList = testService. getTestsListById(paperID);
		TestPaper testPaper1 = new TestPaper();
		testPaper1 = testService.getTestPaperbyId(paperID);
		modelAndView.addObject("TestPaper",testPaper1);
		modelAndView.addObject("testsList", testsList);
		modelAndView.setViewName("admin/testsmanage");
		return modelAndView;
	}
	
	@RequestMapping("/deletepaper")
	public ModelAndView deletepaper(@RequestParam(value="paperID") Integer paperID, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Issuer issuer = (Issuer)session.getAttribute("Issuer");
		Integer issuerID = issuer.getIssuerID();
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyId(paperID);
		if(issuerID!=testPaper.getIssuerID()) {
			modelAndView.addObject("testPaper",testPaper);
			modelAndView.addObject("message","你没有删除权限！");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("admin/lookpaper");
			return modelAndView;
		}
		adminService.deletePaper(testPaper);
		modelAndView.addObject("message2","删除成功！");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		modelAndView.addObject("paperList",paperList);
        modelAndView.setViewName("admin/lookpaper");
		return modelAndView;
	}
	
	@RequestMapping("/alterpaper")
	public ModelAndView alterpaper(@RequestParam(value="paperID") Integer paperID, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Issuer issuer = (Issuer)session.getAttribute("Issuer");
		Integer issuerID = issuer.getIssuerID();
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyId(paperID);
		if(issuerID!=testPaper.getIssuerID()) {
			modelAndView.addObject("testPaper",testPaper);
			modelAndView.addObject("message","你没有修改权限！");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("admin/lookpaper");
			return modelAndView;
		}
		
		modelAndView.addObject("testPaper",testPaper);
        modelAndView.setViewName("admin/alterpaper");
		return modelAndView;
	}
	
	@RequestMapping("/subAlterPaper")
    public ModelAndView subAlterPaper(TestPaper testPaper, HttpSession session) {   //paperID 已经传进来
		ModelAndView modelAndView = new ModelAndView();
//		TestPaper testPapertemp = new TestPaper();
//		testPapertemp = testService.getTestPaperbyName(testPaper.getPapername());
//		if(testPapertemp!=null) {
//			modelAndView.addObject("testPaper",testPaper);
//			modelAndView.addObject("message","试卷已存在");
//			modelAndView.setViewName("admin/alterpaper");
//			return modelAndView;
//		}
		adminService.updatePaper(testPaper);
		modelAndView.addObject("testPaper",testPaper);
		modelAndView.addObject("message0","修改成功");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		modelAndView.addObject("paperList",paperList);
        modelAndView.setViewName("admin/lookpaper");
		return modelAndView;	
	}
	
	@RequestMapping("/looktests")
	public ModelAndView looktests(@RequestParam(value="paperID") Integer paperID) {
		ModelAndView modelAndView =  new ModelAndView();
		List<TestsCustom> testsList = new ArrayList<TestsCustom>();
		testsList = testService. getTestsListById(paperID);
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyId(paperID);
		modelAndView.addObject("TestPaper",testPaper);
		modelAndView.addObject("testsList", testsList);
		modelAndView.setViewName("admin/looktests");
		return modelAndView;
	}
	
	@RequestMapping("/lookpaper")
	public ModelAndView lookpaper() {
		
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("admin/lookpaper");
		return  modelAndView;
		
		
	}
	
	@RequestMapping("/addtests")
	public ModelAndView addtests(Tests tests) {
		if(tests.getTitle()!="") {
		ModelAndView modelAndView = new ModelAndView();
		tests.setSignt(1);
		adminService.addTests(tests);
		modelAndView.addObject("message2","添加成功！");
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyName(tests.getPapername());
		modelAndView.addObject("TestPaper",testPaper);
		List<TestsCustom> testsList = new ArrayList<TestsCustom>();
		testsList = testService. getTestsListById(tests.getPaperID());
		modelAndView.addObject("testsList", testsList);
  	    modelAndView.setViewName("admin/testsmanage");
		return modelAndView;}
		else {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("message0","题目不能为空！重新输入");
			TestPaper testPaper = new TestPaper();
			testPaper = testService.getTestPaperbyName(tests.getPapername());
			modelAndView.addObject("TestPaper",testPaper);
			List<TestsCustom> testsList = new ArrayList<TestsCustom>();
			testsList = testService. getTestsListById(tests.getPaperID());
			modelAndView.addObject("testsList", testsList);
	  	    modelAndView.setViewName("admin/testsmanage");
			return modelAndView;
		}
		
	}
	
	@RequestMapping("/addpaper")
	public ModelAndView addpaper(TestPaper testPaper, HttpSession session) {
	ModelAndView modelAndView = new ModelAndView();
		
		Issuer issuer = (Issuer)session.getAttribute("Issuer");
		Integer issuerID = issuer.getIssuerID();
		
		TestPaper testPapertemp = new TestPaper();
		testPapertemp = testService.getTestPaperbyName(testPaper.getPapername());
		if(testPapertemp!=null) {
			modelAndView.addObject("testPaper",testPaper);
			modelAndView.addObject("message","试卷已存在");
			modelAndView.setViewName("admin/addpaper");
			return modelAndView;
		}
		testPaper.setIssuerID(issuerID);
		testPaper.setPaperrank(3);
		testPaper.setSign(1);
		adminService.testPaper(testPaper);
        
        modelAndView.addObject("testPaper",testPaper);
        modelAndView.addObject("message1","添加试卷成功");
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		modelAndView.addObject("paperList",paperList);
        modelAndView.setViewName("admin/lookpaper");
		return modelAndView;	
	}

	
	@RequestMapping("/goadd")
	public ModelAndView goadd() throws Exception{

		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("admin/addpaper");
		return modelAndView;
	}
	
	
	@RequestMapping("/admin_login")
	public ModelAndView login(@RequestParam(value="issuername") String issuername,@RequestParam(value="password") String password,HttpSession session) throws Exception{
		
		ModelAndView modelAndView =  new ModelAndView();
		Issuer issuer=new Issuer();
		issuer=adminService.getIssuerByName(issuername);
		
		if(issuer==null)
		{
			modelAndView.addObject("result", 0);
			modelAndView.setViewName("admin/logResu");
			return modelAndView;
		}
		if(issuer.getPassword().equals(password))
		{
			modelAndView.addObject("result", 1);
			session.setAttribute("Issuer", issuer);
			modelAndView.setViewName("admin/admin_issuer");
			return modelAndView;
		}
		else {
			modelAndView.addObject("result", 2);
			modelAndView.setViewName("admin/logResu");
			return modelAndView;
		}
		
	}
	
	@RequestMapping("/goissuer_reg")
	public ModelAndView goissuer_reg() throws Exception{

		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("admin/issuer_reg");
		return modelAndView;
	}
	
	@RequestMapping("/issuer_reg")
	public ModelAndView issuer_reg(@RequestParam(value="issuername") String issuername,@RequestParam(value="password") String password) {
		ModelAndView modelAndView =  new ModelAndView();
		Issuer issuer=new Issuer();
		issuer=adminService.getIssuerByName(issuername);
		if(issuer!=null)
		{
			modelAndView.addObject("result", 0);
			modelAndView.setViewName("admin/login");
			return modelAndView;	
		}
		
		  Issuer issuer0=new Issuer();
		  issuer0.setIssuerID(null);
		  issuer0.setIssuername(issuername);
		  issuer0.setPassword(password);
		 
		  adminService.register(issuer0);
			
		  modelAndView.addObject("result",1);
		  modelAndView.setViewName("admin/login");
		  return modelAndView;
		
		
	}
}

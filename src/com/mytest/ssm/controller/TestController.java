package com.mytest.ssm.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.css.ElementCSSInlineStyle;

import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.Records;
import com.mytest.ssm.po.RecordsCustom;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.TestsCustom;
import com.mytest.ssm.po.User;
import com.mytest.ssm.service.TestService;
import com.mytest.ssm.service.UserService;


@Controller
public class TestController<testsCustom> {
	@Autowired
	TestService testService;
	@Autowired
	UserService userService;
    
	@RequestMapping("/lookrecords")
	public ModelAndView lookrecords(HttpSession session) {
		ModelAndView modelAndView =  new ModelAndView();
		User user = (User)session.getAttribute("User");
		String username = user.getUsername();	
		List<RecordsCustom> recordsList = new ArrayList<RecordsCustom>();
		recordsList = testService.getRecordsListByName(username);
		modelAndView.addObject("recordsList",recordsList);
		modelAndView.setViewName("records");
		return modelAndView;
	    
	}
	
	@RequestMapping("/testresult")
	public ModelAndView testresult(@RequestParam(name="subScore") Float subScore, @RequestParam(name="papername") String papername,HttpSession session) throws Exception{
		ModelAndView modelAndView =  new ModelAndView();
        User user = (User)session.getAttribute("User");
        TestPaper testPaper = new TestPaper();
        testPaper = testService.getTestPaperbyName(papername);
        Float score = testPaper.getTotalscore();
        Records records0 = new Records();
        if (user!=null) {
          Date date=new Date();
      	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      	  String testtime = formatter.format(date);
      	  
      	  records0.setRecordsID(null);
      	  records0.setUserID(user.getUserID());
      	  records0.setUsername(user.getUsername());
      	  records0.setGrade(subScore);
      	  records0.setPaperID(testPaper.getPaperID());
      	  records0.setPapername(testPaper.getPapername());
      	  records0.setTesttime(testtime);
      	  if(subScore>(score*0.8)) {
      		  records0.setAnalyze(testPaper.getAnalyzeA());
      	  }
      	  else if(subScore>(score*0.6)) {
      		  records0.setAnalyze(testPaper.getAnalyzeB());
      	  }else {
			records0.setAnalyze(testPaper.getAnalyzeC()); 	  
                 }
      	 testService.records(records0);
        
         modelAndView.addObject("record",records0);   //传参
         modelAndView.setViewName("testresult");
 		 return modelAndView;
        }
        else {
        	  if(subScore>(score*0.8)) {
        		  modelAndView.addObject("message",testPaper.getAnalyzeA());
        	  }
        	  else if(subScore>(score*0.6)) {
        		  modelAndView.addObject("message",testPaper.getAnalyzeB());
        	  }else {
        		  modelAndView.addObject("message",testPaper.getAnalyzeC()); 	  
                   }
        	  modelAndView.addObject("message1",subScore);
        	  modelAndView.setViewName("tustestresult");
        	return modelAndView;
        }
		
        
       
		
	}
	
	@RequestMapping("/gotest")
	public ModelAndView gotest(@RequestParam(value="paperID") Integer paperID,HttpSession session) throws Exception{
		ModelAndView modelAndView =  new ModelAndView();
		TestPaper testPaper = new TestPaper();
		testPaper = testService.getTestPaperbyId(paperID);
		Integer paperrank = testPaper.getPaperrank();
		User user = (User)session.getAttribute("User");
		
		if(user==null) {
			if(paperrank>0) {
			modelAndView.addObject("message","你没有此权限,请先进行登陆！");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("paperlist");
			return  modelAndView;}
			else {
				List<TestsCustom> testsList = new ArrayList<TestsCustom>();
				testsList = testService. getTestsListById(paperID);
				
				modelAndView.addObject("TestPaper",testPaper);
				modelAndView.addObject("testsList", testsList);
				modelAndView.setViewName("test");
				return modelAndView;
			}
		}
		else {
		Integer userrank = user.getUserrank();
		if (userrank<paperrank) {
			modelAndView.addObject("message1","你没有此权限,升级为白金会员可进行此操作！");
			List<PaperCustom> paperList = new ArrayList<PaperCustom>();
			paperList = testService.findPaperList(null);
			
			modelAndView.addObject("paperList",paperList);
			modelAndView.setViewName("paperlist");
			return  modelAndView;
		} 
		List<TestsCustom> testsList = new ArrayList<TestsCustom>();
		testsList = testService. getTestsListById(paperID);
		
		modelAndView.addObject("TestPaper",testPaper);
		modelAndView.addObject("testsList", testsList);
		modelAndView.setViewName("test");
		return modelAndView;
		}	
	}
	@RequestMapping("/gopaperlist")
	public ModelAndView gopaperlist() {
//		TestPaper testPaper = new TestPaper();
//		testPaper=testService.getTestPaperbyName(null);
//		ModelAndView paper = new ModelAndView();
//		paper.addObject("papername", testPaper);
		List<PaperCustom> paperList = new ArrayList<PaperCustom>();
		paperList = testService.findPaperList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("paperList",paperList);
		modelAndView.setViewName("paperlist");
		return  modelAndView;
		
	}
}

package com.mytest.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mytest.ssm.mapper.ManagerMapper;
import com.mytest.ssm.po.Admin;
import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerMapper managerMapper;
	
	@Override
	public Admin getAdminByName(String adminname) {
		// TODO Auto-generated method stub
		return managerMapper.getAdminByName(adminname);
	}

	@Override
	public void uppaperrank(TestPaper testPaper) {
		managerMapper.uppaperrank(testPaper);
		
	}
	
	@Override
	public void recyclepaper(TestPaper testPaper) {
		managerMapper.recyclepaper(testPaper);
		
	}

	@Override
	public List<PaperCustom> findWaitPaperList(PaperQueryVo paperQueryVo) {
		// TODO Auto-generated method stub
		return managerMapper.findWaitPaperList(paperQueryVo);
	}

	@Override
	public void despaperrank(TestPaper testPaper) {
		managerMapper.despaperrank(testPaper);
		
	}

	@Override
	public List<PaperCustom> findDeletedPaperList(PaperQueryVo paperQueryVo) {
		// TODO Auto-generated method stub
		return managerMapper.findDeletedPaperList(paperQueryVo);
	}

	



}

package com.mytest.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mytest.ssm.mapper.AdminMapper;
import com.mytest.ssm.po.Issuer;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;
import com.mytest.ssm.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;
	
	@Override
	public Issuer getIssuerByName(String issuername) {
		// TODO Auto-generated method stub
		return adminMapper.getIssuerByName(issuername);
	}

	@Override
	public void register(Issuer issuer) {
		adminMapper.register(issuer);
	}

	@Override
	public void testPaper(TestPaper testPaper) {
		
		adminMapper.testPaper(testPaper);	
	}

	@Override
	public void updatePaper(TestPaper testPaper) {
		adminMapper.updatePaper(testPaper);
		
	}

	@Override
	public void deletePaper(TestPaper testPaper) {
		adminMapper.deletePaper(testPaper);
		
	}

	@Override
	public void alterTests(Tests tests) {
		adminMapper.alterTests(tests);
		
	}

	@Override
	public void deleteTests(Tests tests) {
		adminMapper.deleteTests(tests);
		
	}

	@Override
	public void addTests(Tests tests) {
		// TODO Auto-generated method stub
		adminMapper.addTests(tests);
	}

//	@Override
//	public Issuer getIssuerById(int issuerID) {
//		// TODO Auto-generated method stub
//		return adminMapper.getIssuerById(issuerID);
//	}

}

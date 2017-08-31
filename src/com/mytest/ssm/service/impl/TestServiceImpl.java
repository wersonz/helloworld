package com.mytest.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mytest.ssm.mapper.TestMapper;
import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.Records;
import com.mytest.ssm.po.RecordsCustom;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;
import com.mytest.ssm.po.TestsCustom;
import com.mytest.ssm.service.TestService;

@Service("testService")
@Transactional
public class TestServiceImpl implements TestService{
	@Autowired
	TestMapper testMapper;
	
//	@Override
//	public  List<TestsCustom> getTestsListByName(String papername) {
//		// TODO Auto-generated method stub
//		
//			try {
//				return testMapper.getTestsListByName(papername);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return null;
//		
//	}
//	@Override
//	public TestsCustom findTestsByName(String paperName) throws Exception {
//		// TODO Auto-generated method stub
//		return testMapper.findTestsByName(paperName);
//	}
	
	@Override
	public List<TestsCustom> getTestsListById(Integer paperID) {
		try {
			return testMapper.getTestsListById(paperID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public TestsCustom findTestsById(Integer paperID) throws Exception {
		// TODO Auto-generated method stub
		return testMapper.findTestsById(paperID);
	}
	
	
	@Override
	public List<PaperCustom> findPaperList(PaperQueryVo paperQueryVo){
		try {
			return testMapper.findPaperList(paperQueryVo);
		}catch (Exception f) {
			// TODO: handle exception
			f.printStackTrace();
		}
		return null;
	}
	@Override
	public PaperCustom findTestPaperByName(String papername) throws Exception {
		return testMapper.findTestPaperByName(papername);
	}
	
	@Override
	public List<RecordsCustom> getRecordsListByName(String username) {
		try {
			return testMapper.getRecordsListByName(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public RecordsCustom findRecordsByName(String username) throws Exception{
		return  testMapper.findRecordsByName(username);
	}
	
	@Override
	public TestPaper getTestPaperbyId(int paperID) {
		// TODO Auto-generated method stub
		return testMapper.getTestPaperbyId(paperID);
	}
	@Override
	public TestPaper getTestPaperbyName(String papername) {
		// TODO Auto-generated method stub
		return testMapper.getTestPaperbyName(papername);
	}
	
	@Override
	public void records(Records records){

		testMapper.records(records);
	}
	@Override
	public Tests geTestsById(Integer testsID) {
		// TODO Auto-generated method stub
		return testMapper.geTestsById(testsID);
	}
	
	
}

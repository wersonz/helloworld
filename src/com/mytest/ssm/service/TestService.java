package com.mytest.ssm.service;
import java.util.List;

import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.Records;
import com.mytest.ssm.po.RecordsCustom;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;
import com.mytest.ssm.po.TestsCustom;


public interface TestService {
	
	public TestPaper getTestPaperbyId(int paperID);
	public TestPaper getTestPaperbyName(String papername);
//	public Tests getTestsbyId(int paperID);
	
	public List<TestsCustom> getTestsListById(Integer paperID);
	public TestsCustom findTestsById(Integer paperID) throws Exception;
	
	
	public List<PaperCustom> findPaperList(PaperQueryVo paperQueryVo);
	public PaperCustom findTestPaperByName(String papername) throws Exception;
	public void records(Records records);
	
	public List<RecordsCustom> getRecordsListByName(String username);
	
	public RecordsCustom findRecordsByName(String username) throws Exception;
	
	public Tests geTestsById(Integer testsID);
}

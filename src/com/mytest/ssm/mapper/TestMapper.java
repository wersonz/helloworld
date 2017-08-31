package com.mytest.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.Records;
import com.mytest.ssm.po.RecordsCustom;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;
import com.mytest.ssm.po.TestsCustom;

public interface TestMapper {
	public TestPaper getTestPaperbyId(int paperID);
	public TestPaper getTestPaperbyName(String papername);
//	public Tests getTestsbyId(int paperID);
	
//	public List<TestsCustom> getTestsListByName(String papername) throws Exception;
//	public TestsCustom findTestsByName(String paperName) throws Exception;
	
	public List<TestsCustom> getTestsListById(Integer paperID) throws Exception;
	public TestsCustom findTestsById(Integer paperID) throws Exception;
	
	public List<PaperCustom> findPaperList(PaperQueryVo paperQueryVo) throws Exception;
	public PaperCustom findTestPaperByName(String papername) throws Exception;

	public void records(Records records);
	
	public List<RecordsCustom> getRecordsListByName(String username) throws Exception;
	public RecordsCustom findRecordsByName(String username) throws Exception;
	
	@Select("select * from tests where testsID = #{testsID} and signt = 1")
	public Tests geTestsById(Integer testsID);
}

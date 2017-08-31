package com.mytest.ssm.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.mytest.ssm.po.Issuer;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;

public interface AdminMapper {

//    public Issuer getIssuerById(int issuerID);

	public Issuer getIssuerByName(String issuername);
	

	@Insert("insert into issuer values(#{issuerID},#{issuername},#{password})")
	public void register(Issuer issuer);
	
	@Insert("insert into testpaper values(#{paperID},#{papername},#{issuerID},#{classID},#{classname},#{testsnum},#{totalscore},#{analyzeA},#{analyzeB},#{analyzeC},#{paperrank},#{sign})")
	public void testPaper(TestPaper testPaper);

	@Update("update testpaper set papername = #{papername}, classname=#{classname},testsnum=#{testsnum},totalscore=#{totalscore},analyzeA=#{analyzeA},analyzeB=#{analyzeB},analyzeC=#{analyzeC} where paperID=#{paperID}")
	public void updatePaper(TestPaper testPaper);
	
	@Update("update testpaper set sign = 0 where paperID = #{paperID}")
	public void deletePaper(TestPaper testPaper);
	
	@Update("update tests set title=#{title},optionA=#{optionA},optionB=#{optionB},optionC=#{optionC},optionD=#{optionD},scoreA=#{scoreA},scoreB=#{scoreB},scoreC=#{scoreC},scoreD=#{scoreD} where testsID = #{testsID}")
	public void alterTests(Tests tests);
	
	@Update("update tests set signt = 0 where testsID = #{testsID}")
	public void deleteTests(Tests tests);
	
	@Insert("insert into tests values(#{testsID},#{title},#{papername},#{paperID},#{optionA},#{optionB},#{optionC},#{optionD},#{scoreA},#{scoreB},#{scoreC},#{scoreD},#{signt})")
	public void addTests(Tests tests);
}

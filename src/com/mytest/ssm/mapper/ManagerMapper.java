package com.mytest.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mytest.ssm.po.Admin;
import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.TestPaper;

public interface ManagerMapper {
 
	@Select("select * from admin where adminname=#{adminname}")
	public Admin getAdminByName(String adminname);
	
	@Update("update testpaper set paperrank=paperrank+1 where paperID=#{paperID}")
	public void uppaperrank(TestPaper testPaper);
	
	@Update("update testpaper set paperrank=paperrank-1 where paperID=#{paperID}")
	public void despaperrank(TestPaper testPaper);
	
	@Update("update testpaper set sign=1 where paperID=#{paperID}")
	public void recyclepaper(TestPaper testPaper);
	
	@Select("select * from testpaper where sign = 1 and paperrank = 3")
	public List<PaperCustom> findWaitPaperList(PaperQueryVo paperQueryVo);
	
	@Select("select * from testpaper where sign = 0")
	public List<PaperCustom> findDeletedPaperList(PaperQueryVo paperQueryVo);
}

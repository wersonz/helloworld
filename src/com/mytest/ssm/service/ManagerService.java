package com.mytest.ssm.service;

import java.util.List;

import com.mytest.ssm.po.Admin;
import com.mytest.ssm.po.PaperCustom;
import com.mytest.ssm.po.PaperQueryVo;
import com.mytest.ssm.po.TestPaper;

public interface ManagerService {
    
	public Admin getAdminByName(String adminname);

	public void uppaperrank(TestPaper testPaper);
	
	public void recyclepaper(TestPaper testPaper);
	
	public void despaperrank(TestPaper testPaper);
	
	public List<PaperCustom> findWaitPaperList(PaperQueryVo paperQueryVo);
	
	public List<PaperCustom> findDeletedPaperList(PaperQueryVo paperQueryVo);
}

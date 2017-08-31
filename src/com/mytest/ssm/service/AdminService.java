package com.mytest.ssm.service;

import com.mytest.ssm.po.Issuer;
import com.mytest.ssm.po.Records;
import com.mytest.ssm.po.TestPaper;
import com.mytest.ssm.po.Tests;

public interface AdminService {

	public Issuer getIssuerByName(String issuername);
//	public Issuer getIssuerById(int issuerID);

	public void register(Issuer issuer);

	public void testPaper(TestPaper testPaper);
	
	public void updatePaper(TestPaper testPaper);
	
	public void deletePaper(TestPaper testPaper);
	
	public void alterTests(Tests tests);
	
	public void deleteTests(Tests tests);
	
	public void addTests(Tests tests);
}

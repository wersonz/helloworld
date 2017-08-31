package com.mytest.ssm.po;

public class PaperCustom extends TestPaper {
	
	public PaperCustom() {
		// TODO Auto-generated constructor stub
	}
	public PaperCustom(Integer paperID, String papername, Integer issuerID, Integer classID, String classname,
			Integer testsnum, Float totalscore, String analyzeA, String analyzeB, String analyzeC, Integer paperrank,
			Integer sign) {
		super(paperID,papername,issuerID,classID,classname,testsnum,totalscore,analyzeA,analyzeB,analyzeC,paperrank,sign);
	}

}

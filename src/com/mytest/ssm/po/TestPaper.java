package com.mytest.ssm.po;

import java.math.BigDecimal;

public class TestPaper {
    private Integer paperID;
    private String papername;
    private Integer issuerID;
    private Integer classID;
    private String classname;
    private Integer testsnum;
    private Float totalscore;
    private String analyzeA;
    private String analyzeB;
    private String analyzeC;
    private Integer paperrank;
    private Integer sign;
	public Integer getPaperID() {
		return paperID;
	}
	public void setPaperID(Integer paperID) {
		this.paperID = paperID;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public Integer getIssuerID() {
		return issuerID;
	}
	public void setIssuerID(Integer issuerID) {
		this.issuerID = issuerID;
	}
	public Integer getClassID() {
		return classID;
	}
	public void setClassID(Integer classID) {
		this.classID = classID;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Integer getTestsnum() {
		return testsnum;
	}
	public void setTestsnum(Integer testsnum) {
		this.testsnum = testsnum;
	}
	
	public Float getTotalscore() {
		return totalscore;
	}
	public void setTotalscore(Float totalscore) {
		this.totalscore = totalscore;
	}
	public String getAnalyzeA() {
		return analyzeA;
	}
	public void setAnalyzeA(String analyzeA) {
		this.analyzeA = analyzeA;
	}
	public String getAnalyzeB() {
		return analyzeB;
	}
	public void setAnalyzeB(String analyzeB) {
		this.analyzeB = analyzeB;
	}
	public String getAnalyzeC() {
		return analyzeC;
	}
	public void setAnalyzeC(String analyzeC) {
		this.analyzeC = analyzeC;
	}
	public Integer getPaperrank() {
		return paperrank;
	}
	public void setPaperrank(Integer paperrank) {
		this.paperrank = paperrank;
	}
	
	public Integer getSign() {
		return sign;
	}
	public void setSign(Integer sign) {
		this.sign = sign;
	}
	
	public TestPaper(Integer paperID, String papername, Integer issuerID, Integer classID, String classname,
			Integer testsnum, Float totalscore, String analyzeA, String analyzeB, String analyzeC, Integer paperrank,
			Integer sign) {
		super();
		this.paperID = paperID;
		this.papername = papername;
		this.issuerID = issuerID;
		this.classID = classID;
		this.classname = classname;
		this.testsnum = testsnum;
		this.totalscore = totalscore;
		this.analyzeA = analyzeA;
		this.analyzeB = analyzeB;
		this.analyzeC = analyzeC;
		this.paperrank = paperrank;
		this.sign = sign;
	}
	public TestPaper() {
		
		// TODO Auto-generated constructor stub
	}
    
}

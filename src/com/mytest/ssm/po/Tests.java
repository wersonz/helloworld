package com.mytest.ssm.po;

import java.math.BigDecimal;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Tests {
    private Integer testsID;
    
    private String title;
    
    private String papername;
    
    public String getPapername() {
		return papername;
	}

	public void setPapername(String papername) {
		this.papername = papername;
	}

	private Integer paperID;

    private String optionA;
    
    private String optionB;
    
    private String optionC;
    
    private String optionD;
    
    private Float scoreA;
    
    private Float scoreB;
    
    private Float scoreC;
    
    private Float scoreD;
    
    private Integer signt;
    
    
    
	public Integer getSignt() {
		return signt;
	}

	public void setSignt(Integer signt) {
		this.signt = signt;
	}

	public Integer getTestsID() {
		return testsID;
	}

	public void setTestsID(Integer testsID) {
		this.testsID = testsID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPaperID() {
		return paperID;
	}

	public void setPaperID(Integer paperID) {
		this.paperID = paperID;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	
    public Float getScoreA() {
		return scoreA;
	}

	public void setScoreA(Float scoreA) {
		this.scoreA = scoreA;
	}

	public Float getScoreB() {
		return scoreB;
	}

	public void setScoreB(Float scoreB) {
		this.scoreB = scoreB;
	}

	public Float getScoreC() {
		return scoreC;
	}

	public void setScoreC(Float scoreC) {
		this.scoreC = scoreC;
	}

	public Float getScoreD() {
		return scoreD;
	}

	public void setScoreD(Float scoreD) {
		this.scoreD = scoreD;
	}

	public Tests() {
    	
    }

	public Tests(Integer testsID, String title, String papername, Integer paperID, String optionA, String optionB,
			String optionC, String optionD, Float scoreA, Float scoreB, Float scoreC, Float scoreD, Integer signt) {
		super();
		this.testsID = testsID;
		this.title = title;
		this.papername = papername;
		this.paperID = paperID;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
		this.scoreC = scoreC;
		this.scoreD = scoreD;
		this.signt = signt;
	}
	
    
    
}

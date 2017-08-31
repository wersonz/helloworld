package com.mytest.ssm.po;

import java.util.Date;

public class Records {
    private Integer recordsID;
    private Integer userID;
    private String username;
    private Integer paperID;
    private String papername;
    private Float grade;
    private String analyze;
    private String testtime;
	public Integer getRecordsID() {
		return recordsID;
	}
	public void setRecordsID(Integer recordsID) {
		this.recordsID = recordsID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
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
	public float getGrade() {
		return grade;
	}
	public void setGrade(Float grade) {
		this.grade = grade;
	}
	public String getAnalyze() {
		return analyze;
	}
	public void setAnalyze(String analyze) {
		this.analyze = analyze;
	}
	
	public String getTesttime() {
		return testtime;
	}
	public void setTesttime(String testtime) {
		this.testtime = testtime;
	}
	public Records() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Records(Integer recordsID, Integer userID, String username, Integer paperID, String papername, Float grade,
			String analyze, String testtime) {
		super();
		this.recordsID = recordsID;
		this.userID = userID;
		this.username = username;
		this.paperID = paperID;
		this.papername = papername;
		this.grade = grade;
		this.analyze = analyze;
		this.testtime = testtime;
	}
	
    
}

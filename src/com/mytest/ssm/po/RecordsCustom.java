package com.mytest.ssm.po;

public class RecordsCustom extends Records{
	public RecordsCustom() {
		// TODO Auto-generated constructor stub
	}
    public RecordsCustom(Integer recordsID, Integer userID, String username, Integer paperID, String papername, Float grade,
			String analyze, String testtime) {
    	super(recordsID,userID,username,paperID,papername,grade,analyze,testtime);
    }
}

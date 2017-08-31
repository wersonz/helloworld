package com.mytest.ssm.po;

import java.math.BigDecimal;

public class TestsCustom extends Tests {
    public TestsCustom() {
		// TODO Auto-generated constructor stub
	}
	public TestsCustom(Integer testsID, String title, String papername, Integer paperID, String optionA, String optionB,
					String optionC, String optionD, Float scoreA, Float scoreB, Float scoreC, Float scoreD, Integer signt) {
		super(testsID,title,papername,paperID,optionA,optionB,optionC,optionD,scoreA,scoreB,scoreC,scoreD, signt);
	}
}

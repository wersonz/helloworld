package com.mytest.ssm.po;

import java.util.List;

public class TestsQueryVo {

	private Tests tests;
	private TestsCustom testsCustom;
	private List<TestsCustom> testsList;
	public Tests getTests() {
		return tests;
	}
	public void setTests(Tests tests) {
		this.tests = tests;
	}
	public TestsCustom getTestsCustom() {
		return testsCustom;
	}
	public void setTestsCustom(TestsCustom testsCustom) {
		this.testsCustom = testsCustom;
	}
	public List<TestsCustom> getTestsList() {
		return testsList;
	}
	public void setTestsList(List<TestsCustom> testsList) {
		this.testsList = testsList;
	}
	
}

package com.mytest.ssm.po;

public class Issuer {
	private Integer issuerID;
	private String issuername;
	private String password;
	public Integer getIssuerID() {
		return issuerID;
	}
	public void setIssuerID(Integer issuerID) {
		this.issuerID = issuerID;
	}
	public String getIssuername() {
		return issuername;
	}
	public void setIssuername(String issuername) {
		this.issuername = issuername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Issuer() {
		// TODO Auto-generated constructor stub
	}
	public Issuer(Integer issuerID, String issuername, String password) {
		super();
		this.issuerID = issuerID;
		this.issuername = issuername;
		this.password = password;
	}
	

}

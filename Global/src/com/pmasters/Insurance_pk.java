package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class Insurance_pk implements Serializable {
	@Id
	String COMPANY_CODE="";
	@Id
	String INSR_CODE="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getINSR_CODE() {
		return INSR_CODE;
	}
	
	public Insurance_pk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setINSR_CODE(String iNSR_CODE) {
		INSR_CODE = iNSR_CODE;
	}
	public Insurance_pk(String cOMPANY_CODE, String iNSR_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		INSR_CODE = iNSR_CODE;
	}	

}

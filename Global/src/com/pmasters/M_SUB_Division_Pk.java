package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_SUB_Division_Pk implements Serializable  {
	
	@Id
	private String COMPANY_CODE="";
	@Id
	private String DIV_CODE="";
	@Id
	private String SUBDIV_CODE=""; 

	public M_SUB_Division_Pk() {
		// TODO Auto-generated constructor stub
	}

	public M_SUB_Division_Pk(String cOMPANY_CODE, String dIV_CODE,
			String sUBDIV_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		DIV_CODE = dIV_CODE;
		SUBDIV_CODE = sUBDIV_CODE;
	}
	

}

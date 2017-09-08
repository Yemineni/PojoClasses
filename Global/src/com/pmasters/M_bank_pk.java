package com.pmasters;

import java.io.Serializable;

public class M_bank_pk implements Serializable  {

	public M_bank_pk() {
		// TODO Auto-generated constructor stub
	}
	private String BANK_CODE="";
	private String COMPANY_CODE="";
	public M_bank_pk(String bANK_CODE, String cOMPANY_CODE) {
		super();
		BANK_CODE = bANK_CODE;
		COMPANY_CODE = cOMPANY_CODE;
	}
	

	
	
}

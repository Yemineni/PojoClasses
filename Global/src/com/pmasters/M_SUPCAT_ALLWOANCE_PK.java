package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_SUPCAT_ALLWOANCE_PK implements Serializable{

	@Id
	String COMPANY_CODE="";
	@Id
	String 	SUPER_CATEGORY_CODE="";
	@Id
	String ALLW_CODE  ="";
	public M_SUPCAT_ALLWOANCE_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public M_SUPCAT_ALLWOANCE_PK(String cOMPANY_CODE,
			String sUPER_CATEGORY_CODE, String aLLW_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
		ALLW_CODE = aLLW_CODE;
	}
	
	
}

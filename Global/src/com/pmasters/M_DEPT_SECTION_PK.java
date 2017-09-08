package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_DEPT_SECTION_PK implements Serializable {
	

	public M_DEPT_SECTION_PK() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	@Id
	String DEPT_CODE="";
	@Id
	String SECTION_CODE="";
	public M_DEPT_SECTION_PK(String cOMPANY_CODE, String dEPT_CODE,
			String sECTION_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		DEPT_CODE = dEPT_CODE;
		SECTION_CODE = sECTION_CODE;
	}
	
	
	

}

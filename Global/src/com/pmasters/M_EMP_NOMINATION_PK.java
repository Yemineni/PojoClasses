package com.pmasters;

import javax.persistence.Id;

public class M_EMP_NOMINATION_PK {

	public M_EMP_NOMINATION_PK() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Id
	String NOMINATION_TYPE="";
	public M_EMP_NOMINATION_PK(String cOMPANY_CODE, String eMP_CODE,
			String nOMINATION_TYPE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		NOMINATION_TYPE = nOMINATION_TYPE;
	}

}

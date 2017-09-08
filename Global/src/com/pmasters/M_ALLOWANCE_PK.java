package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_ALLOWANCE_PK implements Serializable {
	
	@Id
	String 	COMPANY_CODE="";
		@Id
	String	ALLW_CODE="";
		public M_ALLOWANCE_PK() {
			super();
			// TODO Auto-generated constructor stub
		}
		public M_ALLOWANCE_PK(String cOMPANY_CODE, String aLLW_CODE) {
			super();
			COMPANY_CODE = cOMPANY_CODE;
			ALLW_CODE = aLLW_CODE;
		}

}

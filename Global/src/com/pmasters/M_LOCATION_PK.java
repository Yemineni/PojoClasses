package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_LOCATION_PK implements Serializable {

	public M_LOCATION_PK() {
		// TODO Auto-generated constructor stub
	}

	
	 @Id
		String COMPANY_CODE="";
	   @Id
		String LOC_CODE="";
	public M_LOCATION_PK(String cOMPANY_CODE, String lOC_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		LOC_CODE = lOC_CODE;
	}
	   
}

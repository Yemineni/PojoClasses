package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_EME_LOCATION_PK implements Serializable {
	
	@Id
	String COMPANY_CODE="";
	@Id
	String EME_LOC_CODE="";
	public M_EME_LOCATION_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public M_EME_LOCATION_PK(String cOMPANY_CODE, String eME_LOC_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EME_LOC_CODE = eME_LOC_CODE;
	}
	

}

package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_TRACKING_PK implements Serializable {
	
	@Id
	String COMPANY_CODE="";
	@Id
	String TRACKING_CODE="";
	public M_TRACKING_PK(String cOMPANY_CODE, String tRACKING_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		TRACKING_CODE = tRACKING_CODE;
	}
	public M_TRACKING_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

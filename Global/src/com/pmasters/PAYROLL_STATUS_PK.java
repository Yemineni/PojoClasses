package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class PAYROLL_STATUS_PK implements Serializable {
	
	@Id
	String COMPANY_CODE="";
	@Id
	String DIV_CODE="";
	@Id
	String 	SUBDIV_CODE="";
	@Id
	String SUPER_CATEGORY_CODE="";
	@Id
	String SAL_MONTH="";
	public PAYROLL_STATUS_PK(String cOMPANY_CODE, String dIV_CODE,
			String sUBDIV_CODE, String sUPER_CATEGORY_CODE, String sAL_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		DIV_CODE = dIV_CODE;
		SUBDIV_CODE = sUBDIV_CODE;
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
		SAL_MONTH = sAL_MONTH;
	}
	public PAYROLL_STATUS_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

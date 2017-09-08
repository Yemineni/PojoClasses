package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class T_EMP_SUBSISTANCE_PK implements Serializable  {

	public T_EMP_SUBSISTANCE_PK() {
		// TODO Auto-generated constructor stub
	}

	@Id
	String  COMPANY_CODE="";
	@Id
	String EMP_CODE ="";
	@Id
	String 	PERIOD_FROM="";
	public T_EMP_SUBSISTANCE_PK(String cOMPANY_CODE, String eMP_CODE,
			String pERIOD_FROM) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		PERIOD_FROM = pERIOD_FROM;
	}
	
	
}

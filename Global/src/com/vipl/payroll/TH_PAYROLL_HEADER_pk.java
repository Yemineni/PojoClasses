package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class TH_PAYROLL_HEADER_pk  implements Serializable{

	public TH_PAYROLL_HEADER_pk() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TH_PAYROLL_HEADER_pk(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
	}
	@Id
String 	COMPANY_CODE="";
	@Id
String	EMP_CODE ="";
	@Id
String 	SAL_MONTH =""; 

}

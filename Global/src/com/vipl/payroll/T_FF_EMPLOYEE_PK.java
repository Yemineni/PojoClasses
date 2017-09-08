package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class T_FF_EMPLOYEE_PK implements Serializable {

	public T_FF_EMPLOYEE_PK() {
		// TODO Auto-generated constructor stub
	}

	@Id
	 String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	public T_FF_EMPLOYEE_PK(String cOMPANY_CODE, String eMP_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
	}
	
	
	
}

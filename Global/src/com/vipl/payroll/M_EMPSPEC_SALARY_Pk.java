package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class M_EMPSPEC_SALARY_Pk implements Serializable {

	public M_EMPSPEC_SALARY_Pk() {
		// TODO Auto-generated constructor stub
	}

	@Id  String COMPANY_CODE="";    
	@Id  String EMP_CODE="";
	@Id  String ALLW_CODE="";
	
	public M_EMPSPEC_SALARY_Pk(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
	}
	
	
}

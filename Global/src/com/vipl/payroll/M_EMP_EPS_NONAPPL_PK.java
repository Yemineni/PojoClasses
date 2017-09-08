package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class M_EMP_EPS_NONAPPL_PK implements Serializable {

	public M_EMP_EPS_NONAPPL_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id  String COMPANY_CODE="";    
	@Id  String EMP_CODE="";
	
	public M_EMP_EPS_NONAPPL_PK(String cOMPANY_CODE, String eMP_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
	}     
	
	
	

}

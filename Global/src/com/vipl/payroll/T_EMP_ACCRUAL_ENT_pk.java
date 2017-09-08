package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class T_EMP_ACCRUAL_ENT_pk  implements Serializable
{
	public T_EMP_ACCRUAL_ENT_pk() {	}
	
	@Id  String COMPANY_CODE="";       
	@Id  String EMP_CODE="";          
	@Id  String ENTITLED_FROM="";             
	@Id  String ALLW_CODE ="";
	public T_EMP_ACCRUAL_ENT_pk(String cOMPANY_CODE, String eMP_CODE,
			String eNTITLED_FROM, String aLLW_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ENTITLED_FROM = eNTITLED_FROM;
		ALLW_CODE = aLLW_CODE;
	}        
}

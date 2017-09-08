package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class FFD_EARN_PAYROLL_pk implements Serializable {

	public FFD_EARN_PAYROLL_pk() {
		// TODO Auto-generated constructor stub
	}
	
	
	public FFD_EARN_PAYROLL_pk(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE, String aTTEND_MONTH, String sAL_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
		SAL_MONTH = sAL_MONTH;
	}


	@Id
	String COMPANY_CODE;   
	@Id String EMP_CODE;
		@Id String ALLW_CODE;      
	@Id String ATTEND_MONTH;          
	@Id String SAL_MONTH   ;    

}

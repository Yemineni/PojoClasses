package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class FFD_DED_PTAX_PK implements Serializable {

	public FFD_DED_PTAX_PK() {
		// TODO Auto-generated constructor stub
	}

	@Id String COMPANY_CODE;   
	@Id String EMP_CODE;
	@Id String ALLW_CODE;      
	@Id String SAL_MONTH   ;  
	@Id  String ATTEND_MONTH;
	public FFD_DED_PTAX_PK(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE, String sAL_MONTH, String aTTEND_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		SAL_MONTH = sAL_MONTH;
		ATTEND_MONTH = aTTEND_MONTH;
	}
	
	
	
}

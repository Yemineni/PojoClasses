package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class FFD_DED_LOANS_pk  implements Serializable {
	
	@Id String COMPANY_CODE;   
	@Id String EMP_CODE;
	@Id String ALLW_CODE;      
	@Id String SAL_MONTH   ;  
	@Id String LOANDISB_UNIQUE_NO;
	public FFD_DED_LOANS_pk(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE, String sAL_MONTH, String lOANDISB_UNIQUE_NO) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		SAL_MONTH = sAL_MONTH;
		LOANDISB_UNIQUE_NO = lOANDISB_UNIQUE_NO;
	}
	public FFD_DED_LOANS_pk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}

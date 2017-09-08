package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class T_SAL_HOLD_PK implements Serializable {

	public T_SAL_HOLD_PK() {
		
	}
	
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Id
	 String  ATTEND_MONTH;
	public T_SAL_HOLD_PK(String cOMPANY_CODE, String eMP_CODE,
			String aTTEND_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
	}
	
	}

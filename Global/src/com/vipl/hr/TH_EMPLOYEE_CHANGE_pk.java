package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

public class TH_EMPLOYEE_CHANGE_pk implements Serializable {
	@Id String COMPANY_CODE="";   
	@Id int TRAIL_SEQ_NO=0;     
	@Id String SAL_MONTH ="";
	public TH_EMPLOYEE_CHANGE_pk(String cOMPANY_CODE, int tRAIL_SEQ_NO,
			String sAL_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		TRAIL_SEQ_NO = tRAIL_SEQ_NO;
		SAL_MONTH = sAL_MONTH;
	}
	public TH_EMPLOYEE_CHANGE_pk() {
		super();
		// TODO Auto-generated constructor stub
	}     
}

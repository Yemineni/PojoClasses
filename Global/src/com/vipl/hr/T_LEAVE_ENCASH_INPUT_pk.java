package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

public class T_LEAVE_ENCASH_INPUT_pk implements Serializable {

	public T_LEAVE_ENCASH_INPUT_pk() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public T_LEAVE_ENCASH_INPUT_pk(String cOMPANY_CODE, String sAL_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SAL_MONTH = sAL_MONTH;
	}



	@Id String COMPANY_CODE="";     
	@Id String SAL_MONTH="";               
	

}

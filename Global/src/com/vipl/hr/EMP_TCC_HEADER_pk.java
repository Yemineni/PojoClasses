package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

public class EMP_TCC_HEADER_pk implements Serializable {

	@Id String COMPANY_CODE="";  
	@Id String EMP_CODE =""; 
	@Id String EFFECTIVE_DATE="";
	public EMP_TCC_HEADER_pk(String cOMPANY_CODE, String eMP_CODE,
			String eFFECTIVE_DATE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public EMP_TCC_HEADER_pk() {
		super();
		// TODO Auto-generated constructor stub
	}   
	
	
}

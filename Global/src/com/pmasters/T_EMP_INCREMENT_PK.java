package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class T_EMP_INCREMENT_PK implements Serializable {

	public T_EMP_INCREMENT_PK() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE       ="";
	@Id
	String EFFECTIVE_DATE     ="";  
	@Id
	String ALLW_CODE        ="";
	public T_EMP_INCREMENT_PK(String cOMPANY_CODE, String eMP_CODE,
			String eFFECTIVE_DATE, String aLLW_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		ALLW_CODE = aLLW_CODE;
	}
	
	
	

}

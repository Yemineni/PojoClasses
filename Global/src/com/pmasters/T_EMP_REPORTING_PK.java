package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class T_EMP_REPORTING_PK  implements Serializable{

	public T_EMP_REPORTING_PK() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Id
	Date EFFECTIVE_DATE;
	public T_EMP_REPORTING_PK(String cOMPANY_CODE, String eMP_CODE,
			Date eFFECTIVE_DATE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	
	
}

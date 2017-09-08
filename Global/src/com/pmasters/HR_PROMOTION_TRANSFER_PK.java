package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class HR_PROMOTION_TRANSFER_PK  implements Serializable {

	public HR_PROMOTION_TRANSFER_PK() {
		// TODO Auto-generated constructor stub
	}

	@Id
	String COMPANY_CODE ="";
	@Id
	String SAL_MONTH;
	@Id
	String EMP_CODE="";
	public HR_PROMOTION_TRANSFER_PK(String cOMPANY_CODE, String sAL_MONTH,
			String eMP_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SAL_MONTH = sAL_MONTH;
		EMP_CODE = eMP_CODE;
	}
	
	
}

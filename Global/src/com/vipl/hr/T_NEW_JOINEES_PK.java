package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

public class T_NEW_JOINEES_PK implements Serializable {

	public T_NEW_JOINEES_PK() {
}
	@Id String COMPANY_CODE ="";   
	@Id String EMP_CODE    =""; 
	@Id String SAL_MONTH    ="";
	public T_NEW_JOINEES_PK(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
	}     
	
	

}

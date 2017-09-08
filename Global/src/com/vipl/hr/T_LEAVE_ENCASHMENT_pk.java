package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

public class T_LEAVE_ENCASHMENT_pk  implements Serializable {

	public T_LEAVE_ENCASHMENT_pk() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id String COMPANY_CODE="";   
	@Id String EMP_CODE="";      
	@Id String SAL_MONTH="";             
	@Id String ATTEND_MONTH="";
	public T_LEAVE_ENCASHMENT_pk(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH, String aTTEND_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
		ATTEND_MONTH = aTTEND_MONTH;
	}  
	
	

}

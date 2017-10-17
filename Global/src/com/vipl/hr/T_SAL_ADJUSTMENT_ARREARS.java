package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class T_SAL_ADJUSTMENT_ARREARS implements Serializable {

	public T_SAL_ADJUSTMENT_ARREARS() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE="";   
	@Id String EMP_CODE="";  
	@Id String SAL_MONTH="";          
	@Id String ALLW_CODE="";     
	@Column float AMOUNT=0.0f;  
	@Id String ATTEND_MONTH="";          
	@Column String  ADH_REMARKS=""; 
	@Column String  CREATION_DATE="";          
	@Column String  USER_ID="";  
	@Column float  MASTER_ENT_AMT=0.0f;  
	@Column String MACHINE_ID=""; 
	Syste
	
	
	
}

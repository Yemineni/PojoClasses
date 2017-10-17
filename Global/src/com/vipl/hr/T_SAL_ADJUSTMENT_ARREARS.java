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
	
	
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public float getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(float aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getADH_REMARKS() {
		return ADH_REMARKS;
	}
	public void setADH_REMARKS(String aDH_REMARKS) {
		ADH_REMARKS = aDH_REMARKS;
	}
	public String getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public float getMASTER_ENT_AMT() {
		return MASTER_ENT_AMT;
	}
	public void setMASTER_ENT_AMT(float mASTER_ENT_AMT) {
		MASTER_ENT_AMT = mASTER_ENT_AMT;
	}
	public String getMACHINE_ID() {
		return MACHINE_ID;
	}
	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}   
	

	
	
	
}

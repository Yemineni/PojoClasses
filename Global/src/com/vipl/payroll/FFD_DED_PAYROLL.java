package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HR.FFD_DED_PAYROLL")
@IdClass(FFD_EARN_PAYROLL_pk.class)

public class FFD_DED_PAYROLL implements Serializable {

	public FFD_DED_PAYROLL() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	String COMPANY_CODE;   
	@Id String EMP_CODE;
		@Id String ALLW_CODE;      
	@Id String ATTEND_MONTH;          
	@Id String SAL_MONTH   ;  
	
	@Column String ALLW_AMOUNT;   
	@Column String HR_FIN_FLAG ;   
	@Column String CREATION_DATE;         
	@Column String USER_ID      ; 
	@Column String MACHINE_ID  ;
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
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getALLW_AMOUNT() {
		return ALLW_AMOUNT;
	}
	public void setALLW_AMOUNT(String aLLW_AMOUNT) {
		ALLW_AMOUNT = aLLW_AMOUNT;
	}
	public String getHR_FIN_FLAG() {
		return HR_FIN_FLAG;
	}
	public void setHR_FIN_FLAG(String hR_FIN_FLAG) {
		HR_FIN_FLAG = hR_FIN_FLAG;
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
	public String getMACHINE_ID() {
		return MACHINE_ID;
	}
	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}
	public FFD_DED_PAYROLL(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE, String aTTEND_MONTH, String sAL_MONTH,
			String aLLW_AMOUNT, String hR_FIN_FLAG, String cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
		SAL_MONTH = sAL_MONTH;
		ALLW_AMOUNT = aLLW_AMOUNT;
		HR_FIN_FLAG = hR_FIN_FLAG;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	
	
	
	

}

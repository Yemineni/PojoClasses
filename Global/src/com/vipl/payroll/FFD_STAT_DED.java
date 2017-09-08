package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="HR.FFD_STAT_DED")
@IdClass(FFD_EARN_PAYROLL_pk.class)
public class FFD_STAT_DED implements Serializable {
	public FFD_STAT_DED() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE;   
	@Id String EMP_CODE;
	@Id String ALLW_CODE;      
	@Id String ATTEND_MONTH;          
	@Id String SAL_MONTH   ;  
	@Column String EARNING_AMOUNT;   
	@Column String EMPLOYER_CONTRI ;   
	@Column String EMPLOYEE_CONTRI ;   
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
	public String getEARNING_AMOUNT() {
		return EARNING_AMOUNT;
	}
	public void setEARNING_AMOUNT(String eARNING_AMOUNT) {
		EARNING_AMOUNT = eARNING_AMOUNT;
	}
	public String getEMPLOYER_CONTRI() {
		return EMPLOYER_CONTRI;
	}
	public void setEMPLOYER_CONTRI(String eMPLOYER_CONTRI) {
		EMPLOYER_CONTRI = eMPLOYER_CONTRI;
	}
	public String getEMPLOYEE_CONTRI() {
		return EMPLOYEE_CONTRI;
	}
	public void setEMPLOYEE_CONTRI(String eMPLOYEE_CONTRI) {
		EMPLOYEE_CONTRI = eMPLOYEE_CONTRI;
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
	public FFD_STAT_DED(String cOMPANY_CODE, String eMP_CODE, String aLLW_CODE,
			String aTTEND_MONTH, String sAL_MONTH, String eARNING_AMOUNT,
			String eMPLOYER_CONTRI, String eMPLOYEE_CONTRI,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
		SAL_MONTH = sAL_MONTH;
		EARNING_AMOUNT = eARNING_AMOUNT;
		EMPLOYER_CONTRI = eMPLOYER_CONTRI;
		EMPLOYEE_CONTRI = eMPLOYEE_CONTRI;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	
	

}

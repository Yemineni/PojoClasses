package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="hr.T_LEAVE_ENCASHMENT")
@IdClass(T_LEAVE_ENCASHMENT_pk.class)
public class T_LEAVE_ENCASHMENT implements Serializable  {

	public T_LEAVE_ENCASHMENT() {
		// TODO Auto-generated constructor stub
	}

	
	@Id String COMPANY_CODE="";   
	@Id String EMP_CODE="";      
	@Id String SAL_MONTH="";             
	@Id String ATTEND_MONTH="";          
	@Column String LEAVE_ENCASH_DAYS="";            
	@Column String LEAVE_ENCASH_AMOUNT="";         
	@Column String CREATION_DATE="";                       
	@Column String USER_ID="";                     
	@Column String  MACHINE_ID="";
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
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getLEAVE_ENCASH_DAYS() {
		return LEAVE_ENCASH_DAYS;
	}
	public void setLEAVE_ENCASH_DAYS(String lEAVE_ENCASH_DAYS) {
		LEAVE_ENCASH_DAYS = lEAVE_ENCASH_DAYS;
	}
	public String getLEAVE_ENCASH_AMOUNT() {
		return LEAVE_ENCASH_AMOUNT;
	}
	public void setLEAVE_ENCASH_AMOUNT(String lEAVE_ENCASH_AMOUNT) {
		LEAVE_ENCASH_AMOUNT = lEAVE_ENCASH_AMOUNT;
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
	public T_LEAVE_ENCASHMENT(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH, String aTTEND_MONTH, String lEAVE_ENCASH_DAYS,
			String lEAVE_ENCASH_AMOUNT, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
		ATTEND_MONTH = aTTEND_MONTH;
		LEAVE_ENCASH_DAYS = lEAVE_ENCASH_DAYS;
		LEAVE_ENCASH_AMOUNT = lEAVE_ENCASH_AMOUNT;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	
	
}

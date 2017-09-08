package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hr.t_leave_encash_input")

public class T_LEAVE_ENCASH_INPUT implements Serializable  {

	public T_LEAVE_ENCASH_INPUT() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Id String COMPANY_CODE="";     
	@Id String SAL_MONTH="";               
	@Column String SR_NO="";            
	@Column String EMP_CODE="";        
	@Column String ATTEND_MONTH="";            
	@Column String ENCASH_DAYS="";      
	@Column String ENCASH_AMOUNT="";   
	@Column String CREATION_DATE="";
	@Column String REMARKS="";        
	@Column String USER_ID="";         
	@Column String MACHINE_ID="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getSR_NO() {
		return SR_NO;
	}
	public void setSR_NO(String sR_NO) {
		SR_NO = sR_NO;
	}
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getENCASH_DAYS() {
		return ENCASH_DAYS;
	}
	public void setENCASH_DAYS(String eNCASH_DAYS) {
		ENCASH_DAYS = eNCASH_DAYS;
	}
	public String getENCASH_AMOUNT() {
		return ENCASH_AMOUNT;
	}
	public void setENCASH_AMOUNT(String eNCASH_AMOUNT) {
		ENCASH_AMOUNT = eNCASH_AMOUNT;
	}
	public String getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
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
	public T_LEAVE_ENCASH_INPUT(String cOMPANY_CODE, String sAL_MONTH,
			String sR_NO, String eMP_CODE, String aTTEND_MONTH,
			String eNCASH_DAYS, String eNCASH_AMOUNT, String cREATION_DATE,
			String rEMARKS, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SAL_MONTH = sAL_MONTH;
		SR_NO = sR_NO;
		EMP_CODE = eMP_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
		ENCASH_DAYS = eNCASH_DAYS;
		ENCASH_AMOUNT = eNCASH_AMOUNT;
		CREATION_DATE = cREATION_DATE;
		REMARKS = rEMARKS;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}   
	
	

}

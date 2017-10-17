package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HR.T_ATT_REG_INPUT")
@IdClass(T_ATT_REG_INPUT_PK.class)
public class T_ATT_REG_INPUT implements Serializable {
	@Id String COMPANY_CODE="";    
	@Id String SAL_MONTH ="";             
	@Column String SR_NO  ="";         
	@Column String EMP_CODE ="";      
	@Column String ATTEND_MONTH="";           
	@Column String ADJ_DAYS ="";       
	@Column String ADJ_REASON ="";    
	@Column String REMARKS ="";      
	@Column String CREATION_DATE ="";         
	@Column String USER_ID  ="";      
	@Column String MACHINE_ID="";
	
	public T_ATT_REG_INPUT(String cOMPANY_CODE, String sAL_MONTH, String sR_NO,
			String eMP_CODE, String aTTEND_MONTH, String aDJ_DAYS,
			String aDJ_REASON, String rEMARKS, String cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SAL_MONTH = sAL_MONTH;
		SR_NO = sR_NO;
		EMP_CODE = eMP_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
		ADJ_DAYS = aDJ_DAYS;
		ADJ_REASON = aDJ_REASON;
		REMARKS = rEMARKS;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	public T_ATT_REG_INPUT() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getADJ_DAYS() {
		return ADJ_DAYS;
	}
	public void setADJ_DAYS(String aDJ_DAYS) {
		ADJ_DAYS = aDJ_DAYS;
	}
	public String getADJ_REASON() {
		return ADJ_REASON;
	}
	public void setADJ_REASON(String aDJ_REASON) {
		ADJ_REASON = aDJ_REASON;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
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
}

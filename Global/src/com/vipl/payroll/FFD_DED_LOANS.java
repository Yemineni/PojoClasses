package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="HR.FFD_DED_LOANS")
@IdClass(FFD_DED_LOANS_pk.class)
public class FFD_DED_LOANS implements Serializable {

	public FFD_DED_LOANS() {
		// TODO Auto-generated constructor stub
	}

	
	@Id String COMPANY_CODE;   
	@Id String EMP_CODE;
	@Id String ALLW_CODE;      
	@Id String SAL_MONTH   ;  
	@Id String LOANDISB_UNIQUE_NO;
	@Column String ATTEND_MONTH;
	@Column String LOANREC_PRIN_AMOUNT;   
	@Column String LOANREC_INT_AMOUNT ;   
	@Column String LOANADV_CODE ;   
	@Column String LOANADV_DISBURSAL_REF;
	@Column String LOAN_AGENCY_CODE;   
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
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getLOANDISB_UNIQUE_NO() {
		return LOANDISB_UNIQUE_NO;
	}
	public void setLOANDISB_UNIQUE_NO(String lOANDISB_UNIQUE_NO) {
		LOANDISB_UNIQUE_NO = lOANDISB_UNIQUE_NO;
	}
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getLOANREC_PRIN_AMOUNT() {
		return LOANREC_PRIN_AMOUNT;
	}
	public void setLOANREC_PRIN_AMOUNT(String lOANREC_PRIN_AMOUNT) {
		LOANREC_PRIN_AMOUNT = lOANREC_PRIN_AMOUNT;
	}
	public String getLOANREC_INT_AMOUNT() {
		return LOANREC_INT_AMOUNT;
	}
	public void setLOANREC_INT_AMOUNT(String lOANREC_INT_AMOUNT) {
		LOANREC_INT_AMOUNT = lOANREC_INT_AMOUNT;
	}
	public String getLOANADV_CODE() {
		return LOANADV_CODE;
	}
	public void setLOANADV_CODE(String lOANADV_CODE) {
		LOANADV_CODE = lOANADV_CODE;
	}
	public String getLOANADV_DISBURSAL_REF() {
		return LOANADV_DISBURSAL_REF;
	}
	public void setLOANADV_DISBURSAL_REF(String lOANADV_DISBURSAL_REF) {
		LOANADV_DISBURSAL_REF = lOANADV_DISBURSAL_REF;
	}
	public String getLOAN_AGENCY_CODE() {
		return LOAN_AGENCY_CODE;
	}
	public void setLOAN_AGENCY_CODE(String lOAN_AGENCY_CODE) {
		LOAN_AGENCY_CODE = lOAN_AGENCY_CODE;
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
	public FFD_DED_LOANS(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE, String sAL_MONTH, String lOANDISB_UNIQUE_NO,
			String aTTEND_MONTH, String lOANREC_PRIN_AMOUNT,
			String lOANREC_INT_AMOUNT, String lOANADV_CODE,
			String lOANADV_DISBURSAL_REF, String lOAN_AGENCY_CODE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		SAL_MONTH = sAL_MONTH;
		LOANDISB_UNIQUE_NO = lOANDISB_UNIQUE_NO;
		ATTEND_MONTH = aTTEND_MONTH;
		LOANREC_PRIN_AMOUNT = lOANREC_PRIN_AMOUNT;
		LOANREC_INT_AMOUNT = lOANREC_INT_AMOUNT;
		LOANADV_CODE = lOANADV_CODE;
		LOANADV_DISBURSAL_REF = lOANADV_DISBURSAL_REF;
		LOAN_AGENCY_CODE = lOAN_AGENCY_CODE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	

	
	
	

	
	
	
	
}

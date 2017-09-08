package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="HR.HIS_EARNINGS")
@IdClass(FFD_EARN_PAYROLL_pk.class)

public class HIS_EARNINGS implements Serializable {

	public HIS_EARNINGS() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE;   
	@Id String EMP_CODE;
	@Id String ALLW_CODE;      
	@Id String SAL_MONTH   ;  
	@Id  String ATTEND_MONTH;
	@Column String AMOUNT;  
	@Column String EARN_OCCUR ;
	@Column String DOCREF_NO ;
	@Column String MASTER_ENT_AMT ;
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
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getEARN_OCCUR() {
		return EARN_OCCUR;
	}
	public void setEARN_OCCUR(String eARN_OCCUR) {
		EARN_OCCUR = eARN_OCCUR;
	}
	public String getDOCREF_NO() {
		return DOCREF_NO;
	}
	public void setDOCREF_NO(String dOCREF_NO) {
		DOCREF_NO = dOCREF_NO;
	}
	public String getMASTER_ENT_AMT() {
		return MASTER_ENT_AMT;
	}
	public void setMASTER_ENT_AMT(String mASTER_ENT_AMT) {
		MASTER_ENT_AMT = mASTER_ENT_AMT;
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
	public HIS_EARNINGS(String cOMPANY_CODE, String eMP_CODE, String aLLW_CODE,
			String sAL_MONTH, String aTTEND_MONTH, String aMOUNT,
			String eARN_OCCUR, String dOCREF_NO, String mASTER_ENT_AMT,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		SAL_MONTH = sAL_MONTH;
		ATTEND_MONTH = aTTEND_MONTH;
		AMOUNT = aMOUNT;
		EARN_OCCUR = eARN_OCCUR;
		DOCREF_NO = dOCREF_NO;
		MASTER_ENT_AMT = mASTER_ENT_AMT;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	

	      
	
	
	
	
	
	
}

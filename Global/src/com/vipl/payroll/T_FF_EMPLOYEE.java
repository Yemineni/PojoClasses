package com.vipl.payroll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HR.T_FF_EMPLOYEE")
@IdClass(T_FF_EMPLOYEE_PK.class)

public class T_FF_EMPLOYEE implements java.io.Serializable {

	public T_FF_EMPLOYEE() {
		// TODO Auto-generated constructor stub
	}

	
	@Id
	 String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Column
	String	SEPR_TYPE="";
	@Column
	String SEPR_APPLN_DATE="";
	@Column
	String SEPR_APPROVAL_DATE="";
	@Column
	String SEPR_EXP_RELEASE_DATE="";
	@Column
	String SEPR_NOTICE_RECOVERY_DAYS="";
	@Column
	String SEPR_REASON="";
	@Column
	String SEPR_APPROVED_BY="";                
	@Column
	String SEPR_REMARKS="";
	@Column
	String SEPR_EXIT_INTW_DATE="";
	@Column
	String SEPR_EXIT_INTW_BY="";
	@Column
	String SEPR_EXIT_INTW_FEEDBACK="";        
	@Column
	String SEPR_EXIT_INTW_REMARKS="";         
	@Column
	String SEPR_EXIT_INTW1_DATE="";
	@Column
	String SEPR_EXIT_INTW1_BY="";
	@Column
	String SEPR_EXIT_INTW1_FEEDBACK="";
	@Column String	SEPR_EXIT_INTW1_REMARKS="";        
	@Column String SEPR_CONTACT_ADDRESS1="";           
	@Column String  SEPR_CONTACT_ADDRESS2="";           
	@Column String  SEPR_CONTACT_ADDRESS3="";           
	@Column String  SEPR_CONTACT_PIN="";                   
	@Column String SEPR_CONTACT_TELNOS="";           
	@Column String  SEPR_CONTACT_FAXNO="";              
	@Column String  SEPR_CONTACT_EMAIL="";              
	@Column String  DEPT_CLEAR_RECDON="";                       
	@Column String  FF_PROCESSED_ON="";                         
	@Column String  FF_AGREED_ON="";             
	@Column String  FF_APPROVED_BY ="";  
	@Column String  FF_PAID_ON="";           
	@Column String FF_JV_NO="";    
	@Column String FF_CHEQUE_NO="";            
	@Column String  FF_CHEQUE_AMOUNT="";        
	@Column String  NOTICE_PAY_DAYS="";          
	@Column String  PAY_DAYS="";                 
	@Column String ENCASH_DAYS="";              
	@Column String  BASIC_LEAVENCASH="";        
	@Column String SEPR_SAL_MONTH="";                   
	@Column String  AMOUNT_RECOVERED="";        
	@Column String 	CHEQUE_DD_NUMBER="";        
	@Column String NOTICE_RECOVERY_STATUS="";   
	@Column String NOTICE_RECOVERY_AMOUNT="";  
	@Column String CREATION_DATE;           
	@Column String USER_ID ;    
	@Column String MACHINE_ID;
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
	public String getSEPR_TYPE() {
		return SEPR_TYPE;
	}
	public void setSEPR_TYPE(String sEPR_TYPE) {
		SEPR_TYPE = sEPR_TYPE;
	}
	public String getSEPR_APPLN_DATE() {
		return SEPR_APPLN_DATE;
	}
	public void setSEPR_APPLN_DATE(String sEPR_APPLN_DATE) {
		SEPR_APPLN_DATE = sEPR_APPLN_DATE;
	}
	public String getSEPR_APPROVAL_DATE() {
		return SEPR_APPROVAL_DATE;
	}
	public void setSEPR_APPROVAL_DATE(String sEPR_APPROVAL_DATE) {
		SEPR_APPROVAL_DATE = sEPR_APPROVAL_DATE;
	}
	public String getSEPR_EXP_RELEASE_DATE() {
		return SEPR_EXP_RELEASE_DATE;
	}
	public void setSEPR_EXP_RELEASE_DATE(String sEPR_EXP_RELEASE_DATE) {
		SEPR_EXP_RELEASE_DATE = sEPR_EXP_RELEASE_DATE;
	}
	public String getSEPR_NOTICE_RECOVERY_DAYS() {
		return SEPR_NOTICE_RECOVERY_DAYS;
	}
	public void setSEPR_NOTICE_RECOVERY_DAYS(String sEPR_NOTICE_RECOVERY_DAYS) {
		SEPR_NOTICE_RECOVERY_DAYS = sEPR_NOTICE_RECOVERY_DAYS;
	}
	public String getSEPR_REASON() {
		return SEPR_REASON;
	}
	public void setSEPR_REASON(String sEPR_REASON) {
		SEPR_REASON = sEPR_REASON;
	}
	public String getSEPR_APPROVED_BY() {
		return SEPR_APPROVED_BY;
	}
	public void setSEPR_APPROVED_BY(String sEPR_APPROVED_BY) {
		SEPR_APPROVED_BY = sEPR_APPROVED_BY;
	}
	public String getSEPR_REMARKS() {
		return SEPR_REMARKS;
	}
	public void setSEPR_REMARKS(String sEPR_REMARKS) {
		SEPR_REMARKS = sEPR_REMARKS;
	}
	public String getSEPR_EXIT_INTW_DATE() {
		return SEPR_EXIT_INTW_DATE;
	}
	public void setSEPR_EXIT_INTW_DATE(String sEPR_EXIT_INTW_DATE) {
		SEPR_EXIT_INTW_DATE = sEPR_EXIT_INTW_DATE;
	}
	public String getSEPR_EXIT_INTW_BY() {
		return SEPR_EXIT_INTW_BY;
	}
	public void setSEPR_EXIT_INTW_BY(String sEPR_EXIT_INTW_BY) {
		SEPR_EXIT_INTW_BY = sEPR_EXIT_INTW_BY;
	}
	public String getSEPR_EXIT_INTW_FEEDBACK() {
		return SEPR_EXIT_INTW_FEEDBACK;
	}
	public void setSEPR_EXIT_INTW_FEEDBACK(String sEPR_EXIT_INTW_FEEDBACK) {
		SEPR_EXIT_INTW_FEEDBACK = sEPR_EXIT_INTW_FEEDBACK;
	}
	public String getSEPR_EXIT_INTW_REMARKS() {
		return SEPR_EXIT_INTW_REMARKS;
	}
	public void setSEPR_EXIT_INTW_REMARKS(String sEPR_EXIT_INTW_REMARKS) {
		SEPR_EXIT_INTW_REMARKS = sEPR_EXIT_INTW_REMARKS;
	}
	public String getSEPR_EXIT_INTW1_DATE() {
		return SEPR_EXIT_INTW1_DATE;
	}
	public void setSEPR_EXIT_INTW1_DATE(String sEPR_EXIT_INTW1_DATE) {
		SEPR_EXIT_INTW1_DATE = sEPR_EXIT_INTW1_DATE;
	}
	public String getSEPR_EXIT_INTW1_BY() {
		return SEPR_EXIT_INTW1_BY;
	}
	public void setSEPR_EXIT_INTW1_BY(String sEPR_EXIT_INTW1_BY) {
		SEPR_EXIT_INTW1_BY = sEPR_EXIT_INTW1_BY;
	}
	public String getSEPR_EXIT_INTW1_FEEDBACK() {
		return SEPR_EXIT_INTW1_FEEDBACK;
	}
	public void setSEPR_EXIT_INTW1_FEEDBACK(String sEPR_EXIT_INTW1_FEEDBACK) {
		SEPR_EXIT_INTW1_FEEDBACK = sEPR_EXIT_INTW1_FEEDBACK;
	}
	public String getSEPR_EXIT_INTW1_REMARKS() {
		return SEPR_EXIT_INTW1_REMARKS;
	}
	public void setSEPR_EXIT_INTW1_REMARKS(String sEPR_EXIT_INTW1_REMARKS) {
		SEPR_EXIT_INTW1_REMARKS = sEPR_EXIT_INTW1_REMARKS;
	}
	public String getSEPR_CONTACT_ADDRESS1() {
		return SEPR_CONTACT_ADDRESS1;
	}
	public void setSEPR_CONTACT_ADDRESS1(String sEPR_CONTACT_ADDRESS1) {
		SEPR_CONTACT_ADDRESS1 = sEPR_CONTACT_ADDRESS1;
	}
	public String getSEPR_CONTACT_ADDRESS2() {
		return SEPR_CONTACT_ADDRESS2;
	}
	public void setSEPR_CONTACT_ADDRESS2(String sEPR_CONTACT_ADDRESS2) {
		SEPR_CONTACT_ADDRESS2 = sEPR_CONTACT_ADDRESS2;
	}
	public String getSEPR_CONTACT_ADDRESS3() {
		return SEPR_CONTACT_ADDRESS3;
	}
	public void setSEPR_CONTACT_ADDRESS3(String sEPR_CONTACT_ADDRESS3) {
		SEPR_CONTACT_ADDRESS3 = sEPR_CONTACT_ADDRESS3;
	}
	public String getSEPR_CONTACT_PIN() {
		return SEPR_CONTACT_PIN;
	}
	public void setSEPR_CONTACT_PIN(String sEPR_CONTACT_PIN) {
		SEPR_CONTACT_PIN = sEPR_CONTACT_PIN;
	}
	public String getSEPR_CONTACT_TELNOS() {
		return SEPR_CONTACT_TELNOS;
	}
	public void setSEPR_CONTACT_TELNOS(String sEPR_CONTACT_TELNOS) {
		SEPR_CONTACT_TELNOS = sEPR_CONTACT_TELNOS;
	}
	public String getSEPR_CONTACT_FAXNO() {
		return SEPR_CONTACT_FAXNO;
	}
	public void setSEPR_CONTACT_FAXNO(String sEPR_CONTACT_FAXNO) {
		SEPR_CONTACT_FAXNO = sEPR_CONTACT_FAXNO;
	}
	public String getSEPR_CONTACT_EMAIL() {
		return SEPR_CONTACT_EMAIL;
	}
	public void setSEPR_CONTACT_EMAIL(String sEPR_CONTACT_EMAIL) {
		SEPR_CONTACT_EMAIL = sEPR_CONTACT_EMAIL;
	}
	public String getDEPT_CLEAR_RECDON() {
		return DEPT_CLEAR_RECDON;
	}
	public void setDEPT_CLEAR_RECDON(String dEPT_CLEAR_RECDON) {
		DEPT_CLEAR_RECDON = dEPT_CLEAR_RECDON;
	}
	public String getFF_PROCESSED_ON() {
		return FF_PROCESSED_ON;
	}
	public void setFF_PROCESSED_ON(String fF_PROCESSED_ON) {
		FF_PROCESSED_ON = fF_PROCESSED_ON;
	}
	public String getFF_AGREED_ON() {
		return FF_AGREED_ON;
	}
	public void setFF_AGREED_ON(String fF_AGREED_ON) {
		FF_AGREED_ON = fF_AGREED_ON;
	}
	public String getFF_APPROVED_BY() {
		return FF_APPROVED_BY;
	}
	public void setFF_APPROVED_BY(String fF_APPROVED_BY) {
		FF_APPROVED_BY = fF_APPROVED_BY;
	}
	public String getFF_PAID_ON() {
		return FF_PAID_ON;
	}
	public void setFF_PAID_ON(String fF_PAID_ON) {
		FF_PAID_ON = fF_PAID_ON;
	}
	public String getFF_JV_NO() {
		return FF_JV_NO;
	}
	public void setFF_JV_NO(String fF_JV_NO) {
		FF_JV_NO = fF_JV_NO;
	}
	public String getFF_CHEQUE_NO() {
		return FF_CHEQUE_NO;
	}
	public void setFF_CHEQUE_NO(String fF_CHEQUE_NO) {
		FF_CHEQUE_NO = fF_CHEQUE_NO;
	}
	public String getFF_CHEQUE_AMOUNT() {
		return FF_CHEQUE_AMOUNT;
	}
	public void setFF_CHEQUE_AMOUNT(String fF_CHEQUE_AMOUNT) {
		FF_CHEQUE_AMOUNT = fF_CHEQUE_AMOUNT;
	}
	public String getNOTICE_PAY_DAYS() {
		return NOTICE_PAY_DAYS;
	}
	public void setNOTICE_PAY_DAYS(String nOTICE_PAY_DAYS) {
		NOTICE_PAY_DAYS = nOTICE_PAY_DAYS;
	}
	public String getPAY_DAYS() {
		return PAY_DAYS;
	}
	public void setPAY_DAYS(String pAY_DAYS) {
		PAY_DAYS = pAY_DAYS;
	}
	public String getENCASH_DAYS() {
		return ENCASH_DAYS;
	}
	public void setENCASH_DAYS(String eNCASH_DAYS) {
		ENCASH_DAYS = eNCASH_DAYS;
	}
	public String getBASIC_LEAVENCASH() {
		return BASIC_LEAVENCASH;
	}
	public void setBASIC_LEAVENCASH(String bASIC_LEAVENCASH) {
		BASIC_LEAVENCASH = bASIC_LEAVENCASH;
	}
	public String getSEPR_SAL_MONTH() {
		return SEPR_SAL_MONTH;
	}
	public void setSEPR_SAL_MONTH(String sEPR_SAL_MONTH) {
		SEPR_SAL_MONTH = sEPR_SAL_MONTH;
	}
	public String getAMOUNT_RECOVERED() {
		return AMOUNT_RECOVERED;
	}
	public void setAMOUNT_RECOVERED(String aMOUNT_RECOVERED) {
		AMOUNT_RECOVERED = aMOUNT_RECOVERED;
	}
	public String getCHEQUE_DD_NUMBER() {
		return CHEQUE_DD_NUMBER;
	}
	public void setCHEQUE_DD_NUMBER(String cHEQUE_DD_NUMBER) {
		CHEQUE_DD_NUMBER = cHEQUE_DD_NUMBER;
	}
	public String getNOTICE_RECOVERY_STATUS() {
		return NOTICE_RECOVERY_STATUS;
	}
	public void setNOTICE_RECOVERY_STATUS(String nOTICE_RECOVERY_STATUS) {
		NOTICE_RECOVERY_STATUS = nOTICE_RECOVERY_STATUS;
	}
	public String getNOTICE_RECOVERY_AMOUNT() {
		return NOTICE_RECOVERY_AMOUNT;
	}
	public void setNOTICE_RECOVERY_AMOUNT(String nOTICE_RECOVERY_AMOUNT) {
		NOTICE_RECOVERY_AMOUNT = nOTICE_RECOVERY_AMOUNT;
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
	public T_FF_EMPLOYEE(String cOMPANY_CODE, String eMP_CODE,
			String sEPR_TYPE, String sEPR_APPLN_DATE,
			String sEPR_APPROVAL_DATE, String sEPR_EXP_RELEASE_DATE,
			String sEPR_NOTICE_RECOVERY_DAYS, String sEPR_REASON,
			String sEPR_APPROVED_BY, String sEPR_REMARKS,
			String sEPR_EXIT_INTW_DATE, String sEPR_EXIT_INTW_BY,
			String sEPR_EXIT_INTW_FEEDBACK, String sEPR_EXIT_INTW_REMARKS,
			String sEPR_EXIT_INTW1_DATE, String sEPR_EXIT_INTW1_BY,
			String sEPR_EXIT_INTW1_FEEDBACK, String sEPR_EXIT_INTW1_REMARKS,
			String sEPR_CONTACT_ADDRESS1, String sEPR_CONTACT_ADDRESS2,
			String sEPR_CONTACT_ADDRESS3, String sEPR_CONTACT_PIN,
			String sEPR_CONTACT_TELNOS, String sEPR_CONTACT_FAXNO,
			String sEPR_CONTACT_EMAIL, String dEPT_CLEAR_RECDON,
			String fF_PROCESSED_ON, String fF_AGREED_ON, String fF_APPROVED_BY,
			String fF_PAID_ON, String fF_JV_NO, String fF_CHEQUE_NO,
			String fF_CHEQUE_AMOUNT, String nOTICE_PAY_DAYS, String pAY_DAYS,
			String eNCASH_DAYS, String bASIC_LEAVENCASH, String sEPR_SAL_MONTH,
			String aMOUNT_RECOVERED, String cHEQUE_DD_NUMBER,
			String nOTICE_RECOVERY_STATUS, String nOTICE_RECOVERY_AMOUNT,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SEPR_TYPE = sEPR_TYPE;
		SEPR_APPLN_DATE = sEPR_APPLN_DATE;
		SEPR_APPROVAL_DATE = sEPR_APPROVAL_DATE;
		SEPR_EXP_RELEASE_DATE = sEPR_EXP_RELEASE_DATE;
		SEPR_NOTICE_RECOVERY_DAYS = sEPR_NOTICE_RECOVERY_DAYS;
		SEPR_REASON = sEPR_REASON;
		SEPR_APPROVED_BY = sEPR_APPROVED_BY;
		SEPR_REMARKS = sEPR_REMARKS;
		SEPR_EXIT_INTW_DATE = sEPR_EXIT_INTW_DATE;
		SEPR_EXIT_INTW_BY = sEPR_EXIT_INTW_BY;
		SEPR_EXIT_INTW_FEEDBACK = sEPR_EXIT_INTW_FEEDBACK;
		SEPR_EXIT_INTW_REMARKS = sEPR_EXIT_INTW_REMARKS;
		SEPR_EXIT_INTW1_DATE = sEPR_EXIT_INTW1_DATE;
		SEPR_EXIT_INTW1_BY = sEPR_EXIT_INTW1_BY;
		SEPR_EXIT_INTW1_FEEDBACK = sEPR_EXIT_INTW1_FEEDBACK;
		SEPR_EXIT_INTW1_REMARKS = sEPR_EXIT_INTW1_REMARKS;
		SEPR_CONTACT_ADDRESS1 = sEPR_CONTACT_ADDRESS1;
		SEPR_CONTACT_ADDRESS2 = sEPR_CONTACT_ADDRESS2;
		SEPR_CONTACT_ADDRESS3 = sEPR_CONTACT_ADDRESS3;
		SEPR_CONTACT_PIN = sEPR_CONTACT_PIN;
		SEPR_CONTACT_TELNOS = sEPR_CONTACT_TELNOS;
		SEPR_CONTACT_FAXNO = sEPR_CONTACT_FAXNO;
		SEPR_CONTACT_EMAIL = sEPR_CONTACT_EMAIL;
		DEPT_CLEAR_RECDON = dEPT_CLEAR_RECDON;
		FF_PROCESSED_ON = fF_PROCESSED_ON;
		FF_AGREED_ON = fF_AGREED_ON;
		FF_APPROVED_BY = fF_APPROVED_BY;
		FF_PAID_ON = fF_PAID_ON;
		FF_JV_NO = fF_JV_NO;
		FF_CHEQUE_NO = fF_CHEQUE_NO;
		FF_CHEQUE_AMOUNT = fF_CHEQUE_AMOUNT;
		NOTICE_PAY_DAYS = nOTICE_PAY_DAYS;
		PAY_DAYS = pAY_DAYS;
		ENCASH_DAYS = eNCASH_DAYS;
		BASIC_LEAVENCASH = bASIC_LEAVENCASH;
		SEPR_SAL_MONTH = sEPR_SAL_MONTH;
		AMOUNT_RECOVERED = aMOUNT_RECOVERED;
		CHEQUE_DD_NUMBER = cHEQUE_DD_NUMBER;
		NOTICE_RECOVERY_STATUS = nOTICE_RECOVERY_STATUS;
		NOTICE_RECOVERY_AMOUNT = nOTICE_RECOVERY_AMOUNT;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	
	
	
	
}

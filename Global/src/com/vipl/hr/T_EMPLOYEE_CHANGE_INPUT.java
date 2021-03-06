package com.vipl.hr;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="HR.T_EMPLOYEE_CHANGE_INPUT")
public class T_EMPLOYEE_CHANGE_INPUT implements Serializable {

	public T_EMPLOYEE_CHANGE_INPUT() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE="";        
	@Column String SAL_MONTH="";                  
	@Column String SR_NO="";                          
	@Column String EMP_CODE="";                      
	@Column String EMP_FIRSTNAME ="";                
	@Column String EMP_MIDDLENAME ="";               
	@Column String EMP_SURNAME   ="";                
	@Column String EMP_FATHER_NAME   ="";            
	@Column String EMP_HOME_TOWN  ="";               
	@Column String EMP_DOB     ="";                          
	@Column String EMP_MARRIAGE_DATE   ="";                  
	@Column String EMP_GROUP_JOINING_DATE  ="";              
	@Column String EMP_PROBATION_START_DATE    ="";          
	@Column String EMP_CONFIRMATION_DATE   ="";              
	@Column String EMP_SEX  ="";                      
	@Column String EMP_PAN  ="";                     
	@Column String PAYMENT_MODE  ="";                 
	@Column String BANK_CODE   ="";                   
	@Column String BANK_BRANCH_NAME  ="";   
	@Column String IFSC_CODE="";           
	@Column String BANK_ACCOUNT_NO   ="";  
	@Column String PF_CONSIDERATION_FLAG   ="";
	@Column String PF_NO ="";                 
	@Column String PF_JOINING_DATE    ="";            
	@Column String ESI_NO     ="";            
	@Column String ESI_JOINING_DATE    ="";           
	@Column String OFFICE_EMAIL_ID   ="";     
	@Column String EMP_SWIPE_CARD_NO  ="";    
	@Column String REMARKS    ="";           
	@Column String  MACHINE_ID     ="";       
	@Column String USER_ID ="";               
	@Column String CREATION_DATE   ="";
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
	public String getEMP_FIRSTNAME() {
		return EMP_FIRSTNAME;
	}
	public void setEMP_FIRSTNAME(String eMP_FIRSTNAME) {
		EMP_FIRSTNAME = eMP_FIRSTNAME;
	}
	public String getEMP_MIDDLENAME() {
		return EMP_MIDDLENAME;
	}
	public void setEMP_MIDDLENAME(String eMP_MIDDLENAME) {
		EMP_MIDDLENAME = eMP_MIDDLENAME;
	}
	public String getEMP_SURNAME() {
		return EMP_SURNAME;
	}
	public void setEMP_SURNAME(String eMP_SURNAME) {
		EMP_SURNAME = eMP_SURNAME;
	}
	public String getEMP_FATHER_NAME() {
		return EMP_FATHER_NAME;
	}
	public void setEMP_FATHER_NAME(String eMP_FATHER_NAME) {
		EMP_FATHER_NAME = eMP_FATHER_NAME;
	}
	public String getEMP_HOME_TOWN() {
		return EMP_HOME_TOWN;
	}
	public void setEMP_HOME_TOWN(String eMP_HOME_TOWN) {
		EMP_HOME_TOWN = eMP_HOME_TOWN;
	}
	public String getEMP_DOB() {
		return EMP_DOB;
	}
	public void setEMP_DOB(String eMP_DOB) {
		EMP_DOB = eMP_DOB;
	}
	public String getEMP_MARRIAGE_DATE() {
		return EMP_MARRIAGE_DATE;
	}
	public void setEMP_MARRIAGE_DATE(String eMP_MARRIAGE_DATE) {
		EMP_MARRIAGE_DATE = eMP_MARRIAGE_DATE;
	}
	public String getEMP_GROUP_JOINING_DATE() {
		return EMP_GROUP_JOINING_DATE;
	}
	public void setEMP_GROUP_JOINING_DATE(String eMP_GROUP_JOINING_DATE) {
		EMP_GROUP_JOINING_DATE = eMP_GROUP_JOINING_DATE;
	}
	public String getEMP_PROBATION_START_DATE() {
		return EMP_PROBATION_START_DATE;
	}
	public void setEMP_PROBATION_START_DATE(String eMP_PROBATION_START_DATE) {
		EMP_PROBATION_START_DATE = eMP_PROBATION_START_DATE;
	}
	public String getEMP_CONFIRMATION_DATE() {
		return EMP_CONFIRMATION_DATE;
	}
	public void setEMP_CONFIRMATION_DATE(String eMP_CONFIRMATION_DATE) {
		EMP_CONFIRMATION_DATE = eMP_CONFIRMATION_DATE;
	}
	public String getEMP_SEX() {
		return EMP_SEX;
	}
	public void setEMP_SEX(String eMP_SEX) {
		EMP_SEX = eMP_SEX;
	}
	public String getEMP_PAN() {
		return EMP_PAN;
	}
	public void setEMP_PAN(String eMP_PAN) {
		EMP_PAN = eMP_PAN;
	}
	public String getPAYMENT_MODE() {
		return PAYMENT_MODE;
	}
	public void setPAYMENT_MODE(String pAYMENT_MODE) {
		PAYMENT_MODE = pAYMENT_MODE;
	}
	public String getBANK_CODE() {
		return BANK_CODE;
	}
	public void setBANK_CODE(String bANK_CODE) {
		BANK_CODE = bANK_CODE;
	}
	public String getBANK_BRANCH_NAME() {
		return BANK_BRANCH_NAME;
	}
	public void setBANK_BRANCH_NAME(String bANK_BRANCH_NAME) {
		BANK_BRANCH_NAME = bANK_BRANCH_NAME;
	}
	public String getIFSC_CODE() {
		return IFSC_CODE;
	}
	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}
	public String getBANK_ACCOUNT_NO() {
		return BANK_ACCOUNT_NO;
	}
	public void setBANK_ACCOUNT_NO(String bANK_ACCOUNT_NO) {
		BANK_ACCOUNT_NO = bANK_ACCOUNT_NO;
	}
	public String getPF_CONSIDERATION_FLAG() {
		return PF_CONSIDERATION_FLAG;
	}
	public void setPF_CONSIDERATION_FLAG(String pF_CONSIDERATION_FLAG) {
		PF_CONSIDERATION_FLAG = pF_CONSIDERATION_FLAG;
	}
	public String getPF_NO() {
		return PF_NO;
	}
	public void setPF_NO(String pF_NO) {
		PF_NO = pF_NO;
	}
	public String getPF_JOINING_DATE() {
		return PF_JOINING_DATE;
	}
	public void setPF_JOINING_DATE(String pF_JOINING_DATE) {
		PF_JOINING_DATE = pF_JOINING_DATE;
	}
	public String getESI_NO() {
		return ESI_NO;
	}
	public void setESI_NO(String eSI_NO) {
		ESI_NO = eSI_NO;
	}
	public String getESI_JOINING_DATE() {
		return ESI_JOINING_DATE;
	}
	public void setESI_JOINING_DATE(String eSI_JOINING_DATE) {
		ESI_JOINING_DATE = eSI_JOINING_DATE;
	}
	public String getOFFICE_EMAIL_ID() {
		return OFFICE_EMAIL_ID;
	}
	public void setOFFICE_EMAIL_ID(String oFFICE_EMAIL_ID) {
		OFFICE_EMAIL_ID = oFFICE_EMAIL_ID;
	}
	public String getEMP_SWIPE_CARD_NO() {
		return EMP_SWIPE_CARD_NO;
	}
	public void setEMP_SWIPE_CARD_NO(String eMP_SWIPE_CARD_NO) {
		EMP_SWIPE_CARD_NO = eMP_SWIPE_CARD_NO;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getMACHINE_ID() {
		return MACHINE_ID;
	}
	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public T_EMPLOYEE_CHANGE_INPUT(String cOMPANY_CODE, String sAL_MONTH,
			String sR_NO, String eMP_CODE, String eMP_FIRSTNAME,
			String eMP_MIDDLENAME, String eMP_SURNAME, String eMP_FATHER_NAME,
			String eMP_HOME_TOWN, String eMP_DOB, String eMP_MARRIAGE_DATE,
			String eMP_GROUP_JOINING_DATE, String eMP_PROBATION_START_DATE,
			String eMP_CONFIRMATION_DATE, String eMP_SEX, String eMP_PAN,
			String pAYMENT_MODE, String bANK_CODE, String bANK_BRANCH_NAME,
			String iFSC_CODE, String bANK_ACCOUNT_NO,
			String pF_CONSIDERATION_FLAG, String pF_NO, String pF_JOINING_DATE,
			String eSI_NO, String eSI_JOINING_DATE, String oFFICE_EMAIL_ID,
			String eMP_SWIPE_CARD_NO, String rEMARKS, String mACHINE_ID,
			String uSER_ID, String cREATION_DATE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SAL_MONTH = sAL_MONTH;
		SR_NO = sR_NO;
		EMP_CODE = eMP_CODE;
		EMP_FIRSTNAME = eMP_FIRSTNAME;
		EMP_MIDDLENAME = eMP_MIDDLENAME;
		EMP_SURNAME = eMP_SURNAME;
		EMP_FATHER_NAME = eMP_FATHER_NAME;
		EMP_HOME_TOWN = eMP_HOME_TOWN;
		EMP_DOB = eMP_DOB;
		EMP_MARRIAGE_DATE = eMP_MARRIAGE_DATE;
		EMP_GROUP_JOINING_DATE = eMP_GROUP_JOINING_DATE;
		EMP_PROBATION_START_DATE = eMP_PROBATION_START_DATE;
		EMP_CONFIRMATION_DATE = eMP_CONFIRMATION_DATE;
		EMP_SEX = eMP_SEX;
		EMP_PAN = eMP_PAN;
		PAYMENT_MODE = pAYMENT_MODE;
		BANK_CODE = bANK_CODE;
		BANK_BRANCH_NAME = bANK_BRANCH_NAME;
		IFSC_CODE = iFSC_CODE;
		BANK_ACCOUNT_NO = bANK_ACCOUNT_NO;
		PF_CONSIDERATION_FLAG = pF_CONSIDERATION_FLAG;
		PF_NO = pF_NO;
		PF_JOINING_DATE = pF_JOINING_DATE;
		ESI_NO = eSI_NO;
		ESI_JOINING_DATE = eSI_JOINING_DATE;
		OFFICE_EMAIL_ID = oFFICE_EMAIL_ID;
		EMP_SWIPE_CARD_NO = eMP_SWIPE_CARD_NO;
		REMARKS = rEMARKS;
		MACHINE_ID = mACHINE_ID;
		USER_ID = uSER_ID;
		CREATION_DATE = cREATION_DATE;
	}

}

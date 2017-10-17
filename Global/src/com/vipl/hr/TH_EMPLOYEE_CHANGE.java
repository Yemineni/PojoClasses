package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HR.TH_EMPLOYEE_CHANGE")
@IdClass(TH_EMPLOYEE_CHANGE_pk.class)
public class TH_EMPLOYEE_CHANGE implements Serializable {
public TH_EMPLOYEE_CHANGE() {}
@Id String COMPANY_CODE="";   
@Id int TRAIL_SEQ_NO=0;     
@Id String SAL_MONTH ="";  
@Column String SR_NO   ="";                  
@Column String EMP_CODE    ="";             
@Column String EMP_FIRSTNAME   ="";         
@Column String EMP_MIDDLENAME      ="";     
@Column String EMP_SURNAME             =""; 
@Column String EMP_FATHER_NAME          ="";
@Column String EMP_HOME_TOWN            ="";
@Column String EMP_DOB                      ="";    
@Column String EMP_MARRIAGE_DATE                ="";
@Column String  EMP_GROUP_JOINING_DATE           ="";
@Column String EMP_PROBATION_START_DATE         ="";
@Column String EMP_CONFIRMATION_DATE            ="";
@Column String EMP_SEX                   ="";
@Column String EMP_PAN                  ="";
@Column String PAYMENT_MODE              ="";
@Column String BANK_CODE                 ="";
@Column String BANK_BRANCH_NAME         ="";
@Column String IFSC_CODE                ="";
@Column String BANK_ACCOUNT_NO              =""; 
@Column String PF_CONSIDERATION_FLAG            ="";  
@Column String PF_NO                         =""; 
@Column String PF_JOINING_DATE                   ="";         
@Column String ESI_NO                         ="";
@Column String ESI_JOINING_DATE               ="";             
@Column String OFFICE_EMAIL_ID             ="";        
@Column String EMP_SWIPE_CARD_NO         ="";          
@Column String PREV_FIRSTNAME            =""; 
@Column String PREV_MIDDLENAME           =""; 
@Column String PREV_SURNAME             ="";  
@Column String PREV_FATHER_NAME         =""; 
@Column String PREV_HOME_TOWN                 =""; 
@Column String PREV_DOB                             ="";         
@Column String PREV_MARRIAGE_DATE                  ="";         
@Column String PREV_GROUP_JOINING_DATE          ="";         
@Column String PREV_PROBATION_START_DATE             ="";         
@Column String PREV_CONFIRMATION_DATE                               =""; 
@Column String PREV_SEX                         ="";
@Column String PREV_PAN                                      ="";
@Column String PREV_PAYMENT_MODE                              ="";
@Column String PREV_BANK_CODE                                 ="";
@Column String PREV_BANK_BRANCH_NAME                         ="";
@Column String PREV_IFSC_CODE                                ="";
@Column String PREV_BANK_ACCOUNT_NO                          ="";
@Column String PREV_PF_CONSIDERATION_FLAG                     ="";
@Column String PREV_PF_NO                                    ="";
@Column String PREV_PF_JOINING_DATE                                  ="";
@Column String PREV_ESI_NO                                   ="";
@Column String PREV_ESI_JOINING_DATE                                 ="";
@Column String PREV_OFFICE_EMAIL_ID                          ="";
@Column String PREV_EMP_SWIPE_CARD_NO                        ="";
@Column String MACHINE_ID                                    ="";
@Column String USER_ID                                       ="";
@Column String CREATION_DATE            ="";
public String getCOMPANY_CODE() {
	return COMPANY_CODE;
}
public void setCOMPANY_CODE(String cOMPANY_CODE) {
	COMPANY_CODE = cOMPANY_CODE;
}
public int getTRAIL_SEQ_NO() {
	return TRAIL_SEQ_NO;
}
public void setTRAIL_SEQ_NO(int tRAIL_SEQ_NO) {
	TRAIL_SEQ_NO = tRAIL_SEQ_NO;
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
public String getPREV_FIRSTNAME() {
	return PREV_FIRSTNAME;
}
public void setPREV_FIRSTNAME(String pREV_FIRSTNAME) {
	PREV_FIRSTNAME = pREV_FIRSTNAME;
}
public String getPREV_MIDDLENAME() {
	return PREV_MIDDLENAME;
}
public void setPREV_MIDDLENAME(String pREV_MIDDLENAME) {
	PREV_MIDDLENAME = pREV_MIDDLENAME;
}
public String getPREV_SURNAME() {
	return PREV_SURNAME;
}
public void setPREV_SURNAME(String pREV_SURNAME) {
	PREV_SURNAME = pREV_SURNAME;
}
public String getPREV_FATHER_NAME() {
	return PREV_FATHER_NAME;
}
public void setPREV_FATHER_NAME(String pREV_FATHER_NAME) {
	PREV_FATHER_NAME = pREV_FATHER_NAME;
}
public String getPREV_HOME_TOWN() {
	return PREV_HOME_TOWN;
}
public void setPREV_HOME_TOWN(String pREV_HOME_TOWN) {
	PREV_HOME_TOWN = pREV_HOME_TOWN;
}
public String getPREV_DOB() {
	return PREV_DOB;
}
public void setPREV_DOB(String pREV_DOB) {
	PREV_DOB = pREV_DOB;
}
public String getPREV_MARRIAGE_DATE() {
	return PREV_MARRIAGE_DATE;
}
public void setPREV_MARRIAGE_DATE(String pREV_MARRIAGE_DATE) {
	PREV_MARRIAGE_DATE = pREV_MARRIAGE_DATE;
}
public String getPREV_GROUP_JOINING_DATE() {
	return PREV_GROUP_JOINING_DATE;
}
public void setPREV_GROUP_JOINING_DATE(String pREV_GROUP_JOINING_DATE) {
	PREV_GROUP_JOINING_DATE = pREV_GROUP_JOINING_DATE;
}
public String getPREV_PROBATION_START_DATE() {
	return PREV_PROBATION_START_DATE;
}
public void setPREV_PROBATION_START_DATE(String pREV_PROBATION_START_DATE) {
	PREV_PROBATION_START_DATE = pREV_PROBATION_START_DATE;
}
public String getPREV_CONFIRMATION_DATE() {
	return PREV_CONFIRMATION_DATE;
}
public void setPREV_CONFIRMATION_DATE(String pREV_CONFIRMATION_DATE) {
	PREV_CONFIRMATION_DATE = pREV_CONFIRMATION_DATE;
}
public String getPREV_SEX() {
	return PREV_SEX;
}
public void setPREV_SEX(String pREV_SEX) {
	PREV_SEX = pREV_SEX;
}
public String getPREV_PAN() {
	return PREV_PAN;
}
public void setPREV_PAN(String pREV_PAN) {
	PREV_PAN = pREV_PAN;
}
public String getPREV_PAYMENT_MODE() {
	return PREV_PAYMENT_MODE;
}
public void setPREV_PAYMENT_MODE(String pREV_PAYMENT_MODE) {
	PREV_PAYMENT_MODE = pREV_PAYMENT_MODE;
}
public String getPREV_BANK_CODE() {
	return PREV_BANK_CODE;
}
public void setPREV_BANK_CODE(String pREV_BANK_CODE) {
	PREV_BANK_CODE = pREV_BANK_CODE;
}
public String getPREV_BANK_BRANCH_NAME() {
	return PREV_BANK_BRANCH_NAME;
}
public void setPREV_BANK_BRANCH_NAME(String pREV_BANK_BRANCH_NAME) {
	PREV_BANK_BRANCH_NAME = pREV_BANK_BRANCH_NAME;
}
public String getPREV_IFSC_CODE() {
	return PREV_IFSC_CODE;
}
public void setPREV_IFSC_CODE(String pREV_IFSC_CODE) {
	PREV_IFSC_CODE = pREV_IFSC_CODE;
}
public String getPREV_BANK_ACCOUNT_NO() {
	return PREV_BANK_ACCOUNT_NO;
}
public void setPREV_BANK_ACCOUNT_NO(String pREV_BANK_ACCOUNT_NO) {
	PREV_BANK_ACCOUNT_NO = pREV_BANK_ACCOUNT_NO;
}
public String getPREV_PF_CONSIDERATION_FLAG() {
	return PREV_PF_CONSIDERATION_FLAG;
}
public void setPREV_PF_CONSIDERATION_FLAG(String pREV_PF_CONSIDERATION_FLAG) {
	PREV_PF_CONSIDERATION_FLAG = pREV_PF_CONSIDERATION_FLAG;
}
public String getPREV_PF_NO() {
	return PREV_PF_NO;
}
public void setPREV_PF_NO(String pREV_PF_NO) {
	PREV_PF_NO = pREV_PF_NO;
}
public String getPREV_PF_JOINING_DATE() {
	return PREV_PF_JOINING_DATE;
}
public void setPREV_PF_JOINING_DATE(String pREV_PF_JOINING_DATE) {
	PREV_PF_JOINING_DATE = pREV_PF_JOINING_DATE;
}
public String getPREV_ESI_NO() {
	return PREV_ESI_NO;
}
public void setPREV_ESI_NO(String pREV_ESI_NO) {
	PREV_ESI_NO = pREV_ESI_NO;
}
public String getPREV_ESI_JOINING_DATE() {
	return PREV_ESI_JOINING_DATE;
}
public void setPREV_ESI_JOINING_DATE(String pREV_ESI_JOINING_DATE) {
	PREV_ESI_JOINING_DATE = pREV_ESI_JOINING_DATE;
}
public String getPREV_OFFICE_EMAIL_ID() {
	return PREV_OFFICE_EMAIL_ID;
}
public void setPREV_OFFICE_EMAIL_ID(String pREV_OFFICE_EMAIL_ID) {
	PREV_OFFICE_EMAIL_ID = pREV_OFFICE_EMAIL_ID;
}
public String getPREV_EMP_SWIPE_CARD_NO() {
	return PREV_EMP_SWIPE_CARD_NO;
}
public void setPREV_EMP_SWIPE_CARD_NO(String pREV_EMP_SWIPE_CARD_NO) {
	PREV_EMP_SWIPE_CARD_NO = pREV_EMP_SWIPE_CARD_NO;
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
public TH_EMPLOYEE_CHANGE(String cOMPANY_CODE, int tRAIL_SEQ_NO,
		String sAL_MONTH, String sR_NO, String eMP_CODE, String eMP_FIRSTNAME,
		String eMP_MIDDLENAME, String eMP_SURNAME, String eMP_FATHER_NAME,
		String eMP_HOME_TOWN, String eMP_DOB, String eMP_MARRIAGE_DATE,
		String eMP_GROUP_JOINING_DATE, String eMP_PROBATION_START_DATE,
		String eMP_CONFIRMATION_DATE, String eMP_SEX, String eMP_PAN,
		String pAYMENT_MODE, String bANK_CODE, String bANK_BRANCH_NAME,
		String iFSC_CODE, String bANK_ACCOUNT_NO, String pF_CONSIDERATION_FLAG,
		String pF_NO, String pF_JOINING_DATE, String eSI_NO,
		String eSI_JOINING_DATE, String oFFICE_EMAIL_ID,
		String eMP_SWIPE_CARD_NO, String pREV_FIRSTNAME,
		String pREV_MIDDLENAME, String pREV_SURNAME, String pREV_FATHER_NAME,
		String pREV_HOME_TOWN, String pREV_DOB, String pREV_MARRIAGE_DATE,
		String pREV_GROUP_JOINING_DATE, String pREV_PROBATION_START_DATE,
		String pREV_CONFIRMATION_DATE, String pREV_SEX, String pREV_PAN,
		String pREV_PAYMENT_MODE, String pREV_BANK_CODE,
		String pREV_BANK_BRANCH_NAME, String pREV_IFSC_CODE,
		String pREV_BANK_ACCOUNT_NO, String pREV_PF_CONSIDERATION_FLAG,
		String pREV_PF_NO, String pREV_PF_JOINING_DATE, String pREV_ESI_NO,
		String pREV_ESI_JOINING_DATE, String pREV_OFFICE_EMAIL_ID,
		String pREV_EMP_SWIPE_CARD_NO, String mACHINE_ID, String uSER_ID,
		String cREATION_DATE) {
	super();
	COMPANY_CODE = cOMPANY_CODE;
	TRAIL_SEQ_NO = tRAIL_SEQ_NO;
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
	PREV_FIRSTNAME = pREV_FIRSTNAME;
	PREV_MIDDLENAME = pREV_MIDDLENAME;
	PREV_SURNAME = pREV_SURNAME;
	PREV_FATHER_NAME = pREV_FATHER_NAME;
	PREV_HOME_TOWN = pREV_HOME_TOWN;
	PREV_DOB = pREV_DOB;
	PREV_MARRIAGE_DATE = pREV_MARRIAGE_DATE;
	PREV_GROUP_JOINING_DATE = pREV_GROUP_JOINING_DATE;
	PREV_PROBATION_START_DATE = pREV_PROBATION_START_DATE;
	PREV_CONFIRMATION_DATE = pREV_CONFIRMATION_DATE;
	PREV_SEX = pREV_SEX;
	PREV_PAN = pREV_PAN;
	PREV_PAYMENT_MODE = pREV_PAYMENT_MODE;
	PREV_BANK_CODE = pREV_BANK_CODE;
	PREV_BANK_BRANCH_NAME = pREV_BANK_BRANCH_NAME;
	PREV_IFSC_CODE = pREV_IFSC_CODE;
	PREV_BANK_ACCOUNT_NO = pREV_BANK_ACCOUNT_NO;
	PREV_PF_CONSIDERATION_FLAG = pREV_PF_CONSIDERATION_FLAG;
	PREV_PF_NO = pREV_PF_NO;
	PREV_PF_JOINING_DATE = pREV_PF_JOINING_DATE;
	PREV_ESI_NO = pREV_ESI_NO;
	PREV_ESI_JOINING_DATE = pREV_ESI_JOINING_DATE;
	PREV_OFFICE_EMAIL_ID = pREV_OFFICE_EMAIL_ID;
	PREV_EMP_SWIPE_CARD_NO = pREV_EMP_SWIPE_CARD_NO;
	MACHINE_ID = mACHINE_ID;
	USER_ID = uSER_ID;
	CREATION_DATE = cREATION_DATE;
}
	
	
	
	
	

}

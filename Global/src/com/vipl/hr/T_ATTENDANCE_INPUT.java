package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hr.T_ATTENDANCE_INPUT")

public class T_ATTENDANCE_INPUT  implements Serializable
{

	private static final long serialVersionUID = 1L;
	public T_ATTENDANCE_INPUT() {
			}

@Id String COMPANY_CODE="";          
@Column String EMP_CODE="";             
@Column String SAL_MONTH="";                    
@Column String SR_NO="";                 
@Column String LOT_NUMBER="";            
@Column int PAY_DAYS  =0;            
@Column int LWP_DAYS    =0;          
@Column int  LEAVE_DAYS  =0;          
@Column int WEEKLY_OFF_DAYS=0;       
@Column int HOLIDAYS=0;              
@Column int ABSENT_DAYS =0;   
@Column int PH_WRKG_DAYS=0;                 
@Column int EL_DAYS =0;   
@Column int CL_DAYS =0;   
@Column int SL_DAYS =0;   
@Column int LAYOFF_DAYS=0;   
@Column int NIGHT_SHIFT_DAYS=0;
@Column int ATTENDANCE_REWARD_WEEK=0;
@Column String  DOJ          ="";
@Column String REMARKS       =""; 
@Column String CREATION_DATE    ="";          
@Column String   USER_ID            ="";  
@Column String   MACHINE_ID           ="";
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
public String getSR_NO() {
	return SR_NO;
}
public void setSR_NO(String sR_NO) {
	SR_NO = sR_NO;
}
public String getLOT_NUMBER() {
	return LOT_NUMBER;
}
public void setLOT_NUMBER(String lOT_NUMBER) {
	LOT_NUMBER = lOT_NUMBER;
}
public int getPAY_DAYS() {
	return PAY_DAYS;
}
public void setPAY_DAYS(int pAY_DAYS) {
	PAY_DAYS = pAY_DAYS;
}
public int getLWP_DAYS() {
	return LWP_DAYS;
}
public void setLWP_DAYS(int lWP_DAYS) {
	LWP_DAYS = lWP_DAYS;
}
public int getLEAVE_DAYS() {
	return LEAVE_DAYS;
}
public void setLEAVE_DAYS(int lEAVE_DAYS) {
	LEAVE_DAYS = lEAVE_DAYS;
}
public int getWEEKLY_OFF_DAYS() {
	return WEEKLY_OFF_DAYS;
}
public void setWEEKLY_OFF_DAYS(int wEEKLY_OFF_DAYS) {
	WEEKLY_OFF_DAYS = wEEKLY_OFF_DAYS;
}
public int getHOLIDAYS() {
	return HOLIDAYS;
}
public void setHOLIDAYS(int hOLIDAYS) {
	HOLIDAYS = hOLIDAYS;
}
public int getABSENT_DAYS() {
	return ABSENT_DAYS;
}
public void setABSENT_DAYS(int aBSENT_DAYS) {
	ABSENT_DAYS = aBSENT_DAYS;
}
public int getPH_WRKG_DAYS() {
	return PH_WRKG_DAYS;
}
public void setPH_WRKG_DAYS(int pH_WRKG_DAYS) {
	PH_WRKG_DAYS = pH_WRKG_DAYS;
}
public int getEL_DAYS() {
	return EL_DAYS;
}
public void setEL_DAYS(int eL_DAYS) {
	EL_DAYS = eL_DAYS;
}
public int getCL_DAYS() {
	return CL_DAYS;
}
public void setCL_DAYS(int cL_DAYS) {
	CL_DAYS = cL_DAYS;
}
public int getSL_DAYS() {
	return SL_DAYS;
}
public void setSL_DAYS(int sL_DAYS) {
	SL_DAYS = sL_DAYS;
}
public int getLAYOFF_DAYS() {
	return LAYOFF_DAYS;
}
public void setLAYOFF_DAYS(int lAYOFF_DAYS) {
	LAYOFF_DAYS = lAYOFF_DAYS;
}
public int getNIGHT_SHIFT_DAYS() {
	return NIGHT_SHIFT_DAYS;
}
public void setNIGHT_SHIFT_DAYS(int nIGHT_SHIFT_DAYS) {
	NIGHT_SHIFT_DAYS = nIGHT_SHIFT_DAYS;
}
public int getATTENDANCE_REWARD_WEEK() {
	return ATTENDANCE_REWARD_WEEK;
}
public void setATTENDANCE_REWARD_WEEK(int aTTENDANCE_REWARD_WEEK) {
	ATTENDANCE_REWARD_WEEK = aTTENDANCE_REWARD_WEEK;
}
public String getDOJ() {
	return DOJ;
}
public void setDOJ(String dOJ) {
	DOJ = dOJ;
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
public T_ATTENDANCE_INPUT(String cOMPANY_CODE, String eMP_CODE,
		String sAL_MONTH, String sR_NO, String lOT_NUMBER, int pAY_DAYS,
		int lWP_DAYS, int lEAVE_DAYS, int wEEKLY_OFF_DAYS, int hOLIDAYS,
		int aBSENT_DAYS, int pH_WRKG_DAYS, int eL_DAYS, int cL_DAYS,
		int sL_DAYS, int lAYOFF_DAYS, int nIGHT_SHIFT_DAYS,
		int aTTENDANCE_REWARD_WEEK, String dOJ, String rEMARKS,
		String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
	super();
	COMPANY_CODE = cOMPANY_CODE;
	EMP_CODE = eMP_CODE;
	SAL_MONTH = sAL_MONTH;
	SR_NO = sR_NO;
	LOT_NUMBER = lOT_NUMBER;
	PAY_DAYS = pAY_DAYS;
	LWP_DAYS = lWP_DAYS;
	LEAVE_DAYS = lEAVE_DAYS;
	WEEKLY_OFF_DAYS = wEEKLY_OFF_DAYS;
	HOLIDAYS = hOLIDAYS;
	ABSENT_DAYS = aBSENT_DAYS;
	PH_WRKG_DAYS = pH_WRKG_DAYS;
	EL_DAYS = eL_DAYS;
	CL_DAYS = cL_DAYS;
	SL_DAYS = sL_DAYS;
	LAYOFF_DAYS = lAYOFF_DAYS;
	NIGHT_SHIFT_DAYS = nIGHT_SHIFT_DAYS;
	ATTENDANCE_REWARD_WEEK = aTTENDANCE_REWARD_WEEK;
	DOJ = dOJ;
	REMARKS = rEMARKS;
	CREATION_DATE = cREATION_DATE;
	USER_ID = uSER_ID;
	MACHINE_ID = mACHINE_ID;
}  
}

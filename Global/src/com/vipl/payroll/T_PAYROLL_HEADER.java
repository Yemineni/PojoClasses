package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HR.T_PAYROLL_HDR")
@IdClass(TH_PAYROLL_HEADER_pk.class)
public class T_PAYROLL_HEADER implements Serializable {

	public T_PAYROLL_HEADER() {
		// TODO Auto-generated constructor stub
	}
	@Id
String 	COMPANY_CODE="";
	@Id
String	EMP_CODE ="";
	@Id
String 	SAL_MONTH ="";  
	@Column
String PF_WAGES ="";
	@Column
String ESI_WAGES ="";
	@Column
String OT_HOURS  ="";
	@Column
String ASHIFT_COUNT="";
	@Column
String BSHIFT_COUNT="";
	@Column
String CSHIFT_COUNT="";
	@Column
String LOP_DAYS ="";
	@Column
String GROSS_EARNIN="";
	@Column
String GROSS_DEDUCT="";
	@Column
String HOLD_IND ="";
	@Column
String DD_NUMBER ="";
	@Column
String DD_DATE ="";
	@Column
String DD_AMOUNT="";
	@Column
String	COURIER_CODE ="";
	@Column
String WAYBILL_NO="";
	@Column
String WAYBILL_DATE="";
	@Column
	String P_DIV_CODE="";
	@Column
	String P_SUBDIV_CODE="";
	@Column
	String P_DEPT_CODE="";
	@Column
	String P_CC_CODE="";
	@Column
	String P_LOC_CODE="";
	@Column
	String P_EMP_PAYMENT_MODE="";
	@Column
	String P_BUS_GROUP_CODE="";
	@Column
	String P_CATEGORY_CODE="";
	@Column
	String P_GRADE_CODE="";
	@Column
	String PAYSLIP_SRNO="";
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column
	String MACHINE_ID="";
	@Column
	String P_POSITION_CODE="";
	@Column
	String P_EMP_IFSC_CODE="";
	@Column
	String P_EMP_BANK_ACCOUNT_NO="";
	@Column
	String P_BANK_BRNNAME ="";
	@Column
	String P_BANK_CODE="";
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
	public String getPF_WAGES() {
		return PF_WAGES;
	}
	public void setPF_WAGES(String pF_WAGES) {
		PF_WAGES = pF_WAGES;
	}
	public String getESI_WAGES() {
		return ESI_WAGES;
	}
	public void setESI_WAGES(String eSI_WAGES) {
		ESI_WAGES = eSI_WAGES;
	}
	public String getOT_HOURS() {
		return OT_HOURS;
	}
	public void setOT_HOURS(String oT_HOURS) {
		OT_HOURS = oT_HOURS;
	}
	public String getASHIFT_COUNT() {
		return ASHIFT_COUNT;
	}
	public void setASHIFT_COUNT(String aSHIFT_COUNT) {
		ASHIFT_COUNT = aSHIFT_COUNT;
	}
	public String getBSHIFT_COUNT() {
		return BSHIFT_COUNT;
	}
	public void setBSHIFT_COUNT(String bSHIFT_COUNT) {
		BSHIFT_COUNT = bSHIFT_COUNT;
	}
	public String getCSHIFT_COUNT() {
		return CSHIFT_COUNT;
	}
	public void setCSHIFT_COUNT(String cSHIFT_COUNT) {
		CSHIFT_COUNT = cSHIFT_COUNT;
	}
	public String getLOP_DAYS() {
		return LOP_DAYS;
	}
	public void setLOP_DAYS(String lOP_DAYS) {
		LOP_DAYS = lOP_DAYS;
	}
	public String getGROSS_EARNIN() {
		return GROSS_EARNIN;
	}
	public void setGROSS_EARNIN(String gROSS_EARNIN) {
		GROSS_EARNIN = gROSS_EARNIN;
	}
	public String getGROSS_DEDUCT() {
		return GROSS_DEDUCT;
	}
	public void setGROSS_DEDUCT(String gROSS_DEDUCT) {
		GROSS_DEDUCT = gROSS_DEDUCT;
	}
	public String getHOLD_IND() {
		return HOLD_IND;
	}
	public void setHOLD_IND(String hOLD_IND) {
		HOLD_IND = hOLD_IND;
	}
	public String getDD_NUMBER() {
		return DD_NUMBER;
	}
	public void setDD_NUMBER(String dD_NUMBER) {
		DD_NUMBER = dD_NUMBER;
	}
	public String getDD_DATE() {
		return DD_DATE;
	}
	public void setDD_DATE(String dD_DATE) {
		DD_DATE = dD_DATE;
	}
	public String getDD_AMOUNT() {
		return DD_AMOUNT;
	}
	public void setDD_AMOUNT(String dD_AMOUNT) {
		DD_AMOUNT = dD_AMOUNT;
	}
	public String getCOURIER_CODE() {
		return COURIER_CODE;
	}
	public void setCOURIER_CODE(String cOURIER_CODE) {
		COURIER_CODE = cOURIER_CODE;
	}
	public String getWAYBILL_NO() {
		return WAYBILL_NO;
	}
	public void setWAYBILL_NO(String wAYBILL_NO) {
		WAYBILL_NO = wAYBILL_NO;
	}
	public String getWAYBILL_DATE() {
		return WAYBILL_DATE;
	}
	public void setWAYBILL_DATE(String wAYBILL_DATE) {
		WAYBILL_DATE = wAYBILL_DATE;
	}
	public String getP_DIV_CODE() {
		return P_DIV_CODE;
	}
	public void setP_DIV_CODE(String p_DIV_CODE) {
		P_DIV_CODE = p_DIV_CODE;
	}
	public String getP_SUBDIV_CODE() {
		return P_SUBDIV_CODE;
	}
	public void setP_SUBDIV_CODE(String p_SUBDIV_CODE) {
		P_SUBDIV_CODE = p_SUBDIV_CODE;
	}
	public String getP_DEPT_CODE() {
		return P_DEPT_CODE;
	}
	public void setP_DEPT_CODE(String p_DEPT_CODE) {
		P_DEPT_CODE = p_DEPT_CODE;
	}
	public String getP_CC_CODE() {
		return P_CC_CODE;
	}
	public void setP_CC_CODE(String p_CC_CODE) {
		P_CC_CODE = p_CC_CODE;
	}
	public String getP_LOC_CODE() {
		return P_LOC_CODE;
	}
	public void setP_LOC_CODE(String p_LOC_CODE) {
		P_LOC_CODE = p_LOC_CODE;
	}
	public String getP_EMP_PAYMENT_MODE() {
		return P_EMP_PAYMENT_MODE;
	}
	public void setP_EMP_PAYMENT_MODE(String p_EMP_PAYMENT_MODE) {
		P_EMP_PAYMENT_MODE = p_EMP_PAYMENT_MODE;
	}
	public String getP_BUS_GROUP_CODE() {
		return P_BUS_GROUP_CODE;
	}
	public void setP_BUS_GROUP_CODE(String p_BUS_GROUP_CODE) {
		P_BUS_GROUP_CODE = p_BUS_GROUP_CODE;
	}
	public String getP_CATEGORY_CODE() {
		return P_CATEGORY_CODE;
	}
	public void setP_CATEGORY_CODE(String p_CATEGORY_CODE) {
		P_CATEGORY_CODE = p_CATEGORY_CODE;
	}
	public String getP_GRADE_CODE() {
		return P_GRADE_CODE;
	}
	public void setP_GRADE_CODE(String p_GRADE_CODE) {
		P_GRADE_CODE = p_GRADE_CODE;
	}
	public String getPAYSLIP_SRNO() {
		return PAYSLIP_SRNO;
	}
	public void setPAYSLIP_SRNO(String pAYSLIP_SRNO) {
		PAYSLIP_SRNO = pAYSLIP_SRNO;
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
	public String getP_POSITION_CODE() {
		return P_POSITION_CODE;
	}
	public void setP_POSITION_CODE(String p_POSITION_CODE) {
		P_POSITION_CODE = p_POSITION_CODE;
	}
	public String getP_EMP_IFSC_CODE() {
		return P_EMP_IFSC_CODE;
	}
	public void setP_EMP_IFSC_CODE(String p_EMP_IFSC_CODE) {
		P_EMP_IFSC_CODE = p_EMP_IFSC_CODE;
	}
	public String getP_EMP_BANK_ACCOUNT_NO() {
		return P_EMP_BANK_ACCOUNT_NO;
	}
	public void setP_EMP_BANK_ACCOUNT_NO(String p_EMP_BANK_ACCOUNT_NO) {
		P_EMP_BANK_ACCOUNT_NO = p_EMP_BANK_ACCOUNT_NO;
	}
	public String getP_BANK_BRNNAME() {
		return P_BANK_BRNNAME;
	}
	public void setP_BANK_BRNNAME(String p_BANK_BRNNAME) {
		P_BANK_BRNNAME = p_BANK_BRNNAME;
	}
	public String getP_BANK_CODE() {
		return P_BANK_CODE;
	}
	public void setP_BANK_CODE(String p_BANK_CODE) {
		P_BANK_CODE = p_BANK_CODE;
	}
	public T_PAYROLL_HEADER(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH, String pF_WAGES, String eSI_WAGES,
			String oT_HOURS, String aSHIFT_COUNT, String bSHIFT_COUNT,
			String cSHIFT_COUNT, String lOP_DAYS, String gROSS_EARNIN,
			String gROSS_DEDUCT, String hOLD_IND, String dD_NUMBER,
			String dD_DATE, String dD_AMOUNT, String cOURIER_CODE,
			String wAYBILL_NO, String wAYBILL_DATE, String p_DIV_CODE,
			String p_SUBDIV_CODE, String p_DEPT_CODE, String p_CC_CODE,
			String p_LOC_CODE, String p_EMP_PAYMENT_MODE,
			String p_BUS_GROUP_CODE, String p_CATEGORY_CODE,
			String p_GRADE_CODE, String pAYSLIP_SRNO, String cREATION_DATE,
			String uSER_ID, String mACHINE_ID, String p_POSITION_CODE,
			String p_EMP_IFSC_CODE, String p_EMP_BANK_ACCOUNT_NO,
			String p_BANK_BRNNAME, String p_BANK_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
		PF_WAGES = pF_WAGES;
		ESI_WAGES = eSI_WAGES;
		OT_HOURS = oT_HOURS;
		ASHIFT_COUNT = aSHIFT_COUNT;
		BSHIFT_COUNT = bSHIFT_COUNT;
		CSHIFT_COUNT = cSHIFT_COUNT;
		LOP_DAYS = lOP_DAYS;
		GROSS_EARNIN = gROSS_EARNIN;
		GROSS_DEDUCT = gROSS_DEDUCT;
		HOLD_IND = hOLD_IND;
		DD_NUMBER = dD_NUMBER;
		DD_DATE = dD_DATE;
		DD_AMOUNT = dD_AMOUNT;
		COURIER_CODE = cOURIER_CODE;
		WAYBILL_NO = wAYBILL_NO;
		WAYBILL_DATE = wAYBILL_DATE;
		P_DIV_CODE = p_DIV_CODE;
		P_SUBDIV_CODE = p_SUBDIV_CODE;
		P_DEPT_CODE = p_DEPT_CODE;
		P_CC_CODE = p_CC_CODE;
		P_LOC_CODE = p_LOC_CODE;
		P_EMP_PAYMENT_MODE = p_EMP_PAYMENT_MODE;
		P_BUS_GROUP_CODE = p_BUS_GROUP_CODE;
		P_CATEGORY_CODE = p_CATEGORY_CODE;
		P_GRADE_CODE = p_GRADE_CODE;
		PAYSLIP_SRNO = pAYSLIP_SRNO;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
		P_POSITION_CODE = p_POSITION_CODE;
		P_EMP_IFSC_CODE = p_EMP_IFSC_CODE;
		P_EMP_BANK_ACCOUNT_NO = p_EMP_BANK_ACCOUNT_NO;
		P_BANK_BRNNAME = p_BANK_BRNNAME;
		P_BANK_CODE = p_BANK_CODE;
	}
	
	

}

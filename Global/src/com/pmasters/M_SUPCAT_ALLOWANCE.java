package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_SUPCAT_ALLOWANCE")
@IdClass(M_SUPCAT_ALLWOANCE_PK.class)
public class M_SUPCAT_ALLOWANCE implements Serializable{
	
	@Id
	String COMPANY_CODE="";
	@Id
	String 	SUPER_CATEGORY_CODE="";
	@Id
	String ALLW_CODE  ="";
	@Column
	String ALLW_PERIODICITY="";
	@Column
	String ALLW_APPORTION_FLAG="";
	@Column
	String ALLW_ROUNDING_OFF  ="";
	@Column
	String ALLW_AMOUNT ="";
	@Column
	String ALLW_ORDER_NO="";
	@Column
	String ACCOUNT_CODE=""; 
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column	
	String MACHINE_ID="";
	public M_SUPCAT_ALLOWANCE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getSUPER_CATEGORY_CODE() {
		return SUPER_CATEGORY_CODE;
	}
	public void setSUPER_CATEGORY_CODE(String sUPER_CATEGORY_CODE) {
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getALLW_PERIODICITY() {
		return ALLW_PERIODICITY;
	}
	public void setALLW_PERIODICITY(String aLLW_PERIODICITY) {
		ALLW_PERIODICITY = aLLW_PERIODICITY;
	}
	public String getALLW_APPORTION_FLAG() {
		return ALLW_APPORTION_FLAG;
	}
	public void setALLW_APPORTION_FLAG(String aLLW_APPORTION_FLAG) {
		ALLW_APPORTION_FLAG = aLLW_APPORTION_FLAG;
	}
	public String getALLW_ROUNDING_OFF() {
		return ALLW_ROUNDING_OFF;
	}
	public void setALLW_ROUNDING_OFF(String aLLW_ROUNDING_OFF) {
		ALLW_ROUNDING_OFF = aLLW_ROUNDING_OFF;
	}
	public String getALLW_AMOUNT() {
		return ALLW_AMOUNT;
	}
	public void setALLW_AMOUNT(String aLLW_AMOUNT) {
		ALLW_AMOUNT = aLLW_AMOUNT;
	}
	public String getALLW_ORDER_NO() {
		return ALLW_ORDER_NO;
	}
	public void setALLW_ORDER_NO(String aLLW_ORDER_NO) {
		ALLW_ORDER_NO = aLLW_ORDER_NO;
	}
	public String getACCOUNT_CODE() {
		return ACCOUNT_CODE;
	}
	public void setACCOUNT_CODE(String aCCOUNT_CODE) {
		ACCOUNT_CODE = aCCOUNT_CODE;
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
	public M_SUPCAT_ALLOWANCE(String cOMPANY_CODE, String sUPER_CATEGORY_CODE,
			String aLLW_CODE, String aLLW_PERIODICITY,
			String aLLW_APPORTION_FLAG, String aLLW_ROUNDING_OFF,
			String aLLW_AMOUNT, String aLLW_ORDER_NO, String aCCOUNT_CODE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
		ALLW_CODE = aLLW_CODE;
		ALLW_PERIODICITY = aLLW_PERIODICITY;
		ALLW_APPORTION_FLAG = aLLW_APPORTION_FLAG;
		ALLW_ROUNDING_OFF = aLLW_ROUNDING_OFF;
		ALLW_AMOUNT = aLLW_AMOUNT;
		ALLW_ORDER_NO = aLLW_ORDER_NO;
		ACCOUNT_CODE = aCCOUNT_CODE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}        

}

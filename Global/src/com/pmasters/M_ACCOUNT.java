package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_ACCOUNT")
@IdClass(M_Account_Pk.class)
public class M_ACCOUNT  implements Serializable {

	public M_ACCOUNT() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
String 	COMPANY_CODE="";
	@Id
String	ACCOUNT_CODE="";
	@Column
String GROUP_ORDER="";
	@Column
String ACCOUNT_DESCR="";
	@Column
String ACCOUNT_DBCR="";
	@Column
String ACCOUNT_JV_DESCR="";
	@Column
String	CREATION_DATE="";
	@Column
String USER_ID="";
	@Column
String MACHINE_ID="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getACCOUNT_CODE() {
		return ACCOUNT_CODE;
	}
	public void setACCOUNT_CODE(String aCCOUNT_CODE) {
		ACCOUNT_CODE = aCCOUNT_CODE;
	}
	public String getGROUP_ORDER() {
		return GROUP_ORDER;
	}
	public void setGROUP_ORDER(String gROUP_ORDER) {
		GROUP_ORDER = gROUP_ORDER;
	}
	public String getACCOUNT_DESCR() {
		return ACCOUNT_DESCR;
	}
	public void setACCOUNT_DESCR(String aCCOUNT_DESCR) {
		ACCOUNT_DESCR = aCCOUNT_DESCR;
	}
	public String getACCOUNT_DBCR() {
		return ACCOUNT_DBCR;
	}
	public void setACCOUNT_DBCR(String aCCOUNT_DBCR) {
		ACCOUNT_DBCR = aCCOUNT_DBCR;
	}
	public String getACCOUNT_JV_DESCR() {
		return ACCOUNT_JV_DESCR;
	}
	public void setACCOUNT_JV_DESCR(String aCCOUNT_JV_DESCR) {
		ACCOUNT_JV_DESCR = aCCOUNT_JV_DESCR;
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
	public M_ACCOUNT(String cOMPANY_CODE, String aCCOUNT_CODE,
			String gROUP_ORDER, String aCCOUNT_DESCR, String aCCOUNT_DBCR,
			String aCCOUNT_JV_DESCR, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		ACCOUNT_CODE = aCCOUNT_CODE;
		GROUP_ORDER = gROUP_ORDER;
		ACCOUNT_DESCR = aCCOUNT_DESCR;
		ACCOUNT_DBCR = aCCOUNT_DBCR;
		ACCOUNT_JV_DESCR = aCCOUNT_JV_DESCR;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}          
	
	 

}

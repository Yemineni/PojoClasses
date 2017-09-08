package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_ALLOWANCE")
@IdClass(M_ALLOWANCE_PK.class)
public class M_ALLOWANCE implements Serializable {
	@Id
String 	COMPANY_CODE="";
	@Id
String	ALLW_CODE="";
	@Column
String 	ALLW_SHORT_DESCR="";
	@Column
String 	ALLW_DESCR="";
	@Column
String 	ALLW_TYPE ="";
	@Column
String 	ALLW_EARNING_MODE="";
	@Column
	String 	ALLW_ELEM_DERIV="";
	@Column
String 	ALLW_TAX_APPL="";  
	@Column
String 	ALLW_TAX_EXEMP_LIMIT="";
	@Column
String 	ALLW_GROUP_CODE="";
	@Column
String	ORG_EDR_CODE="";
	@Column
String 	CREATION_DATE="";
	@Column
String	USER_ID="";
	@Column
String 	MACHINE_ID="";
	public M_ALLOWANCE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getALLW_SHORT_DESCR() {
		return ALLW_SHORT_DESCR;
	}
	public void setALLW_SHORT_DESCR(String aLLW_SHORT_DESCR) {
		ALLW_SHORT_DESCR = aLLW_SHORT_DESCR;
	}
	public String getALLW_DESCR() {
		return ALLW_DESCR;
	}
	public void setALLW_DESCR(String aLLW_DESCR) {
		ALLW_DESCR = aLLW_DESCR;
	}
	public String getALLW_TYPE() {
		return ALLW_TYPE;
	}
	public void setALLW_TYPE(String aLLW_TYPE) {
		ALLW_TYPE = aLLW_TYPE;
	}
	public String getALLW_EARNING_MODE() {
		return ALLW_EARNING_MODE;
	}
	public void setALLW_EARNING_MODE(String aLLW_EARNING_MODE) {
		ALLW_EARNING_MODE = aLLW_EARNING_MODE;
	}
	public String getALLW_ELEM_DERIV() {
		return ALLW_ELEM_DERIV;
	}
	public void setALLW_ELEM_DERIV(String aLLW_ELEM_DERIV) {
		ALLW_ELEM_DERIV = aLLW_ELEM_DERIV;
	}
	public String getALLW_TAX_APPL() {
		return ALLW_TAX_APPL;
	}
	public void setALLW_TAX_APPL(String aLLW_TAX_APPL) {
		ALLW_TAX_APPL = aLLW_TAX_APPL;
	}
	public String getALLW_TAX_EXEMP_LIMIT() {
		return ALLW_TAX_EXEMP_LIMIT;
	}
	public void setALLW_TAX_EXEMP_LIMIT(String aLLW_TAX_EXEMP_LIMIT) {
		ALLW_TAX_EXEMP_LIMIT = aLLW_TAX_EXEMP_LIMIT;
	}
	public String getALLW_GROUP_CODE() {
		return ALLW_GROUP_CODE;
	}
	public void setALLW_GROUP_CODE(String aLLW_GROUP_CODE) {
		ALLW_GROUP_CODE = aLLW_GROUP_CODE;
	}
	public String getORG_EDR_CODE() {
		return ORG_EDR_CODE;
	}
	public void setORG_EDR_CODE(String oRG_EDR_CODE) {
		ORG_EDR_CODE = oRG_EDR_CODE;
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
	public M_ALLOWANCE(String cOMPANY_CODE, String aLLW_CODE,
			String aLLW_SHORT_DESCR, String aLLW_DESCR, String aLLW_TYPE,
			String aLLW_EARNING_MODE, String aLLW_ELEM_DERIV,
			String aLLW_TAX_APPL, String aLLW_TAX_EXEMP_LIMIT,
			String aLLW_GROUP_CODE, String oRG_EDR_CODE, String cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		ALLW_CODE = aLLW_CODE;
		ALLW_SHORT_DESCR = aLLW_SHORT_DESCR;
		ALLW_DESCR = aLLW_DESCR;
		ALLW_TYPE = aLLW_TYPE;
		ALLW_EARNING_MODE = aLLW_EARNING_MODE;
		ALLW_ELEM_DERIV = aLLW_ELEM_DERIV;
		ALLW_TAX_APPL = aLLW_TAX_APPL;
		ALLW_TAX_EXEMP_LIMIT = aLLW_TAX_EXEMP_LIMIT;
		ALLW_GROUP_CODE = aLLW_GROUP_CODE;
		ORG_EDR_CODE = oRG_EDR_CODE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	

}

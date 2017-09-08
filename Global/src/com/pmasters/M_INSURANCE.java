package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_INSURANCE")
@IdClass(Insurance_pk.class)

public class M_INSURANCE implements  Serializable  {
	@Id
	String COMPANY_CODE="";
	@Id
	String INSR_CODE="";
	@Column
	String INSR_DESCR="";
	@Column
	String INSR_DETAILS="";
	@Column
	String INSR_CATEGORY="";
	@Column
	String INSR_PREM_PERCENTAGE="";
	@Column
	String DEDUCTION_ALLW_CODE="";
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column
	String MACHINE_ID="";  
	


	public M_INSURANCE(String cOMPANY_CODE, String iNSR_CODE,
			String iNSR_DESCR, String iNSR_DETAILS, String iNSR_CATEGORY,
			String iNSR_PREM_PERCENTAGE, String dEDUCTION_ALLW_CODE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		INSR_CODE = iNSR_CODE;
		INSR_DESCR = iNSR_DESCR;
		INSR_DETAILS = iNSR_DETAILS;
		INSR_CATEGORY = iNSR_CATEGORY;
		INSR_PREM_PERCENTAGE = iNSR_PREM_PERCENTAGE;
		DEDUCTION_ALLW_CODE = dEDUCTION_ALLW_CODE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}



	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}



	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}



	public String getINSR_CODE() {
		return INSR_CODE;
	}



	public void setINSR_CODE(String iNSR_CODE) {
		INSR_CODE = iNSR_CODE;
	}



	public String getINSR_DESCR() {
		return INSR_DESCR;
	}



	public void setINSR_DESCR(String iNSR_DESCR) {
		INSR_DESCR = iNSR_DESCR;
	}



	public String getINSR_DETAILS() {
		return INSR_DETAILS;
	}



	public void setINSR_DETAILS(String iNSR_DETAILS) {
		INSR_DETAILS = iNSR_DETAILS;
	}



	public String getINSR_CATEGORY() {
		return INSR_CATEGORY;
	}



	public void setINSR_CATEGORY(String iNSR_CATEGORY) {
		INSR_CATEGORY = iNSR_CATEGORY;
	}



	public String getINSR_PREM_PERCENTAGE() {
		return INSR_PREM_PERCENTAGE;
	}



	public void setINSR_PREM_PERCENTAGE(String iNSR_PREM_PERCENTAGE) {
		INSR_PREM_PERCENTAGE = iNSR_PREM_PERCENTAGE;
	}



	public String getDEDUCTION_ALLW_CODE() {
		return DEDUCTION_ALLW_CODE;
	}



	public void setDEDUCTION_ALLW_CODE(String dEDUCTION_ALLW_CODE) {
		DEDUCTION_ALLW_CODE = dEDUCTION_ALLW_CODE;
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



	public M_INSURANCE() {
		// TODO Auto-generated constructor stub
	}

}

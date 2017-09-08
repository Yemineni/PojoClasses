package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="hr.M_EMPSPEC_SALARY")
@IdClass(M_EMPSPEC_SALARY_Pk.class)
public class M_EMPSPEC_SALARY implements Serializable {
	public M_EMPSPEC_SALARY() {
		// TODO Auto-generated constructor stub
	}
	public M_EMPSPEC_SALARY(String cOMPANY_CODE, String eMP_CODE,
			String aLLW_CODE, String eFFECTIVE_DATE, String aLLW_AMOUNT,
			String aLLW_STATUS, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ALLW_CODE = aLLW_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		ALLW_AMOUNT = aLLW_AMOUNT;
		ALLW_STATUS = aLLW_STATUS;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}

	@Id  String COMPANY_CODE="";    
	@Id  String EMP_CODE="";
	@Id  String ALLW_CODE="";
	@Column String EFFECTIVE_DATE="";
	@Column String ALLW_AMOUNT="";
	@Column String ALLW_STATUS="";
	@Column String CREATION_DATE="";  
	@Column String	USER_ID  ="";      
	@Column String MACHINE_ID="";
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
	public String getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getALLW_AMOUNT() {
		return ALLW_AMOUNT;
	}
	public void setALLW_AMOUNT(String aLLW_AMOUNT) {
		ALLW_AMOUNT = aLLW_AMOUNT;
	}
	public String getALLW_STATUS() {
		return ALLW_STATUS;
	}
	public void setALLW_STATUS(String aLLW_STATUS) {
		ALLW_STATUS = aLLW_STATUS;
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


	
	
	   
	  

}

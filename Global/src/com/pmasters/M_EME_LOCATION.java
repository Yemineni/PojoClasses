package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_EME_LOCATION")
@IdClass(M_EME_LOCATION_PK.class)
public class M_EME_LOCATION implements Serializable {

	public M_EME_LOCATION() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	String COMPANY_CODE="";
	@Id
	String EME_LOC_CODE="";
	@Column
	String EME_NAME="";
	@Column
	Date CREATION_DATE;
	@Column
	String USER_ID="";
	@Column
	String MACHINE_ID="";
	public M_EME_LOCATION(String cOMPANY_CODE, String eME_LOC_CODE,
			String eME_NAME, Date cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EME_LOC_CODE = eME_LOC_CODE;
		EME_NAME = eME_NAME;
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
	public String getEME_LOC_CODE() {
		return EME_LOC_CODE;
	}
	public void setEME_LOC_CODE(String eME_LOC_CODE) {
		EME_LOC_CODE = eME_LOC_CODE;
	}
	public String getEME_NAME() {
		return EME_NAME;
	}
	public void setEME_NAME(String eME_NAME) {
		EME_NAME = eME_NAME;
	}
	public Date getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(Date cREATION_DATE) {
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

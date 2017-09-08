package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="")
@IdClass(M_REGION_pk.class)
public class M_REGION implements Serializable {

	public M_REGION() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
String COMPANY_CODE="";
	@Id
String REGION_CODE="";
	@Column
String REGION_DESCR="";
	@Column
Date CREATION_DATE;
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
	public String getREGION_CODE() {
		return REGION_CODE;
	}
	public void setREGION_CODE(String rEGION_CODE) {
		REGION_CODE = rEGION_CODE;
	}
	public String getREGION_DESCR() {
		return REGION_DESCR;
	}
	public void setREGION_DESCR(String rEGION_DESCR) {
		REGION_DESCR = rEGION_DESCR;
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
	public M_REGION(String cOMPANY_CODE, String rEGION_CODE,
			String rEGION_DESCR, Date cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		REGION_CODE = rEGION_CODE;
		REGION_DESCR = rEGION_DESCR;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}  
	
	
	

}

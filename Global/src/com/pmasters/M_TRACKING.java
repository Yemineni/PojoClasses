package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_TRACKING_CODES")
@IdClass(M_TRACKING_PK.class)
public class M_TRACKING implements Serializable {
	@Id
	String COMPANY_CODE="";
	@Id
	String TRACKING_CODE="";
	@Column
	String TRACKING_DESCR="";
	@Column
	String SCHEDULED_DD="";
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column
	String MACHINE_ID="";
	
	
	public M_TRACKING(String cOMPANY_CODE, String tRACKING_CODE,
			String tRACKING_DESCR, String sCHEDULED_DD, String cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		TRACKING_CODE = tRACKING_CODE;
		TRACKING_DESCR = tRACKING_DESCR;
		SCHEDULED_DD = sCHEDULED_DD;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	public M_TRACKING() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getTRACKING_CODE() {
		return TRACKING_CODE;
	}
	public void setTRACKING_CODE(String tRACKING_CODE) {
		TRACKING_CODE = tRACKING_CODE;
	}
	public String getTRACKING_DESCR() {
		return TRACKING_DESCR;
	}
	public void setTRACKING_DESCR(String tRACKING_DESCR) {
		TRACKING_DESCR = tRACKING_DESCR;
	}
	public String getSCHEDULED_DD() {
		return SCHEDULED_DD;
	}
	public void setSCHEDULED_DD(String sCHEDULED_DD) {
		SCHEDULED_DD = sCHEDULED_DD;
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

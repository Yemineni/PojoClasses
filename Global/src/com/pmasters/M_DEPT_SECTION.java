package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_DEPT_SECTION")
@IdClass(M_DEPT_SECTION.class)

public class M_DEPT_SECTION  implements Serializable {

	public M_DEPT_SECTION() {
		// TODO Auto-generated constructor stub
	}

	public M_DEPT_SECTION(String cOMPANY_CODE, String dEPT_CODE,
			String sECTION_CODE, String sECTION_DESCR, Date cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		DEPT_CODE = dEPT_CODE;
		SECTION_CODE = sECTION_CODE;
		SECTION_DESCR = sECTION_DESCR;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}

	@Id
	String COMPANY_CODE="";
	@Id
	String DEPT_CODE="";
	@Id
	String SECTION_CODE="";
	@Column
	String SECTION_DESCR="";
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
	public String getDEPT_CODE() {
		return DEPT_CODE;
	}
	public void setDEPT_CODE(String dEPT_CODE) {
		DEPT_CODE = dEPT_CODE;
	}
	public String getSECTION_CODE() {
		return SECTION_CODE;
	}
	public void setSECTION_CODE(String sECTION_CODE) {
		SECTION_CODE = sECTION_CODE;
	}
	public String getSECTION_DESCR() {
		return SECTION_DESCR;
	}
	public void setSECTION_DESCR(String sECTION_DESCR) {
		SECTION_DESCR = sECTION_DESCR;
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

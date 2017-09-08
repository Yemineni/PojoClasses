package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="M_TALENT")
@IdClass(Talent_pk.class)
public class M_TALENT implements Serializable {

	public M_TALENT() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	public M_TALENT(String cOMPANY_CODE, String tALENT_CODE,
			String tALENT_DESCR, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		TALENT_CODE = tALENT_CODE;
		TALENT_DESCR = tALENT_DESCR;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	@Id
	String TALENT_CODE="";
	@Column
	String TALENT_DESCR="";
	
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column
	String  MACHINE_ID="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getTALENT_CODE() {
		return TALENT_CODE;
	}
	public void setTALENT_CODE(String tALENT_CODE) {
		TALENT_CODE = tALENT_CODE;
	}
	public String getTALENT_DESCR() {
		return TALENT_DESCR;
	}
	public void setTALENT_DESCR(String tALENT_DESCR) {
		TALENT_DESCR = tALENT_DESCR;
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

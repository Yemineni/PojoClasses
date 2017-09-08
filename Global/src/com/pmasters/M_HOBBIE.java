package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="M_HOBBIES")
@IdClass(Hobby_pk.class)

public class M_HOBBIE implements Serializable {
	@Id
	String COMPANY_CODE="";
	@Id
	String HOBBY_CODE="";
	@Column
	String HOBBY_DESCR="";
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column
	String  MACHINE_ID="";
		
	public M_HOBBIE(String cOMPANY_CODE, String hOBBY_CODE, String hOBBY_DESCR,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		HOBBY_CODE = hOBBY_CODE;
		HOBBY_DESCR = hOBBY_DESCR;
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

	public String getHOBBY_CODE() {
		return HOBBY_CODE;
	}

	public void setHOBBY_CODE(String hOBBY_CODE) {
		HOBBY_CODE = hOBBY_CODE;
	}

	public String getHOBBY_DESCR() {
		return HOBBY_DESCR;
	}

	public void setHOBBY_DESCR(String hOBBY_DESCR) {
		HOBBY_DESCR = hOBBY_DESCR;
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

	public M_HOBBIE() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

}

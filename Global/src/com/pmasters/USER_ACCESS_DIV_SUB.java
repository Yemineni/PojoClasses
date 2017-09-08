package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="masters.user_access_div_sub")
@IdClass(USER_ACCESS_DIV_SUB_PK.class)
public class USER_ACCESS_DIV_SUB implements Serializable {

	public USER_ACCESS_DIV_SUB() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE  ="";
	@Id
	String USER_ID             =""; 
	@Id
	String DIV_CODE            ="";
	@Id
	String SUBDIV_CODE         ="";
	@Id
	String SUPER_CATEGORY_CODE ="";
	@Column
	String CREATION_DATE       ="";
	@Column
	String MACHINE_ID   ="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getDIV_CODE() {
		return DIV_CODE;
	}
	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}
	public String getSUBDIV_CODE() {
		return SUBDIV_CODE;
	}
	public void setSUBDIV_CODE(String sUBDIV_CODE) {
		SUBDIV_CODE = sUBDIV_CODE;
	}
	public String getSUPER_CATEGORY_CODE() {
		return SUPER_CATEGORY_CODE;
	}
	public void setSUPER_CATEGORY_CODE(String sUPER_CATEGORY_CODE) {
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
	}
	public String getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public String getMACHINE_ID() {
		return MACHINE_ID;
	}
	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}
	public USER_ACCESS_DIV_SUB(String cOMPANY_CODE, String uSER_ID,
			String dIV_CODE, String sUBDIV_CODE, String sUPER_CATEGORY_CODE,
			String cREATION_DATE, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		USER_ID = uSER_ID;
		DIV_CODE = dIV_CODE;
		SUBDIV_CODE = sUBDIV_CODE;
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
		CREATION_DATE = cREATION_DATE;
		MACHINE_ID = mACHINE_ID;
	} 
	
}

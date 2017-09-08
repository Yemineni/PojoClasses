package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name ="M_RELATION")
@IdClass(Relation_Pk.class)
public class M_RELATION implements Serializable {

	public M_RELATION() {
		// TODO Auto-generated constructor stub
	}
	
	public M_RELATION(String cOMPANY_CODE, String rELATION_CODE,
			String rELATION_DESCR, String rELATION_DEP_STATUS,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		RELATION_CODE = rELATION_CODE;
		RELATION_DESCR = rELATION_DESCR;
		RELATION_DEP_STATUS = rELATION_DEP_STATUS;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	@Id
	String COMPANY_CODE="";
	
	@Id
	String RELATION_CODE="";
	@Column
	String RELATION_DESCR="";
	@Column
	String RELATION_DEP_STATUS="";
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
	public String getRELATION_CODE() {
		return RELATION_CODE;
	}
	public void setRELATION_CODE(String rELATION_CODE) {
		RELATION_CODE = rELATION_CODE;
	}
	public String getRELATION_DESCR() {
		return RELATION_DESCR;
	}
	public void setRELATION_DESCR(String rELATION_DESCR) {
		RELATION_DESCR = rELATION_DESCR;
	}
	public String getRELATION_DEP_STATUS() {
		return RELATION_DEP_STATUS;
	}
	public void setRELATION_DEP_STATUS(String rELATION_DEP_STATUS) {
		RELATION_DEP_STATUS = rELATION_DEP_STATUS;
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

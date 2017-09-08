package com.pmasters;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_EMP_NOMINATION")
@IdClass(M_EMP_NOMINATION_PK.class)
public class M_EMP_NOMINATION {

	public M_EMP_NOMINATION() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Id
	String NOMINATION_TYPE="";
	@Column
	String POLICY_NUMBER="";
	@Column
	String RELATION_CODE="";
	@Column
	String NOMINEE_NAME="";
	@Column
	String NOMINEE_DOB="";
	@Column
	String NOMINATION_AMOUNT="";
	@Column
	String NOMINATION_PERCENT="";
	@Column
	String NOMINEE_GUARDIAN_NAME="";
	@Column
	String NOMINEE_GUARDIAN_RELATION="";
	@Column
	String NOMINEE_AGE="";
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
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getNOMINATION_TYPE() {
		return NOMINATION_TYPE;
	}
	public void setNOMINATION_TYPE(String nOMINATION_TYPE) {
		NOMINATION_TYPE = nOMINATION_TYPE;
	}
	public String getPOLICY_NUMBER() {
		return POLICY_NUMBER;
	}
	public void setPOLICY_NUMBER(String pOLICY_NUMBER) {
		POLICY_NUMBER = pOLICY_NUMBER;
	}
	public String getRELATION_CODE() {
		return RELATION_CODE;
	}
	public void setRELATION_CODE(String rELATION_CODE) {
		RELATION_CODE = rELATION_CODE;
	}
	public String getNOMINEE_NAME() {
		return NOMINEE_NAME;
	}
	public void setNOMINEE_NAME(String nOMINEE_NAME) {
		NOMINEE_NAME = nOMINEE_NAME;
	}
	public String getNOMINEE_DOB() {
		return NOMINEE_DOB;
	}
	public void setNOMINEE_DOB(String nOMINEE_DOB) {
		NOMINEE_DOB = nOMINEE_DOB;
	}
	public String getNOMINATION_AMOUNT() {
		return NOMINATION_AMOUNT;
	}
	public void setNOMINATION_AMOUNT(String nOMINATION_AMOUNT) {
		NOMINATION_AMOUNT = nOMINATION_AMOUNT;
	}
	public String getNOMINATION_PERCENT() {
		return NOMINATION_PERCENT;
	}
	public void setNOMINATION_PERCENT(String nOMINATION_PERCENT) {
		NOMINATION_PERCENT = nOMINATION_PERCENT;
	}
	public String getNOMINEE_GUARDIAN_NAME() {
		return NOMINEE_GUARDIAN_NAME;
	}
	public void setNOMINEE_GUARDIAN_NAME(String nOMINEE_GUARDIAN_NAME) {
		NOMINEE_GUARDIAN_NAME = nOMINEE_GUARDIAN_NAME;
	}
	public String getNOMINEE_GUARDIAN_RELATION() {
		return NOMINEE_GUARDIAN_RELATION;
	}
	public void setNOMINEE_GUARDIAN_RELATION(String nOMINEE_GUARDIAN_RELATION) {
		NOMINEE_GUARDIAN_RELATION = nOMINEE_GUARDIAN_RELATION;
	}
	public String getNOMINEE_AGE() {
		return NOMINEE_AGE;
	}
	public void setNOMINEE_AGE(String nOMINEE_AGE) {
		NOMINEE_AGE = nOMINEE_AGE;
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
	public M_EMP_NOMINATION(String cOMPANY_CODE, String eMP_CODE,
			String nOMINATION_TYPE, String pOLICY_NUMBER, String rELATION_CODE,
			String nOMINEE_NAME, String nOMINEE_DOB, String nOMINATION_AMOUNT,
			String nOMINATION_PERCENT, String nOMINEE_GUARDIAN_NAME,
			String nOMINEE_GUARDIAN_RELATION, String nOMINEE_AGE,
			Date cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		NOMINATION_TYPE = nOMINATION_TYPE;
		POLICY_NUMBER = pOLICY_NUMBER;
		RELATION_CODE = rELATION_CODE;
		NOMINEE_NAME = nOMINEE_NAME;
		NOMINEE_DOB = nOMINEE_DOB;
		NOMINATION_AMOUNT = nOMINATION_AMOUNT;
		NOMINATION_PERCENT = nOMINATION_PERCENT;
		NOMINEE_GUARDIAN_NAME = nOMINEE_GUARDIAN_NAME;
		NOMINEE_GUARDIAN_RELATION = nOMINEE_GUARDIAN_RELATION;
		NOMINEE_AGE = nOMINEE_AGE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}       
	
	

}

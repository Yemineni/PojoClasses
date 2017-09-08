package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_BANK")
@IdClass(M_bank_pk.class)
public class M_BANK  implements Serializable{

	public M_BANK() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	@Id
	String BANK_CODE="";
	@Column
	String BANK_NAME="";
	@Column
	String BRANCH_NAME="";
	@Column
	String BANK_ADDRESS1="";
	@Column
	String BANK_ADDRESS2="";
	@Column
	String BANK_ADDRESS3="";
	@Column
	String BANK_CITY="";
	@Column
	String BANK_PINCODE="";
	@Column
	String BANK_TELNOS="";
	@Column
	String BANK_CONTACT_PERSON="";
	@Column
	String BANK_CHEQUE_CHARGES="";
	@Column
	String BANK_ACCOUNT_CODE="";
	@Column
	String CREATION_DATE="";
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
	public String getBANK_CODE() {
		return BANK_CODE;
	}
	public void setBANK_CODE(String bANK_CODE) {
		BANK_CODE = bANK_CODE;
	}
	public String getBANK_NAME() {
		return BANK_NAME;
	}
	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}
	public String getBRANCH_NAME() {
		return BRANCH_NAME;
	}
	public void setBRANCH_NAME(String bRANCH_NAME) {
		BRANCH_NAME = bRANCH_NAME;
	}
	public String getBANK_ADDRESS1() {
		return BANK_ADDRESS1;
	}
	public void setBANK_ADDRESS1(String bANK_ADDRESS1) {
		BANK_ADDRESS1 = bANK_ADDRESS1;
	}
	public String getBANK_ADDRESS2() {
		return BANK_ADDRESS2;
	}
	public void setBANK_ADDRESS2(String bANK_ADDRESS2) {
		BANK_ADDRESS2 = bANK_ADDRESS2;
	}
	public String getBANK_ADDRESS3() {
		return BANK_ADDRESS3;
	}
	public void setBANK_ADDRESS3(String bANK_ADDRESS3) {
		BANK_ADDRESS3 = bANK_ADDRESS3;
	}
	public String getBANK_CITY() {
		return BANK_CITY;
	}
	public void setBANK_CITY(String bANK_CITY) {
		BANK_CITY = bANK_CITY;
	}
	public String getBANK_PINCODE() {
		return BANK_PINCODE;
	}
	public void setBANK_PINCODE(String bANK_PINCODE) {
		BANK_PINCODE = bANK_PINCODE;
	}
	public String getBANK_TELNOS() {
		return BANK_TELNOS;
	}
	public void setBANK_TELNOS(String bANK_TELNOS) {
		BANK_TELNOS = bANK_TELNOS;
	}
	public String getBANK_CONTACT_PERSON() {
		return BANK_CONTACT_PERSON;
	}
	public void setBANK_CONTACT_PERSON(String bANK_CONTACT_PERSON) {
		BANK_CONTACT_PERSON = bANK_CONTACT_PERSON;
	}
	public String getBANK_CHEQUE_CHARGES() {
		return BANK_CHEQUE_CHARGES;
	}
	public void setBANK_CHEQUE_CHARGES(String bANK_CHEQUE_CHARGES) {
		BANK_CHEQUE_CHARGES = bANK_CHEQUE_CHARGES;
	}
	public String getBANK_ACCOUNT_CODE() {
		return BANK_ACCOUNT_CODE;
	}
	public void setBANK_ACCOUNT_CODE(String bANK_ACCOUNT_CODE) {
		BANK_ACCOUNT_CODE = bANK_ACCOUNT_CODE;
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
	public M_BANK(String cOMPANY_CODE, String bANK_CODE, String bANK_NAME,
			String bRANCH_NAME, String bANK_ADDRESS1, String bANK_ADDRESS2,
			String bANK_ADDRESS3, String bANK_CITY, String bANK_PINCODE,
			String bANK_TELNOS, String bANK_CONTACT_PERSON,
			String bANK_CHEQUE_CHARGES, String bANK_ACCOUNT_CODE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		BANK_CODE = bANK_CODE;
		BANK_NAME = bANK_NAME;
		BRANCH_NAME = bRANCH_NAME;
		BANK_ADDRESS1 = bANK_ADDRESS1;
		BANK_ADDRESS2 = bANK_ADDRESS2;
		BANK_ADDRESS3 = bANK_ADDRESS3;
		BANK_CITY = bANK_CITY;
		BANK_PINCODE = bANK_PINCODE;
		BANK_TELNOS = bANK_TELNOS;
		BANK_CONTACT_PERSON = bANK_CONTACT_PERSON;
		BANK_CHEQUE_CHARGES = bANK_CHEQUE_CHARGES;
		BANK_ACCOUNT_CODE = bANK_ACCOUNT_CODE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}

	
	
}

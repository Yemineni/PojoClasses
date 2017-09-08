package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_LOCATION")
@IdClass(M_LOCATION_PK.class)
public class M_LOCATION implements Serializable  {

	public M_LOCATION() {
		// TODO Auto-generated constructor stub
	}
	
	
	public M_LOCATION(String cOMPANY_CODE, String lOC_CODE, String lOC_DESCR,
			String lOC_ADDRESS1, String lOC_ADDRESS2, String lOC_ADDRESS3,
			String lOC_CITY, String lOC_PIN, String lOC_STATE_CODE,
			String cOUNTRY_CODE, String lOC_TELNOS, String lOC_FAXNOS,
			String lOC_EMAIL, String mETRO_FLAG, String cITY_CATEGORY,
			String sENSITIVE_CATEGORY, String iTAX_POP_FLAG,
			String rEGION_CODE, String eME_JURISDICTION_CODE,
			String sTATE_CODE, Date cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		LOC_CODE = lOC_CODE;
		LOC_DESCR = lOC_DESCR;
		LOC_ADDRESS1 = lOC_ADDRESS1;
		LOC_ADDRESS2 = lOC_ADDRESS2;
		LOC_ADDRESS3 = lOC_ADDRESS3;
		LOC_CITY = lOC_CITY;
		LOC_PIN = lOC_PIN;
		LOC_STATE_CODE = lOC_STATE_CODE;
		COUNTRY_CODE = cOUNTRY_CODE;
		LOC_TELNOS = lOC_TELNOS;
		LOC_FAXNOS = lOC_FAXNOS;
		LOC_EMAIL = lOC_EMAIL;
		METRO_FLAG = mETRO_FLAG;
		CITY_CATEGORY = cITY_CATEGORY;
		SENSITIVE_CATEGORY = sENSITIVE_CATEGORY;
		ITAX_POP_FLAG = iTAX_POP_FLAG;
		REGION_CODE = rEGION_CODE;
		EME_JURISDICTION_CODE = eME_JURISDICTION_CODE;
		STATE_CODE = sTATE_CODE;
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


	public String getLOC_CODE() {
		return LOC_CODE;
	}


	public void setLOC_CODE(String lOC_CODE) {
		LOC_CODE = lOC_CODE;
	}


	public String getLOC_DESCR() {
		return LOC_DESCR;
	}


	public void setLOC_DESCR(String lOC_DESCR) {
		LOC_DESCR = lOC_DESCR;
	}


	public String getLOC_ADDRESS1() {
		return LOC_ADDRESS1;
	}


	public void setLOC_ADDRESS1(String lOC_ADDRESS1) {
		LOC_ADDRESS1 = lOC_ADDRESS1;
	}


	public String getLOC_ADDRESS2() {
		return LOC_ADDRESS2;
	}


	public void setLOC_ADDRESS2(String lOC_ADDRESS2) {
		LOC_ADDRESS2 = lOC_ADDRESS2;
	}


	public String getLOC_ADDRESS3() {
		return LOC_ADDRESS3;
	}


	public void setLOC_ADDRESS3(String lOC_ADDRESS3) {
		LOC_ADDRESS3 = lOC_ADDRESS3;
	}


	public String getLOC_CITY() {
		return LOC_CITY;
	}


	public void setLOC_CITY(String lOC_CITY) {
		LOC_CITY = lOC_CITY;
	}


	public String getLOC_PIN() {
		return LOC_PIN;
	}


	public void setLOC_PIN(String lOC_PIN) {
		LOC_PIN = lOC_PIN;
	}


	public String getLOC_STATE_CODE() {
		return LOC_STATE_CODE;
	}


	public void setLOC_STATE_CODE(String lOC_STATE_CODE) {
		LOC_STATE_CODE = lOC_STATE_CODE;
	}


	public String getCOUNTRY_CODE() {
		return COUNTRY_CODE;
	}


	public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
		COUNTRY_CODE = cOUNTRY_CODE;
	}


	public String getLOC_TELNOS() {
		return LOC_TELNOS;
	}


	public void setLOC_TELNOS(String lOC_TELNOS) {
		LOC_TELNOS = lOC_TELNOS;
	}


	public String getLOC_FAXNOS() {
		return LOC_FAXNOS;
	}


	public void setLOC_FAXNOS(String lOC_FAXNOS) {
		LOC_FAXNOS = lOC_FAXNOS;
	}


	public String getLOC_EMAIL() {
		return LOC_EMAIL;
	}


	public void setLOC_EMAIL(String lOC_EMAIL) {
		LOC_EMAIL = lOC_EMAIL;
	}


	public String getMETRO_FLAG() {
		return METRO_FLAG;
	}


	public void setMETRO_FLAG(String mETRO_FLAG) {
		METRO_FLAG = mETRO_FLAG;
	}


	public String getCITY_CATEGORY() {
		return CITY_CATEGORY;
	}


	public void setCITY_CATEGORY(String cITY_CATEGORY) {
		CITY_CATEGORY = cITY_CATEGORY;
	}


	public String getSENSITIVE_CATEGORY() {
		return SENSITIVE_CATEGORY;
	}


	public void setSENSITIVE_CATEGORY(String sENSITIVE_CATEGORY) {
		SENSITIVE_CATEGORY = sENSITIVE_CATEGORY;
	}


	public String getITAX_POP_FLAG() {
		return ITAX_POP_FLAG;
	}


	public void setITAX_POP_FLAG(String iTAX_POP_FLAG) {
		ITAX_POP_FLAG = iTAX_POP_FLAG;
	}


	public String getREGION_CODE() {
		return REGION_CODE;
	}


	public void setREGION_CODE(String rEGION_CODE) {
		REGION_CODE = rEGION_CODE;
	}


	public String getEME_JURISDICTION_CODE() {
		return EME_JURISDICTION_CODE;
	}


	public void setEME_JURISDICTION_CODE(String eME_JURISDICTION_CODE) {
		EME_JURISDICTION_CODE = eME_JURISDICTION_CODE;
	}


	public String getSTATE_CODE() {
		return STATE_CODE;
	}


	public void setSTATE_CODE(String sTATE_CODE) {
		STATE_CODE = sTATE_CODE;
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

   @Id
	String COMPANY_CODE="";
   @Id
	String LOC_CODE="";
   @Column
	String LOC_DESCR   ="";
   @Column
	String LOC_ADDRESS1    ="";
   @Column
	String LOC_ADDRESS2        ="";
   @Column
	String LOC_ADDRESS3          ="";
   @Column
	String LOC_CITY              ="";
   @Column
	String LOC_PIN     ="";
   @Column
	String LOC_STATE_CODE  ="";
   @Column
	String COUNTRY_CODE        ="";
   @Column
	String LOC_TELNOS            ="";
   @Column
	String LOC_FAXNOS            ="";
   @Column
	String LOC_EMAIL             ="";
   @Column
	String METRO_FLAG             ="";
   @Column
	String CITY_CATEGORY          ="";
   @Column
	String SENSITIVE_CATEGORY     ="";
   @Column
	String ITAX_POP_FLAG          ="";
   @Column
	String REGION_CODE            ="";
   @Column
	String EME_JURISDICTION_CODE  ="";
   @Column
	String STATE_CODE             ="";
   @Column
	Date CREATION_DATE                ;
   @Column
	String USER_ID="";
   @Column
	String MACHINE_ID       ="";

}

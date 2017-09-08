package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="M_WELFARE")
@IdClass(M_Welfare_pk.class)
public class M_WELFARE implements Serializable  {
	@Id
	String COMPANY_CODE ="";
	@Id
	String 	WELFARE_CODE="";
	@Column
	String 	WELFARE_DESCR="";
	@Column
	Date	EFFECTIVE_DATE;
	@Column
	String 	WELFARE_PER_TRANS_CHARGE="";
	@Column
	String ALLW_CODE  ="";
	@Column
	String TAX_SECTION_CODE="";
	@Column
	String EXEMPTED_PERCENTAGE="";
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
	public String getWELFARE_CODE() {
		return WELFARE_CODE;
	}
	public void setWELFARE_CODE(String wELFARE_CODE) {
		WELFARE_CODE = wELFARE_CODE;
	}
	public String getWELFARE_DESCR() {
		return WELFARE_DESCR;
	}
	public void setWELFARE_DESCR(String wELFARE_DESCR) {
		WELFARE_DESCR = wELFARE_DESCR;
	}
	public Date getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(Date eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getWELFARE_PER_TRANS_CHARGE() {
		return WELFARE_PER_TRANS_CHARGE;
	}
	public void setWELFARE_PER_TRANS_CHARGE(String wELFARE_PER_TRANS_CHARGE) {
		WELFARE_PER_TRANS_CHARGE = wELFARE_PER_TRANS_CHARGE;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getTAX_SECTION_CODE() {
		return TAX_SECTION_CODE;
	}
	public void setTAX_SECTION_CODE(String tAX_SECTION_CODE) {
		TAX_SECTION_CODE = tAX_SECTION_CODE;
	}
	public String getEXEMPTED_PERCENTAGE() {
		return EXEMPTED_PERCENTAGE;
	}
	public void setEXEMPTED_PERCENTAGE(String eXEMPTED_PERCENTAGE) {
		EXEMPTED_PERCENTAGE = eXEMPTED_PERCENTAGE;
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
	public M_WELFARE(String cOMPANY_CODE, String wELFARE_CODE,
			String wELFARE_DESCR, Date eFFECTIVE_DATE,
			String wELFARE_PER_TRANS_CHARGE, String aLLW_CODE,
			String tAX_SECTION_CODE, String eXEMPTED_PERCENTAGE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		WELFARE_CODE = wELFARE_CODE;
		WELFARE_DESCR = wELFARE_DESCR;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		WELFARE_PER_TRANS_CHARGE = wELFARE_PER_TRANS_CHARGE;
		ALLW_CODE = aLLW_CODE;
		TAX_SECTION_CODE = tAX_SECTION_CODE;
		EXEMPTED_PERCENTAGE = eXEMPTED_PERCENTAGE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	public M_WELFARE() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	}

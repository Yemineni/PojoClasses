package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="HR.TH_EMP_INCREMENT")
@IdClass(T_EMP_INCREMENT_PK.class)
public class TH_EMP_INCREMENT implements Serializable {
	public TH_EMP_INCREMENT() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE       ="";
	@Id
	String EFFECTIVE_DATE     ="";  
	@Id
	String ALLW_CODE        ="";
	@Column
	String PREV_AMOUNT     ="";
	@Column
	String REVISED_AMOUNT  ="";
	@Column
	String ALLW_STATUS      ="";
	@Column
	String UPDATE_DATE          ="";
	@Column
	String PROCESSED_FLAG   ="";
	@Column
	String CREATION_DATE        ="";
	@Column
	String USER_ID         ="";
	@Column
	String MACHINE_ID        ="";
	public TH_EMP_INCREMENT(String cOMPANY_CODE, String eMP_CODE,
			String eFFECTIVE_DATE, String aLLW_CODE, String pREV_AMOUNT,
			String rEVISED_AMOUNT, String aLLW_STATUS, String uPDATE_DATE,
			String pROCESSED_FLAG, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		ALLW_CODE = aLLW_CODE;
		PREV_AMOUNT = pREV_AMOUNT;
		REVISED_AMOUNT = rEVISED_AMOUNT;
		ALLW_STATUS = aLLW_STATUS;
		UPDATE_DATE = uPDATE_DATE;
		PROCESSED_FLAG = pROCESSED_FLAG;
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
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getPREV_AMOUNT() {
		return PREV_AMOUNT;
	}
	public void setPREV_AMOUNT(String pREV_AMOUNT) {
		PREV_AMOUNT = pREV_AMOUNT;
	}
	public String getREVISED_AMOUNT() {
		return REVISED_AMOUNT;
	}
	public void setREVISED_AMOUNT(String rEVISED_AMOUNT) {
		REVISED_AMOUNT = rEVISED_AMOUNT;
	}
	public String getALLW_STATUS() {
		return ALLW_STATUS;
	}
	public void setALLW_STATUS(String aLLW_STATUS) {
		ALLW_STATUS = aLLW_STATUS;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getPROCESSED_FLAG() {
		return PROCESSED_FLAG;
	}
	public void setPROCESSED_FLAG(String pROCESSED_FLAG) {
		PROCESSED_FLAG = pROCESSED_FLAG;
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

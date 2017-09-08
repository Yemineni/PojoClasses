package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="hr.EMP_TCC_header")
@IdClass(EMP_TCC_HEADER_pk.class)
public class EMP_TCC_HEADER implements Serializable {

	public EMP_TCC_HEADER() {
		// TODO Auto-generated constructor stub
	}

	@Id String COMPANY_CODE="";  
	@Id String EMP_CODE =""; 
	@Id String EFFECTIVE_DATE="";          
	@Column float TCC_AMOUNT=0.0f;                
	@Column String TCC_APPROVED_BY;           
	@Column int  EMP_TCC_UNIQUE_NO;            
	@Column String TCC_INACTIVE_DATE;                 
	@Column String UPDATE_DATE;                       
	@Column String CREATION_DATE;                     
	@Column String USER_ID ;                  
	@Column String MACHINE_ID;
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
	public float getTCC_AMOUNT() {
		return TCC_AMOUNT;
	}
	public void setTCC_AMOUNT(float tCC_AMOUNT) {
		TCC_AMOUNT = tCC_AMOUNT;
	}
	public String getTCC_APPROVED_BY() {
		return TCC_APPROVED_BY;
	}
	public void setTCC_APPROVED_BY(String tCC_APPROVED_BY) {
		TCC_APPROVED_BY = tCC_APPROVED_BY;
	}
	public int getEMP_TCC_UNIQUE_NO() {
		return EMP_TCC_UNIQUE_NO;
	}
	public void setEMP_TCC_UNIQUE_NO(int eMP_TCC_UNIQUE_NO) {
		EMP_TCC_UNIQUE_NO = eMP_TCC_UNIQUE_NO;
	}
	public String getTCC_INACTIVE_DATE() {
		return TCC_INACTIVE_DATE;
	}
	public void setTCC_INACTIVE_DATE(String tCC_INACTIVE_DATE) {
		TCC_INACTIVE_DATE = tCC_INACTIVE_DATE;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
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
	public EMP_TCC_HEADER(String cOMPANY_CODE, String eMP_CODE,
			String eFFECTIVE_DATE, float tCC_AMOUNT, String tCC_APPROVED_BY,
			int eMP_TCC_UNIQUE_NO, String tCC_INACTIVE_DATE,
			String uPDATE_DATE, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		TCC_AMOUNT = tCC_AMOUNT;
		TCC_APPROVED_BY = tCC_APPROVED_BY;
		EMP_TCC_UNIQUE_NO = eMP_TCC_UNIQUE_NO;
		TCC_INACTIVE_DATE = tCC_INACTIVE_DATE;
		UPDATE_DATE = uPDATE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	
}

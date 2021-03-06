package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="hr.tH_emp_accrual_ent")
@IdClass(T_EMP_ACCRUAL_ENT_pk.class)
public class TH_EMP_ACCRUAL_ENT implements Serializable {

	public TH_EMP_ACCRUAL_ENT() {
		// TODO Auto-generated constructor stub
	}
	public TH_EMP_ACCRUAL_ENT(String cOMPANY_CODE, String eMP_CODE,
			String eNTITLED_FROM, String aLLW_CODE, String eNTITLE_AMOUNT_PM,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ENTITLED_FROM = eNTITLED_FROM;
		ALLW_CODE = aLLW_CODE;
		ENTITLE_AMOUNT_PM = eNTITLE_AMOUNT_PM;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	@Id  String COMPANY_CODE="";       
	@Id  String EMP_CODE="";          
	@Id  String ENTITLED_FROM="";             
	@Id  String ALLW_CODE ="";         
	@Column String ENTITLE_AMOUNT_PM="";  
	@Column String CREATION_DATE="";              
	@Column String USER_ID    ="";        
	@Column String MACHINE_ID ="";
	
	
	 
	
	
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
	public String getENTITLED_FROM() {
		return ENTITLED_FROM;
	}
	public void setENTITLED_FROM(String eNTITLED_FROM) {
		ENTITLED_FROM = eNTITLED_FROM;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getENTITLE_AMOUNT_PM() {
		return ENTITLE_AMOUNT_PM;
	}
	public void setENTITLE_AMOUNT_PM(String eNTITLE_AMOUNT_PM) {
		ENTITLE_AMOUNT_PM = eNTITLE_AMOUNT_PM;
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

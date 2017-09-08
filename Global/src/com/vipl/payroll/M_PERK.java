package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="masters.M_PERKS")
@IdClass(M_PERKS_pk.class)

public class M_PERK implements Serializable {

	public M_PERK() {
	
	}

	@Id String COMPANY_CODE ="";  
	@Id String PERK_CODE="";             
	@Column String PERK_DESCRIPTION="";   
	@Column String  PERK_CATEGORY="";       
	@Column String ALLW_CODE="";           
	@Column String ALLW_CODE_TAXPAYM="";   
	@Column  String ALLW_ADVREC_CODE="";    
	@Column  String TAX_FACTOR_PERC="";     
	@Column  String PERK_REIMB_ABOVE="";    
	@Column  String TAXABLE_EARNING_PM="";  
	@Column  String EFFECTIVE_DATE="";             
	@Column  String CONSIDER_FOR_BUDGE="";  
	@Column  String VALID_FROM="";                 
	@Column  String VALID_TO="";                   
	@Column  String FBT_RATE="";           
	@Column  String CREATION_DATE="";              
	@Column  String USER_ID="";            
	@Column  String MACHINE_ID="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getPERK_CODE() {
		return PERK_CODE;
	}
	public void setPERK_CODE(String pERK_CODE) {
		PERK_CODE = pERK_CODE;
	}
	public String getPERK_DESCRIPTION() {
		return PERK_DESCRIPTION;
	}
	public void setPERK_DESCRIPTION(String pERK_DESCRIPTION) {
		PERK_DESCRIPTION = pERK_DESCRIPTION;
	}
	public String getPERK_CATEGORY() {
		return PERK_CATEGORY;
	}
	public void setPERK_CATEGORY(String pERK_CATEGORY) {
		PERK_CATEGORY = pERK_CATEGORY;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getALLW_CODE_TAXPAYM() {
		return ALLW_CODE_TAXPAYM;
	}
	public void setALLW_CODE_TAXPAYM(String aLLW_CODE_TAXPAYM) {
		ALLW_CODE_TAXPAYM = aLLW_CODE_TAXPAYM;
	}
	public String getALLW_ADVREC_CODE() {
		return ALLW_ADVREC_CODE;
	}
	public void setALLW_ADVREC_CODE(String aLLW_ADVREC_CODE) {
		ALLW_ADVREC_CODE = aLLW_ADVREC_CODE;
	}
	public String getTAX_FACTOR_PERC() {
		return TAX_FACTOR_PERC;
	}
	public void setTAX_FACTOR_PERC(String tAX_FACTOR_PERC) {
		TAX_FACTOR_PERC = tAX_FACTOR_PERC;
	}
	public String getPERK_REIMB_ABOVE() {
		return PERK_REIMB_ABOVE;
	}
	public void setPERK_REIMB_ABOVE(String pERK_REIMB_ABOVE) {
		PERK_REIMB_ABOVE = pERK_REIMB_ABOVE;
	}
	public String getTAXABLE_EARNING_PM() {
		return TAXABLE_EARNING_PM;
	}
	public void setTAXABLE_EARNING_PM(String tAXABLE_EARNING_PM) {
		TAXABLE_EARNING_PM = tAXABLE_EARNING_PM;
	}
	public String getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getCONSIDER_FOR_BUDGE() {
		return CONSIDER_FOR_BUDGE;
	}
	public void setCONSIDER_FOR_BUDGE(String cONSIDER_FOR_BUDGE) {
		CONSIDER_FOR_BUDGE = cONSIDER_FOR_BUDGE;
	}
	public String getVALID_FROM() {
		return VALID_FROM;
	}
	public void setVALID_FROM(String vALID_FROM) {
		VALID_FROM = vALID_FROM;
	}
	public String getVALID_TO() {
		return VALID_TO;
	}
	public void setVALID_TO(String vALID_TO) {
		VALID_TO = vALID_TO;
	}
	public String getFBT_RATE() {
		return FBT_RATE;
	}
	public void setFBT_RATE(String fBT_RATE) {
		FBT_RATE = fBT_RATE;
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
	public M_PERK(String cOMPANY_CODE, String pERK_CODE,
			String pERK_DESCRIPTION, String pERK_CATEGORY, String aLLW_CODE,
			String aLLW_CODE_TAXPAYM, String aLLW_ADVREC_CODE,
			String tAX_FACTOR_PERC, String pERK_REIMB_ABOVE,
			String tAXABLE_EARNING_PM, String eFFECTIVE_DATE,
			String cONSIDER_FOR_BUDGE, String vALID_FROM, String vALID_TO,
			String fBT_RATE, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		PERK_CODE = pERK_CODE;
		PERK_DESCRIPTION = pERK_DESCRIPTION;
		PERK_CATEGORY = pERK_CATEGORY;
		ALLW_CODE = aLLW_CODE;
		ALLW_CODE_TAXPAYM = aLLW_CODE_TAXPAYM;
		ALLW_ADVREC_CODE = aLLW_ADVREC_CODE;
		TAX_FACTOR_PERC = tAX_FACTOR_PERC;
		PERK_REIMB_ABOVE = pERK_REIMB_ABOVE;
		TAXABLE_EARNING_PM = tAXABLE_EARNING_PM;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		CONSIDER_FOR_BUDGE = cONSIDER_FOR_BUDGE;
		VALID_FROM = vALID_FROM;
		VALID_TO = vALID_TO;
		FBT_RATE = fBT_RATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}     
	
	
	
	
	

}

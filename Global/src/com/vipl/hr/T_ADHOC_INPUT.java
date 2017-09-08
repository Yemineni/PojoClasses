package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hr.t_adhoc_input")

public class T_ADHOC_INPUT implements Serializable {

	public T_ADHOC_INPUT() {
		// TODO Auto-generated constructor stub
	}
	
	public T_ADHOC_INPUT(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH, String lOT_NUMBER, String sR_NO,
			String aTTEND_MONTH, String aLLW_CODE, String aMOUNT,
			String tAX_DED_FLAG, String cOMMENTS, String rEMARKS,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
		LOT_NUMBER = lOT_NUMBER;
		SR_NO = sR_NO;
		ATTEND_MONTH = aTTEND_MONTH;
		ALLW_CODE = aLLW_CODE;
		AMOUNT = aMOUNT;
		TAX_DED_FLAG = tAX_DED_FLAG;
		COMMENTS = cOMMENTS;
		REMARKS = rEMARKS;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}

	@Id String COMPANY_CODE="";    
	@Column String EMP_CODE="";    
	@Column String SAL_MONTH="";           
	@Column String LOT_NUMBER="";   
	@Column String SR_NO="";        
	@Column String ATTEND_MONTH="";          
	@Column String ALLW_CODE ="";     
	@Column String AMOUNT="";        
	@Column String TAX_DED_FLAG="";    
	@Column String COMMENTS="";      
	@Column String REMARKS="";       
	@Column String CREATION_DATE="";          
	@Column String USER_ID ="";        
	@Column String MACHINE_ID="";
	
	
	
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
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getLOT_NUMBER() {
		return LOT_NUMBER;
	}
	public void setLOT_NUMBER(String lOT_NUMBER) {
		LOT_NUMBER = lOT_NUMBER;
	}
	public String getSR_NO() {
		return SR_NO;
	}
	public void setSR_NO(String sR_NO) {
		SR_NO = sR_NO;
	}
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getTAX_DED_FLAG() {
		return TAX_DED_FLAG;
	}
	public void setTAX_DED_FLAG(String tAX_DED_FLAG) {
		TAX_DED_FLAG = tAX_DED_FLAG;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
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

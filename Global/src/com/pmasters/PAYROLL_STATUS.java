package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="PAYROLL_STATUS")
@IdClass(PAYROLL_STATUS_PK.class)

public class PAYROLL_STATUS implements Serializable {
	@Id
	String COMPANY_CODE="";
	@Id
	String DIV_CODE="";
	@Id
	String 	SUBDIV_CODE="";
	@Id
	String SUPER_CATEGORY_CODE="";
	@Id
	String SAL_MONTH="";
	@Column
	String STATUS_FLAG="";
	@Column
	String CLOSE_DATE="";
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID="";
	@Column
	String PAYSLIP_RELEASE_FLAG="";
	@Column
	String MACHINE_ID="";
	
	public PAYROLL_STATUS(String cOMPANY_CODE, String dIV_CODE,
			String sUBDIV_CODE, String sUPER_CATEGORY_CODE, String sAL_MONTH,
			String sTATUS_FLAG, String cLOSE_DATE, String cREATION_DATE,
			String uSER_ID, String pAYSLIP_RELEASE_FLAG, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		DIV_CODE = dIV_CODE;
		SUBDIV_CODE = sUBDIV_CODE;
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
		SAL_MONTH = sAL_MONTH;
		STATUS_FLAG = sTATUS_FLAG;
		CLOSE_DATE = cLOSE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		PAYSLIP_RELEASE_FLAG = pAYSLIP_RELEASE_FLAG;
		MACHINE_ID = mACHINE_ID;
	}
	public PAYROLL_STATUS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getDIV_CODE() {
		return DIV_CODE;
	}
	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}
	public String getSUBDIV_CODE() {
		return SUBDIV_CODE;
	}
	public void setSUBDIV_CODE(String sUBDIV_CODE) {
		SUBDIV_CODE = sUBDIV_CODE;
	}
	public String getSUPER_CATEGORY_CODE() {
		return SUPER_CATEGORY_CODE;
	}
	public void setSUPER_CATEGORY_CODE(String sUPER_CATEGORY_CODE) {
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
	}
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getSTATUS_FLAG() {
		return STATUS_FLAG;
	}
	public void setSTATUS_FLAG(String sTATUS_FLAG) {
		STATUS_FLAG = sTATUS_FLAG;
	}
	public String getCLOSE_DATE() {
		return CLOSE_DATE;
	}
	public void setCLOSE_DATE(String cLOSE_DATE) {
		CLOSE_DATE = cLOSE_DATE;
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
	public String getPAYSLIP_RELEASE_FLAG() {
		return PAYSLIP_RELEASE_FLAG;
	}
	public void setPAYSLIP_RELEASE_FLAG(String pAYSLIP_RELEASE_FLAG) {
		PAYSLIP_RELEASE_FLAG = pAYSLIP_RELEASE_FLAG;
	}
	public String getMACHINE_ID() {
		return MACHINE_ID;
	}
	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}
	
	
	
	

	

}

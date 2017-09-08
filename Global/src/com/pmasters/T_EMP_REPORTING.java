package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="hrms.T_EMP_REPORTING")
@IdClass(T_EMP_REPORTING_PK.class)
public class T_EMP_REPORTING  implements Serializable {

	public T_EMP_REPORTING() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Id
	Date EFFECTIVE_DATE;
	@Column
	String SUPERVISOR1_EMPCODE="";
	@Column
	String SUPERVISOR2_EMPCODE="";
	@Column
	String APPRAISER1_EMPCODE="";
	@Column
	String APPRAISER2_EMPCODE="";
	@Column
	String APPRAISER3_EMPCODE="";
	@Column
	String REVIEWER1_EMPCODE="";
	@Column
	String REVIEWER2_EMPCODE="";
	@Column
	String LINE_HR_EMPCODE="";
	
	@Temporal(TemporalType.DATE)
	@Column(name = "INACTIVE_DATE", nullable =true) 
	Date  INACTIVE_DATE ;
	@Column
	Date  CREATION_DATE ;
	@Column
	String  USER_ID="";
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
	public Date getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(Date eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getSUPERVISOR1_EMPCODE() {
		return SUPERVISOR1_EMPCODE;
	}
	public void setSUPERVISOR1_EMPCODE(String sUPERVISOR1_EMPCODE) {
		SUPERVISOR1_EMPCODE = sUPERVISOR1_EMPCODE;
	}
	public String getSUPERVISOR2_EMPCODE() {
		return SUPERVISOR2_EMPCODE;
	}
	public void setSUPERVISOR2_EMPCODE(String sUPERVISOR2_EMPCODE) {
		SUPERVISOR2_EMPCODE = sUPERVISOR2_EMPCODE;
	}
	public String getAPPRAISER1_EMPCODE() {
		return APPRAISER1_EMPCODE;
	}
	public void setAPPRAISER1_EMPCODE(String aPPRAISER1_EMPCODE) {
		APPRAISER1_EMPCODE = aPPRAISER1_EMPCODE;
	}
	public String getAPPRAISER2_EMPCODE() {
		return APPRAISER2_EMPCODE;
	}
	public void setAPPRAISER2_EMPCODE(String aPPRAISER2_EMPCODE) {
		APPRAISER2_EMPCODE = aPPRAISER2_EMPCODE;
	}
	public String getAPPRAISER3_EMPCODE() {
		return APPRAISER3_EMPCODE;
	}
	public void setAPPRAISER3_EMPCODE(String aPPRAISER3_EMPCODE) {
		APPRAISER3_EMPCODE = aPPRAISER3_EMPCODE;
	}
	public String getREVIEWER1_EMPCODE() {
		return REVIEWER1_EMPCODE;
	}
	public void setREVIEWER1_EMPCODE(String rEVIEWER1_EMPCODE) {
		REVIEWER1_EMPCODE = rEVIEWER1_EMPCODE;
	}
	public String getREVIEWER2_EMPCODE() {
		return REVIEWER2_EMPCODE;
	}
	public void setREVIEWER2_EMPCODE(String rEVIEWER2_EMPCODE) {
		REVIEWER2_EMPCODE = rEVIEWER2_EMPCODE;
	}
	public String getLINE_HR_EMPCODE() {
		return LINE_HR_EMPCODE;
	}
	public void setLINE_HR_EMPCODE(String lINE_HR_EMPCODE) {
		LINE_HR_EMPCODE = lINE_HR_EMPCODE;
	}
	public Date getINACTIVE_DATE() {
		return INACTIVE_DATE;
	}
	public void setINACTIVE_DATE(Date iNACTIVE_DATE) {
		INACTIVE_DATE = iNACTIVE_DATE;
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
	public T_EMP_REPORTING(String cOMPANY_CODE, String eMP_CODE,
			Date eFFECTIVE_DATE, String sUPERVISOR1_EMPCODE,
			String sUPERVISOR2_EMPCODE, String aPPRAISER1_EMPCODE,
			String aPPRAISER2_EMPCODE, String aPPRAISER3_EMPCODE,
			String rEVIEWER1_EMPCODE, String rEVIEWER2_EMPCODE,
			String lINE_HR_EMPCODE, Date iNACTIVE_DATE, Date cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		SUPERVISOR1_EMPCODE = sUPERVISOR1_EMPCODE;
		SUPERVISOR2_EMPCODE = sUPERVISOR2_EMPCODE;
		APPRAISER1_EMPCODE = aPPRAISER1_EMPCODE;
		APPRAISER2_EMPCODE = aPPRAISER2_EMPCODE;
		APPRAISER3_EMPCODE = aPPRAISER3_EMPCODE;
		REVIEWER1_EMPCODE = rEVIEWER1_EMPCODE;
		REVIEWER2_EMPCODE = rEVIEWER2_EMPCODE;
		LINE_HR_EMPCODE = lINE_HR_EMPCODE;
		INACTIVE_DATE = iNACTIVE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}    
	
	
	
	

}

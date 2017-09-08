package com.vipl.hrms;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hrms.t_rep_structure_input")
public class T_REP_STRUCTURE_INPUT implements Serializable  {

	public T_REP_STRUCTURE_INPUT(){}

				@Id String COMPANY_CODE="";         
				@Id String EMP_CODE="";             
				@Column String SR_NO="";                   
				@Column String  EFFECTIVE_DATE="";               
				@Column String APPRAISER1_EMPCODE ="";  
				@Column String  REVIEWER1_EMPCODE   =""; 
				@Column String  REMARKS        ="";     
				@Column String  CREATION_DATE     ="";           
				@Column String  USER_ID             =""; 
				@Column String  MACHINE_ID ="";
				
				
				
				public T_REP_STRUCTURE_INPUT(String cOMPANY_CODE,
						String eMP_CODE, String sR_NO, String eFFECTIVE_DATE,
						String aPPRAISER1_EMPCODE, String rEVIEWER1_EMPCODE,
						String rEMARKS, String cREATION_DATE, String uSER_ID,
						String mACHINE_ID) {
					super();
					COMPANY_CODE = cOMPANY_CODE;
					EMP_CODE = eMP_CODE;
					SR_NO = sR_NO;
					EFFECTIVE_DATE = eFFECTIVE_DATE;
					APPRAISER1_EMPCODE = aPPRAISER1_EMPCODE;
					REVIEWER1_EMPCODE = rEVIEWER1_EMPCODE;
					REMARKS = rEMARKS;
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
				public String getSR_NO() {
					return SR_NO;
				}
				public void setSR_NO(String sR_NO) {
					SR_NO = sR_NO;
				}
				public String getEFFECTIVE_DATE() {
					return EFFECTIVE_DATE;
				}
				public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
					EFFECTIVE_DATE = eFFECTIVE_DATE;
				}
				public String getAPPRAISER1_EMPCODE() {
					return APPRAISER1_EMPCODE;
				}
				public void setAPPRAISER1_EMPCODE(String aPPRAISER1_EMPCODE) {
					APPRAISER1_EMPCODE = aPPRAISER1_EMPCODE;
				}
				public String getREVIEWER1_EMPCODE() {
					return REVIEWER1_EMPCODE;
				}
				public void setREVIEWER1_EMPCODE(String rEVIEWER1_EMPCODE) {
					REVIEWER1_EMPCODE = rEVIEWER1_EMPCODE;
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

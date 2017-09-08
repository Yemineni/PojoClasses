package com.pmasters;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="hrms.T_EMP_PROM_TRFR")
@IdClass(HR_PROMOTION_TRANSFER_PK.class)
public class HR_PROMOTION_TRANSFER  implements Serializable {

	public HR_PROMOTION_TRANSFER() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE ="";
	@Id
	String SAL_MONTH;
	@Id
	String EMP_CODE="";
	@Column
	String PROM_TRANSFR_TYPE="";
	@Column
	String  EFFECTIVE_DATE;
	@Column
	String ACTUAL_DATE;
	@Column
	String ORDER_DATE;
	@Column
	String PERF_RATING_CODE="";
	@Column
	String PREVIOUS_DIV="";
	@Column
	String PREVIOUS_SUBDIV="";
	@Column
	String PREVIOUS_CATEGORY="";
	@Column
	String PREVIOUS_GRADE="";
	@Column
	String PREVIOUS_DESG="";
	@Column
	String PREVIOUS_POSITION="";
	@Column
	String PREVIOUS_FUNCTION="";
	@Column
	String PREVIOUS_DEPT="";    
	@Column
	String PREVIOUS_SECTION="";
	@Column
	String PREVIOUS_JOBFN="";
	@Column
	String PREVIOUS_CC="";
	@Column
	String PREVIOUS_LOC="";
	@Column
	String PREVIOUS_SUB_LOC="";
	@Column
	String PREVIOUS_STATUS="";
	@Column
	String PREVIOUS_PF_STATUS="";
	@Column
	String CURRENT_DIV="";
	@Column
	String CURRENT_SUBDIV="";
	@Column
	String CURRENT_CATEGORY="";
	@Column
	String CURRENT_GRADE="";
	@Column
	String CURRENT_DESG="";
	@Column
	String CURRENT_POSITION="";
	@Column
	String CURRENT_FUNCTION="";
	@Column
	String CURRENT_DEPT="";
	@Column
	String CURRENT_SECTION="";
	@Column
	String CURRENT_JOBFN="";
	@Column
	String CURRENT_CC="";
	@Column
	String CURRENT_LOC="";
	@Column
	String CURRENT_SUB_LOC="";
	@Column
	String CURRENT_STATUS="";
	@Column
	String CURRENT_PF_STATUS="";
	@Column
	String CAREER_CODE="";
	@Column
	String UPDATE_DATE;
	@Column
	String CREATION_DATE;
	@Column
	String USER_ID="";
	@Column
	String MACHINE_ID="";
	@Column
	String GEN_REMARKS="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getPROM_TRANSFR_TYPE() {
		return PROM_TRANSFR_TYPE;
	}
	public void setPROM_TRANSFR_TYPE(String pROM_TRANSFR_TYPE) {
		PROM_TRANSFR_TYPE = pROM_TRANSFR_TYPE;
	}
	public String getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getACTUAL_DATE() {
		return ACTUAL_DATE;
	}
	public void setACTUAL_DATE(String aCTUAL_DATE) {
		ACTUAL_DATE = aCTUAL_DATE;
	}
	public String getORDER_DATE() {
		return ORDER_DATE;
	}
	public void setORDER_DATE(String oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}
	public String getPERF_RATING_CODE() {
		return PERF_RATING_CODE;
	}
	public void setPERF_RATING_CODE(String pERF_RATING_CODE) {
		PERF_RATING_CODE = pERF_RATING_CODE;
	}
	public String getPREVIOUS_DIV() {
		return PREVIOUS_DIV;
	}
	public void setPREVIOUS_DIV(String pREVIOUS_DIV) {
		PREVIOUS_DIV = pREVIOUS_DIV;
	}
	public String getPREVIOUS_SUBDIV() {
		return PREVIOUS_SUBDIV;
	}
	public void setPREVIOUS_SUBDIV(String pREVIOUS_SUBDIV) {
		PREVIOUS_SUBDIV = pREVIOUS_SUBDIV;
	}
	public String getPREVIOUS_CATEGORY() {
		return PREVIOUS_CATEGORY;
	}
	public void setPREVIOUS_CATEGORY(String pREVIOUS_CATEGORY) {
		PREVIOUS_CATEGORY = pREVIOUS_CATEGORY;
	}
	public String getPREVIOUS_GRADE() {
		return PREVIOUS_GRADE;
	}
	public void setPREVIOUS_GRADE(String pREVIOUS_GRADE) {
		PREVIOUS_GRADE = pREVIOUS_GRADE;
	}
	public String getPREVIOUS_DESG() {
		return PREVIOUS_DESG;
	}
	public void setPREVIOUS_DESG(String pREVIOUS_DESG) {
		PREVIOUS_DESG = pREVIOUS_DESG;
	}
	public String getPREVIOUS_POSITION() {
		return PREVIOUS_POSITION;
	}
	public void setPREVIOUS_POSITION(String pREVIOUS_POSITION) {
		PREVIOUS_POSITION = pREVIOUS_POSITION;
	}
	public String getPREVIOUS_FUNCTION() {
		return PREVIOUS_FUNCTION;
	}
	public void setPREVIOUS_FUNCTION(String pREVIOUS_FUNCTION) {
		PREVIOUS_FUNCTION = pREVIOUS_FUNCTION;
	}
	public String getPREVIOUS_DEPT() {
		return PREVIOUS_DEPT;
	}
	public void setPREVIOUS_DEPT(String pREVIOUS_DEPT) {
		PREVIOUS_DEPT = pREVIOUS_DEPT;
	}
	public String getPREVIOUS_SECTION() {
		return PREVIOUS_SECTION;
	}
	public void setPREVIOUS_SECTION(String pREVIOUS_SECTION) {
		PREVIOUS_SECTION = pREVIOUS_SECTION;
	}
	public String getPREVIOUS_JOBFN() {
		return PREVIOUS_JOBFN;
	}
	public void setPREVIOUS_JOBFN(String pREVIOUS_JOBFN) {
		PREVIOUS_JOBFN = pREVIOUS_JOBFN;
	}
	public String getPREVIOUS_CC() {
		return PREVIOUS_CC;
	}
	public void setPREVIOUS_CC(String pREVIOUS_CC) {
		PREVIOUS_CC = pREVIOUS_CC;
	}
	public String getPREVIOUS_LOC() {
		return PREVIOUS_LOC;
	}
	public void setPREVIOUS_LOC(String pREVIOUS_LOC) {
		PREVIOUS_LOC = pREVIOUS_LOC;
	}
	public String getPREVIOUS_SUB_LOC() {
		return PREVIOUS_SUB_LOC;
	}
	public void setPREVIOUS_SUB_LOC(String pREVIOUS_SUB_LOC) {
		PREVIOUS_SUB_LOC = pREVIOUS_SUB_LOC;
	}
	public String getPREVIOUS_STATUS() {
		return PREVIOUS_STATUS;
	}
	public void setPREVIOUS_STATUS(String pREVIOUS_STATUS) {
		PREVIOUS_STATUS = pREVIOUS_STATUS;
	}
	public String getPREVIOUS_PF_STATUS() {
		return PREVIOUS_PF_STATUS;
	}
	public void setPREVIOUS_PF_STATUS(String pREVIOUS_PF_STATUS) {
		PREVIOUS_PF_STATUS = pREVIOUS_PF_STATUS;
	}
	public String getCURRENT_DIV() {
		return CURRENT_DIV;
	}
	public void setCURRENT_DIV(String cURRENT_DIV) {
		CURRENT_DIV = cURRENT_DIV;
	}
	public String getCURRENT_SUBDIV() {
		return CURRENT_SUBDIV;
	}
	public void setCURRENT_SUBDIV(String cURRENT_SUBDIV) {
		CURRENT_SUBDIV = cURRENT_SUBDIV;
	}
	public String getCURRENT_CATEGORY() {
		return CURRENT_CATEGORY;
	}
	public void setCURRENT_CATEGORY(String cURRENT_CATEGORY) {
		CURRENT_CATEGORY = cURRENT_CATEGORY;
	}
	public String getCURRENT_GRADE() {
		return CURRENT_GRADE;
	}
	public void setCURRENT_GRADE(String cURRENT_GRADE) {
		CURRENT_GRADE = cURRENT_GRADE;
	}
	public String getCURRENT_DESG() {
		return CURRENT_DESG;
	}
	public void setCURRENT_DESG(String cURRENT_DESG) {
		CURRENT_DESG = cURRENT_DESG;
	}
	public String getCURRENT_POSITION() {
		return CURRENT_POSITION;
	}
	public void setCURRENT_POSITION(String cURRENT_POSITION) {
		CURRENT_POSITION = cURRENT_POSITION;
	}
	public String getCURRENT_FUNCTION() {
		return CURRENT_FUNCTION;
	}
	public void setCURRENT_FUNCTION(String cURRENT_FUNCTION) {
		CURRENT_FUNCTION = cURRENT_FUNCTION;
	}
	public String getCURRENT_DEPT() {
		return CURRENT_DEPT;
	}
	public void setCURRENT_DEPT(String cURRENT_DEPT) {
		CURRENT_DEPT = cURRENT_DEPT;
	}
	public String getCURRENT_SECTION() {
		return CURRENT_SECTION;
	}
	public void setCURRENT_SECTION(String cURRENT_SECTION) {
		CURRENT_SECTION = cURRENT_SECTION;
	}
	public String getCURRENT_JOBFN() {
		return CURRENT_JOBFN;
	}
	public void setCURRENT_JOBFN(String cURRENT_JOBFN) {
		CURRENT_JOBFN = cURRENT_JOBFN;
	}
	public String getCURRENT_CC() {
		return CURRENT_CC;
	}
	public void setCURRENT_CC(String cURRENT_CC) {
		CURRENT_CC = cURRENT_CC;
	}
	public String getCURRENT_LOC() {
		return CURRENT_LOC;
	}
	public void setCURRENT_LOC(String cURRENT_LOC) {
		CURRENT_LOC = cURRENT_LOC;
	}
	public String getCURRENT_SUB_LOC() {
		return CURRENT_SUB_LOC;
	}
	public void setCURRENT_SUB_LOC(String cURRENT_SUB_LOC) {
		CURRENT_SUB_LOC = cURRENT_SUB_LOC;
	}
	public String getCURRENT_STATUS() {
		return CURRENT_STATUS;
	}
	public void setCURRENT_STATUS(String cURRENT_STATUS) {
		CURRENT_STATUS = cURRENT_STATUS;
	}
	public String getCURRENT_PF_STATUS() {
		return CURRENT_PF_STATUS;
	}
	public void setCURRENT_PF_STATUS(String cURRENT_PF_STATUS) {
		CURRENT_PF_STATUS = cURRENT_PF_STATUS;
	}
	public String getCAREER_CODE() {
		return CAREER_CODE;
	}
	public void setCAREER_CODE(String cAREER_CODE) {
		CAREER_CODE = cAREER_CODE;
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
	public String getGEN_REMARKS() {
		return GEN_REMARKS;
	}
	public void setGEN_REMARKS(String gEN_REMARKS) {
		GEN_REMARKS = gEN_REMARKS;
	}
	public HR_PROMOTION_TRANSFER(String cOMPANY_CODE, String sAL_MONTH,
			String eMP_CODE, String pROM_TRANSFR_TYPE, String eFFECTIVE_DATE,
			String aCTUAL_DATE, String oRDER_DATE, String pERF_RATING_CODE,
			String pREVIOUS_DIV, String pREVIOUS_SUBDIV,
			String pREVIOUS_CATEGORY, String pREVIOUS_GRADE,
			String pREVIOUS_DESG, String pREVIOUS_POSITION,
			String pREVIOUS_FUNCTION, String pREVIOUS_DEPT,
			String pREVIOUS_SECTION, String pREVIOUS_JOBFN, String pREVIOUS_CC,
			String pREVIOUS_LOC, String pREVIOUS_SUB_LOC,
			String pREVIOUS_STATUS, String pREVIOUS_PF_STATUS,
			String cURRENT_DIV, String cURRENT_SUBDIV, String cURRENT_CATEGORY,
			String cURRENT_GRADE, String cURRENT_DESG, String cURRENT_POSITION,
			String cURRENT_FUNCTION, String cURRENT_DEPT,
			String cURRENT_SECTION, String cURRENT_JOBFN, String cURRENT_CC,
			String cURRENT_LOC, String cURRENT_SUB_LOC, String cURRENT_STATUS,
			String cURRENT_PF_STATUS, String cAREER_CODE, String uPDATE_DATE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID,
			String gEN_REMARKS) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		SAL_MONTH = sAL_MONTH;
		EMP_CODE = eMP_CODE;
		PROM_TRANSFR_TYPE = pROM_TRANSFR_TYPE;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		ACTUAL_DATE = aCTUAL_DATE;
		ORDER_DATE = oRDER_DATE;
		PERF_RATING_CODE = pERF_RATING_CODE;
		PREVIOUS_DIV = pREVIOUS_DIV;
		PREVIOUS_SUBDIV = pREVIOUS_SUBDIV;
		PREVIOUS_CATEGORY = pREVIOUS_CATEGORY;
		PREVIOUS_GRADE = pREVIOUS_GRADE;
		PREVIOUS_DESG = pREVIOUS_DESG;
		PREVIOUS_POSITION = pREVIOUS_POSITION;
		PREVIOUS_FUNCTION = pREVIOUS_FUNCTION;
		PREVIOUS_DEPT = pREVIOUS_DEPT;
		PREVIOUS_SECTION = pREVIOUS_SECTION;
		PREVIOUS_JOBFN = pREVIOUS_JOBFN;
		PREVIOUS_CC = pREVIOUS_CC;
		PREVIOUS_LOC = pREVIOUS_LOC;
		PREVIOUS_SUB_LOC = pREVIOUS_SUB_LOC;
		PREVIOUS_STATUS = pREVIOUS_STATUS;
		PREVIOUS_PF_STATUS = pREVIOUS_PF_STATUS;
		CURRENT_DIV = cURRENT_DIV;
		CURRENT_SUBDIV = cURRENT_SUBDIV;
		CURRENT_CATEGORY = cURRENT_CATEGORY;
		CURRENT_GRADE = cURRENT_GRADE;
		CURRENT_DESG = cURRENT_DESG;
		CURRENT_POSITION = cURRENT_POSITION;
		CURRENT_FUNCTION = cURRENT_FUNCTION;
		CURRENT_DEPT = cURRENT_DEPT;
		CURRENT_SECTION = cURRENT_SECTION;
		CURRENT_JOBFN = cURRENT_JOBFN;
		CURRENT_CC = cURRENT_CC;
		CURRENT_LOC = cURRENT_LOC;
		CURRENT_SUB_LOC = cURRENT_SUB_LOC;
		CURRENT_STATUS = cURRENT_STATUS;
		CURRENT_PF_STATUS = cURRENT_PF_STATUS;
		CAREER_CODE = cAREER_CODE;
		UPDATE_DATE = uPDATE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
		GEN_REMARKS = gEN_REMARKS;
	}
	
	

}

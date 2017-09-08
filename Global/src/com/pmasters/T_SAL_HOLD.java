package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="HR.T_SAL_HOLD")
@IdClass(T_SAL_HOLD_PK.class)

public class T_SAL_HOLD  implements Serializable{
	
	@Id
	String COMPANY_CODE="";
	@Id
	String EMP_CODE="";
	@Id
	  String ATTEND_MONTH;
	@Column
	String  SAL_HOLD_TYPE;
	@Column
	 String SAL_HOLD_APPROVED_BY;
	@Column
	String SAL_HOLD_REASON;
	@Column
	String HOLD_REALSE_MONTH;
	@Column
	String HOLD_REALSE_APPROVED_BY;
	@Column
	String HOLD_REALSE_REASON;
	@Column
	 String HOLD_UPDATE_DATE ;
	@Column
    String RELEASE_UPDATE_DATE;
	@Column
	String  CREATION_DATE ;
	@Column
	String USER_ID  ;
	@Column
    String 	MACHINE_ID;
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
	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}
	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}
	public String getSAL_HOLD_TYPE() {
		return SAL_HOLD_TYPE;
	}
	public void setSAL_HOLD_TYPE(String sAL_HOLD_TYPE) {
		SAL_HOLD_TYPE = sAL_HOLD_TYPE;
	}
	public String getSAL_HOLD_APPROVED_BY() {
		return SAL_HOLD_APPROVED_BY;
	}
	public void setSAL_HOLD_APPROVED_BY(String sAL_HOLD_APPROVED_BY) {
		SAL_HOLD_APPROVED_BY = sAL_HOLD_APPROVED_BY;
	}
	public String getSAL_HOLD_REASON() {
		return SAL_HOLD_REASON;
	}
	public void setSAL_HOLD_REASON(String sAL_HOLD_REASON) {
		SAL_HOLD_REASON = sAL_HOLD_REASON;
	}
	public String getHOLD_REALSE_MONTH() {
		return HOLD_REALSE_MONTH;
	}
	public void setHOLD_REALSE_MONTH(String hOLD_REALSE_MONTH) {
		HOLD_REALSE_MONTH = hOLD_REALSE_MONTH;
	}
	public String getHOLD_REALSE_APPROVED_BY() {
		return HOLD_REALSE_APPROVED_BY;
	}
	public void setHOLD_REALSE_APPROVED_BY(String hOLD_REALSE_APPROVED_BY) {
		HOLD_REALSE_APPROVED_BY = hOLD_REALSE_APPROVED_BY;
	}
	public String getHOLD_REALSE_REASON() {
		return HOLD_REALSE_REASON;
	}
	public void setHOLD_REALSE_REASON(String hOLD_REALSE_REASON) {
		HOLD_REALSE_REASON = hOLD_REALSE_REASON;
	}
	public String getHOLD_UPDATE_DATE() {
		return HOLD_UPDATE_DATE;
	}
	public void setHOLD_UPDATE_DATE(String hOLD_UPDATE_DATE) {
		HOLD_UPDATE_DATE = hOLD_UPDATE_DATE;
	}
	public String getRELEASE_UPDATE_DATE() {
		return RELEASE_UPDATE_DATE;
	}
	public void setRELEASE_UPDATE_DATE(String rELEASE_UPDATE_DATE) {
		RELEASE_UPDATE_DATE = rELEASE_UPDATE_DATE;
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
	public T_SAL_HOLD(String cOMPANY_CODE, String eMP_CODE,
			String aTTEND_MONTH, String sAL_HOLD_TYPE,
			String sAL_HOLD_APPROVED_BY, String sAL_HOLD_REASON,
			String hOLD_REALSE_MONTH, String hOLD_REALSE_APPROVED_BY,
			String hOLD_REALSE_REASON, String hOLD_UPDATE_DATE,
			String rELEASE_UPDATE_DATE, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		ATTEND_MONTH = aTTEND_MONTH;
		SAL_HOLD_TYPE = sAL_HOLD_TYPE;
		SAL_HOLD_APPROVED_BY = sAL_HOLD_APPROVED_BY;
		SAL_HOLD_REASON = sAL_HOLD_REASON;
		HOLD_REALSE_MONTH = hOLD_REALSE_MONTH;
		HOLD_REALSE_APPROVED_BY = hOLD_REALSE_APPROVED_BY;
		HOLD_REALSE_REASON = hOLD_REALSE_REASON;
		HOLD_UPDATE_DATE = hOLD_UPDATE_DATE;
		RELEASE_UPDATE_DATE = rELEASE_UPDATE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	public T_SAL_HOLD() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
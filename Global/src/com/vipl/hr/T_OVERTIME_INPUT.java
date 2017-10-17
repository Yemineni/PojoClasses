/**
 * 
 */
package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dev002
 *
 */
@Entity
@Table(name="hr.T_OVERTIME_INPUT")
public class T_OVERTIME_INPUT implements Serializable {

	/**
	 * 
	 */
	public T_OVERTIME_INPUT() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE="";     
	@Column String SR_NO="";    
	@Column String EMP_CODE="";  
	@Column String SAL_MONTH ="";         
	@Column String ATTEND_MONTH="";           
	@Column String  OVERTIME_UNIT="";    
	@Column float OVERTIME_COUNT =0.0f ;  
    @Column float  	OVERTIME_AMOUNT  =0.0f;   
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}

	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}

	public String getSR_NO() {
		return SR_NO;
	}

	public void setSR_NO(String sR_NO) {
		SR_NO = sR_NO;
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

	public String getATTEND_MONTH() {
		return ATTEND_MONTH;
	}

	public void setATTEND_MONTH(String aTTEND_MONTH) {
		ATTEND_MONTH = aTTEND_MONTH;
	}

	public String getOVERTIME_UNIT() {
		return OVERTIME_UNIT;
	}

	public void setOVERTIME_UNIT(String oVERTIME_UNIT) {
		OVERTIME_UNIT = oVERTIME_UNIT;
	}

	public float getOVERTIME_COUNT() {
		return OVERTIME_COUNT;
	}

	public void setOVERTIME_COUNT(float oVERTIME_COUNT) {
		OVERTIME_COUNT = oVERTIME_COUNT;
	}

	public float getOVERTIME_AMOUNT() {
		return OVERTIME_AMOUNT;
	}

	public void setOVERTIME_AMOUNT(float oVERTIME_AMOUNT) {
		OVERTIME_AMOUNT = oVERTIME_AMOUNT;
	}

	public String getCREATION_DATE() {
		return CREATION_DATE;
	}

	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
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

	@Column String CREATION_DATE   ="";         
	@Column String REMARKS      ="";   
	@Column String USER_ID        ="";  
		@Column String MACHINE_ID="";
	
	

}

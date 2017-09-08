package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="hr.EMP_TCC_DETAIL")
@IdClass(EMP_TCC_DETAIL_pk.class)

public class EMP_TCC_DETAIL implements Serializable {

	public EMP_TCC_DETAIL() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE="";  
	@Id int EMP_TCC_UNIQUE_NO=0;     
	@Id String ALLW_CODE="";          
	@Column float ALLW_YEARLY_ENT=0.0f;          
	@Column String  UPDATE_DATE ="";         
	@Column String CREATION_DATE="";         
	@Column String USER_ID="";                
	@Column String MACHINE_ID="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public int getEMP_TCC_UNIQUE_NO() {
		return EMP_TCC_UNIQUE_NO;
	}
	public void setEMP_TCC_UNIQUE_NO(int eMP_TCC_UNIQUE_NO) {
		EMP_TCC_UNIQUE_NO = eMP_TCC_UNIQUE_NO;
	}
	public String getALLW_CODE() {
		return ALLW_CODE;
	}
	public void setALLW_CODE(String aLLW_CODE) {
		ALLW_CODE = aLLW_CODE;
	}
	public float getALLW_YEARLY_ENT() {
		return ALLW_YEARLY_ENT;
	}
	public void setALLW_YEARLY_ENT(float aLLW_YEARLY_ENT) {
		ALLW_YEARLY_ENT = aLLW_YEARLY_ENT;
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
	public EMP_TCC_DETAIL(String cOMPANY_CODE, int eMP_TCC_UNIQUE_NO,
			String aLLW_CODE, float aLLW_YEARLY_ENT, String uPDATE_DATE,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_TCC_UNIQUE_NO = eMP_TCC_UNIQUE_NO;
		ALLW_CODE = aLLW_CODE;
		ALLW_YEARLY_ENT = aLLW_YEARLY_ENT;
		UPDATE_DATE = uPDATE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	

}

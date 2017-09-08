package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

public class EMP_TCC_DETAIL_pk implements Serializable {

	public EMP_TCC_DETAIL_pk() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE="";  
	@Id int EMP_TCC_UNIQUE_NO=0;     
	@Id String ALLW_CODE="";
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
	public EMP_TCC_DETAIL_pk(String cOMPANY_CODE, int eMP_TCC_UNIQUE_NO,
			String aLLW_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_TCC_UNIQUE_NO = eMP_TCC_UNIQUE_NO;
		ALLW_CODE = aLLW_CODE;
	}         
}

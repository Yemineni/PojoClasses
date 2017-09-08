package com.visisht;

public class M_LANGUAGE {
	String COMPANY_CODE="", LANG_CODE="", LANG_DESCR="",CREATION_DATE="", USER_ID="", MACHINE_ID="";

	public M_LANGUAGE() {
		// TODO Auto-generated constructor stub
	}

	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}

	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}

	public String getLANG_CODE() {
		return LANG_CODE;
	}

	public void setLANG_CODE(String lANG_CODE) {
		LANG_CODE = lANG_CODE;
	}

	public String getLANG_DESCR() {
		return LANG_DESCR;
	}

	public void setLANG_DESCR(String lANG_DESCR) {
		LANG_DESCR = lANG_DESCR;
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

	public M_LANGUAGE(String cOMPANY_CODE, String lANG_CODE, String lANG_DESCR,
			String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		LANG_CODE = lANG_CODE;
		LANG_DESCR = lANG_DESCR;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	

}

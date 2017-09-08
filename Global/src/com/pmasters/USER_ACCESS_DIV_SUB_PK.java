package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class USER_ACCESS_DIV_SUB_PK implements Serializable {
	
	public USER_ACCESS_DIV_SUB_PK(String cOMPANY_CODE, String uSER_ID,
			String dIV_CODE, String sUBDIV_CODE, String sUPER_CATEGORY_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		USER_ID = uSER_ID;
		DIV_CODE = dIV_CODE;
		SUBDIV_CODE = sUBDIV_CODE;
		SUPER_CATEGORY_CODE = sUPER_CATEGORY_CODE;
	}
	public USER_ACCESS_DIV_SUB_PK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE  ="";
	@Id
	String USER_ID             =""; 
	@Id
	String DIV_CODE            ="";
	@Id
	String SUBDIV_CODE         ="";
	@Id
	String SUPER_CATEGORY_CODE ="";
	

}

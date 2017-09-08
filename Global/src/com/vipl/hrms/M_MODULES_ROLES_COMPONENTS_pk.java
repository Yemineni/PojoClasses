package com.vipl.hrms;

import java.io.Serializable;

import javax.persistence.Id;

public class M_MODULES_ROLES_COMPONENTS_pk implements Serializable {

	public M_MODULES_ROLES_COMPONENTS_pk() {
		// TODO Auto-generated constructor stub
	}

	@Id String	COMPANY_CODE="";    
	@Id String	MODULE_CODE ="";   
	@Id String MODULE_ROLE_CODE=""; 
	@Id String	COMPONENT_CODE="";
	public M_MODULES_ROLES_COMPONENTS_pk(String cOMPANY_CODE,
			String mODULE_CODE, String mODULE_ROLE_CODE, String cOMPONENT_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		MODULE_CODE = mODULE_CODE;
		MODULE_ROLE_CODE = mODULE_ROLE_CODE;
		COMPONENT_CODE = cOMPONENT_CODE;
	}  
	
	
	
	
}

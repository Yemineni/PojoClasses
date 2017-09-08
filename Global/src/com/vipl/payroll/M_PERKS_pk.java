package com.vipl.payroll;

import java.io.Serializable;

import javax.persistence.Id;

public class M_PERKS_pk implements Serializable {

	public M_PERKS_pk() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String COMPANY_CODE ="";  
	@Id String PERK_CODE="";
	public M_PERKS_pk(String cOMPANY_CODE, String pERK_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		PERK_CODE = pERK_CODE;
	}        
	
	

}

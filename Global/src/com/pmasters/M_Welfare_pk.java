package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_Welfare_pk  implements Serializable{
	@Id
	String COMPANY_CODE ="";
	@Id
	String 	WELFARE_CODE="";
	public M_Welfare_pk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public M_Welfare_pk(String cOMPANY_CODE, String wELFARE_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		WELFARE_CODE = wELFARE_CODE;
	}

	
	

}

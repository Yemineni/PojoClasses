package com.pmasters;

import java.io.Serializable;

public class Talent_pk implements Serializable {

	public Talent_pk() {
		// TODO Auto-generated constructor stub
	}
	
	String COMPANY_CODE="";
	public Talent_pk(String cOMPANY_CODE, String tALENT_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		TALENT_CODE = tALENT_CODE;
	}

	String TALENT_CODE="";

}

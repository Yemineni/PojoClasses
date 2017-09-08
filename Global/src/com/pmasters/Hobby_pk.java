package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class Hobby_pk implements Serializable {
	@Id
	String COMPANY_CODE="";
	@Id
	String HOBBY_CODE="";
	
	

	public Hobby_pk(String cOMPANY_CODE, String hOBBY_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		HOBBY_CODE = hOBBY_CODE;
	}



	public Hobby_pk() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}

package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_REGION_pk implements Serializable {

	public M_REGION_pk() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String COMPANY_CODE="";
		@Id
	String REGION_CODE="";
		public M_REGION_pk(String cOMPANY_CODE, String rEGION_CODE) {
			super();
			COMPANY_CODE = cOMPANY_CODE;
			REGION_CODE = rEGION_CODE;
		}
		
		

}

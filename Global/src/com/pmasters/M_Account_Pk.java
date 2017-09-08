package com.pmasters;

import java.io.Serializable;

import javax.persistence.Id;

public class M_Account_Pk  implements Serializable
{

	public M_Account_Pk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	String 	COMPANY_CODE="";
		@Id
	String	ACCOUNT_CODE="";
		public M_Account_Pk(String cOMPANY_CODE, String aCCOUNT_CODE) {
			super();
			COMPANY_CODE = cOMPANY_CODE;
			ACCOUNT_CODE = aCCOUNT_CODE;
		}	

}

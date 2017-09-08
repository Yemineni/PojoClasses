package com.pmasters;

import java.io.Serializable;

public class Relation_Pk implements Serializable {
	String COMPANY_CODE="";
	String RELATION_CODE="";

	
	public Relation_Pk(String cOMPANY_CODE, String rELATION_CODE) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		RELATION_CODE = rELATION_CODE;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((COMPANY_CODE == null) ? 0 : COMPANY_CODE.hashCode());
		result = prime * result
				+ ((RELATION_CODE == null) ? 0 : RELATION_CODE.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relation_Pk other = (Relation_Pk) obj;
		if (COMPANY_CODE == null) {
			if (other.COMPANY_CODE != null)
				return false;
		} else if (!COMPANY_CODE.equals(other.COMPANY_CODE))
			return false;
		if (RELATION_CODE == null) {
			if (other.RELATION_CODE != null)
				return false;
		} else if (!RELATION_CODE.equals(other.RELATION_CODE))
			return false;
		return true;
	}



	public Relation_Pk() {
		// TODO Auto-generated constructor stub
	}
	
	

}

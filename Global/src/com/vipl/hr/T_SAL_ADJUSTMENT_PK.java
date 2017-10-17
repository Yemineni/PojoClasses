/**
 * 
 */
package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * @author dev002
 *
 */
public class T_SAL_ADJUSTMENT_PK implements Serializable {

	/**
	 * 
	 */
	public T_SAL_ADJUSTMENT_PK() {
		// TODO Auto-generated constructor stub
	}

	@Id String COMPANY_CODE="";   
	@Id String EMP_CODE=""; 
	@Id String SAL_MONTH="";           
	@Id String ATTEND_MONTH="";
	public T_SAL_ADJUSTMENT_PK(String cOMPANY_CODE, String eMP_CODE,
			String sAL_MONTH, String aTTEND_MONTH) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
		ATTEND_MONTH = aTTEND_MONTH;
	}         
	
	
}

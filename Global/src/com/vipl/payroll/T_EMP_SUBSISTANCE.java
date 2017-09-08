package com.vipl.payroll;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="HR.T_EMP_SUBSISTENCE")
@IdClass( T_EMP_SUBSISTANCE_PK.class)
public class T_EMP_SUBSISTANCE  implements Serializable {
	public T_EMP_SUBSISTANCE() {
		// TODO Auto-generated constructor stub
	}
	@Id
	String  COMPANY_CODE="";
	@Id
	String EMP_CODE ="";
	@Id
	String 	PERIOD_FROM="";
	@Column
	String PERIOD_TO ="";
	@Column
	String SUBSISTENCE_REMARKS="";
	@Column
	String INACTIVE_DATE="";
	@Column
	String CREATION_DATE="";
	@Column
	String USER_ID  ="";
	@Column
	String MACHINE_ID="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getPERIOD_FROM() {
		return PERIOD_FROM;
	}
	public void setPERIOD_FROM(String pERIOD_FROM) {
		PERIOD_FROM = pERIOD_FROM;
	}
	public String getPERIOD_TO() {
		return PERIOD_TO;
	}
	public void setPERIOD_TO(String pERIOD_TO) {
		PERIOD_TO = pERIOD_TO;
	}
	public String getSUBSISTENCE_REMARKS() {
		return SUBSISTENCE_REMARKS;
	}
	public void setSUBSISTENCE_REMARKS(String sUBSISTENCE_REMARKS) {
		SUBSISTENCE_REMARKS = sUBSISTENCE_REMARKS;
	}
	public String getINACTIVE_DATE() {
		return INACTIVE_DATE;
	}
	public void setINACTIVE_DATE(String iNACTIVE_DATE) {
		INACTIVE_DATE = iNACTIVE_DATE;
	}
	public String getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(String cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	
	
	
	
	
	
	public String getMACHINE_ID() {
		return MACHINE_ID;
	}
	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}
	public T_EMP_SUBSISTANCE(String cOMPANY_CODE, String eMP_CODE,
			String pERIOD_FROM, String pERIOD_TO, String sUBSISTENCE_REMARKS,
			String iNACTIVE_DATE, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		PERIOD_FROM = pERIOD_FROM;
		PERIOD_TO = pERIOD_TO;
		SUBSISTENCE_REMARKS = sUBSISTENCE_REMARKS;
		INACTIVE_DATE = iNACTIVE_DATE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
	
	
	

}

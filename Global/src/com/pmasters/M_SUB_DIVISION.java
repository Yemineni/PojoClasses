package com.pmasters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="M_SUB_DIVISION")
@IdClass(M_SUB_Division_Pk.class)
public class M_SUB_DIVISION implements Serializable {
	
	public M_SUB_DIVISION() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String COMPANY_CODE="";
	@Id
	private String DIV_CODE="";
	@Id
	private String SUBDIV_CODE="";
	@Column
	private String SUBDIV_DESCR="";     
	@Column
	private String SUBDIV_INCEPTION_DATE="";                       
	@Column
	private String SUBDIV_ADDRESS1                    ="";                       
	@Column
	private String SUBDIV_ADDRESS2                    ="";                       
	@Column
	private String SUBDIV_ADDRESS3                    ="";                       
	@Column
	private String SUBDIV_PINCODE                     ="";                       
	@Column
	private String SUBDIV_TELNOS                      ="";                       
	@Column
	private String SUBDIV_FAXNOS                      ="";                       
	@Column
	private String SUBDIV_EMAIL                       ="";                       
	@Column
	private String PAN                                ="";                       
	@Column
	private String PAN_ALLOTMENT_DATE                 ="";                       
	@Column
	private String TAN                                ="";                       
	@Column
	private String TAN_ALLOTMENT_DATE                 ="";                       
	@Column
	private String ACCOUNTING_YEAR_FROM               ="";                       
	@Column
	private String ACCOUNTING_YEAR_TO                 ="";                       
	@Column
	private String PF_TRUST_IND                       ="";                       
	@Column
	private String PF_ACCOUNT_NO                      ="";                       
	@Column
	private String PF_ACCOUNT_COVERAGE_DATE           ="";                       
	@Column
	private String ESI_ACCOUNT_NO                     ="";                       
	@Column
	private String ESI_ACCOUNT_COVERAGE_DATE          ="";                       
	@Column
	private String FACTORY_LICENCE_NO                 ="";                       
	@Column
	private String LICENCE_COVERAGE_DATE              ="";                       
	@Column
	private String TDS_CIRCLE                         ="";                       
	@Column
	private String CREATION_DATE                      ="";                       
	@Column
	private String USER_ID                            ="";                       
	@Column
	private String MACHINE_ID                         ="";                       
	@Column
	private String TDS_CIRCLE_ADD1                    ="";                       
	@Column
	private String TDS_CIRCLE_ADD2                    ="";                       
	@Column
	private String TDS_CIRCLE_CITY                    ="";    
	
	@Column
	private String TDS_CIRCLE_PINCODE                                     ="";                       
	@Column
	private String UNIT_HR_EMP_CODE                                       ="";                       
	@Column
	private String SUBDIV_EDLI_EXEMPT_FLAG                     ="";
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getDIV_CODE() {
		return DIV_CODE;
	}
	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}
	public String getSUBDIV_CODE() {
		return SUBDIV_CODE;
	}
	public void setSUBDIV_CODE(String sUBDIV_CODE) {
		SUBDIV_CODE = sUBDIV_CODE;
	}
	public String getSUBDIV_DESCR() {
		return SUBDIV_DESCR;
	}
	public void setSUBDIV_DESCR(String sUBDIV_DESCR) {
		SUBDIV_DESCR = sUBDIV_DESCR;
	}
	public String getSUBDIV_INCEPTION_DATE() {
		return SUBDIV_INCEPTION_DATE;
	}
	public void setSUBDIV_INCEPTION_DATE(String sUBDIV_INCEPTION_DATE) {
		SUBDIV_INCEPTION_DATE = sUBDIV_INCEPTION_DATE;
	}
	public String getSUBDIV_ADDRESS1() {
		return SUBDIV_ADDRESS1;
	}
	public void setSUBDIV_ADDRESS1(String sUBDIV_ADDRESS1) {
		SUBDIV_ADDRESS1 = sUBDIV_ADDRESS1;
	}
	public String getSUBDIV_ADDRESS2() {
		return SUBDIV_ADDRESS2;
	}
	public void setSUBDIV_ADDRESS2(String sUBDIV_ADDRESS2) {
		SUBDIV_ADDRESS2 = sUBDIV_ADDRESS2;
	}
	public String getSUBDIV_ADDRESS3() {
		return SUBDIV_ADDRESS3;
	}
	public void setSUBDIV_ADDRESS3(String sUBDIV_ADDRESS3) {
		SUBDIV_ADDRESS3 = sUBDIV_ADDRESS3;
	}
	public String getSUBDIV_PINCODE() {
		return SUBDIV_PINCODE;
	}
	public void setSUBDIV_PINCODE(String sUBDIV_PINCODE) {
		SUBDIV_PINCODE = sUBDIV_PINCODE;
	}
	public String getSUBDIV_TELNOS() {
		return SUBDIV_TELNOS;
	}
	public void setSUBDIV_TELNOS(String sUBDIV_TELNOS) {
		SUBDIV_TELNOS = sUBDIV_TELNOS;
	}
	public String getSUBDIV_FAXNOS() {
		return SUBDIV_FAXNOS;
	}
	public void setSUBDIV_FAXNOS(String sUBDIV_FAXNOS) {
		SUBDIV_FAXNOS = sUBDIV_FAXNOS;
	}
	public String getSUBDIV_EMAIL() {
		return SUBDIV_EMAIL;
	}
	public void setSUBDIV_EMAIL(String sUBDIV_EMAIL) {
		SUBDIV_EMAIL = sUBDIV_EMAIL;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getPAN_ALLOTMENT_DATE() {
		return PAN_ALLOTMENT_DATE;
	}
	public void setPAN_ALLOTMENT_DATE(String pAN_ALLOTMENT_DATE) {
		PAN_ALLOTMENT_DATE = pAN_ALLOTMENT_DATE;
	}
	public String getTAN() {
		return TAN;
	}
	public void setTAN(String tAN) {
		TAN = tAN;
	}
	public String getTAN_ALLOTMENT_DATE() {
		return TAN_ALLOTMENT_DATE;
	}
	public void setTAN_ALLOTMENT_DATE(String tAN_ALLOTMENT_DATE) {
		TAN_ALLOTMENT_DATE = tAN_ALLOTMENT_DATE;
	}
	public String getACCOUNTING_YEAR_FROM() {
		return ACCOUNTING_YEAR_FROM;
	}
	public void setACCOUNTING_YEAR_FROM(String aCCOUNTING_YEAR_FROM) {
		ACCOUNTING_YEAR_FROM = aCCOUNTING_YEAR_FROM;
	}
	public String getACCOUNTING_YEAR_TO() {
		return ACCOUNTING_YEAR_TO;
	}
	public void setACCOUNTING_YEAR_TO(String aCCOUNTING_YEAR_TO) {
		ACCOUNTING_YEAR_TO = aCCOUNTING_YEAR_TO;
	}
	public String getPF_TRUST_IND() {
		return PF_TRUST_IND;
	}
	public void setPF_TRUST_IND(String pF_TRUST_IND) {
		PF_TRUST_IND = pF_TRUST_IND;
	}
	public String getPF_ACCOUNT_NO() {
		return PF_ACCOUNT_NO;
	}
	public void setPF_ACCOUNT_NO(String pF_ACCOUNT_NO) {
		PF_ACCOUNT_NO = pF_ACCOUNT_NO;
	}
	public String getPF_ACCOUNT_COVERAGE_DATE() {
		return PF_ACCOUNT_COVERAGE_DATE;
	}
	public void setPF_ACCOUNT_COVERAGE_DATE(String pF_ACCOUNT_COVERAGE_DATE) {
		PF_ACCOUNT_COVERAGE_DATE = pF_ACCOUNT_COVERAGE_DATE;
	}
	public String getESI_ACCOUNT_NO() {
		return ESI_ACCOUNT_NO;
	}
	public void setESI_ACCOUNT_NO(String eSI_ACCOUNT_NO) {
		ESI_ACCOUNT_NO = eSI_ACCOUNT_NO;
	}
	public String getESI_ACCOUNT_COVERAGE_DATE() {
		return ESI_ACCOUNT_COVERAGE_DATE;
	}
	public void setESI_ACCOUNT_COVERAGE_DATE(String eSI_ACCOUNT_COVERAGE_DATE) {
		ESI_ACCOUNT_COVERAGE_DATE = eSI_ACCOUNT_COVERAGE_DATE;
	}
	public String getFACTORY_LICENCE_NO() {
		return FACTORY_LICENCE_NO;
	}
	public void setFACTORY_LICENCE_NO(String fACTORY_LICENCE_NO) {
		FACTORY_LICENCE_NO = fACTORY_LICENCE_NO;
	}
	public String getLICENCE_COVERAGE_DATE() {
		return LICENCE_COVERAGE_DATE;
	}
	public void setLICENCE_COVERAGE_DATE(String lICENCE_COVERAGE_DATE) {
		LICENCE_COVERAGE_DATE = lICENCE_COVERAGE_DATE;
	}
	public String getTDS_CIRCLE() {
		return TDS_CIRCLE;
	}
	public void setTDS_CIRCLE(String tDS_CIRCLE) {
		TDS_CIRCLE = tDS_CIRCLE;
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
	public String getTDS_CIRCLE_ADD1() {
		return TDS_CIRCLE_ADD1;
	}
	public void setTDS_CIRCLE_ADD1(String tDS_CIRCLE_ADD1) {
		TDS_CIRCLE_ADD1 = tDS_CIRCLE_ADD1;
	}
	public String getTDS_CIRCLE_ADD2() {
		return TDS_CIRCLE_ADD2;
	}
	public void setTDS_CIRCLE_ADD2(String tDS_CIRCLE_ADD2) {
		TDS_CIRCLE_ADD2 = tDS_CIRCLE_ADD2;
	}
	public String getTDS_CIRCLE_CITY() {
		return TDS_CIRCLE_CITY;
	}
	public void setTDS_CIRCLE_CITY(String tDS_CIRCLE_CITY) {
		TDS_CIRCLE_CITY = tDS_CIRCLE_CITY;
	}
	public String getTDS_CIRCLE_PINCODE() {
		return TDS_CIRCLE_PINCODE;
	}
	public void setTDS_CIRCLE_PINCODE(String tDS_CIRCLE_PINCODE) {
		TDS_CIRCLE_PINCODE = tDS_CIRCLE_PINCODE;
	}
	public String getUNIT_HR_EMP_CODE() {
		return UNIT_HR_EMP_CODE;
	}
	public void setUNIT_HR_EMP_CODE(String uNIT_HR_EMP_CODE) {
		UNIT_HR_EMP_CODE = uNIT_HR_EMP_CODE;
	}
	public String getSUBDIV_EDLI_EXEMPT_FLAG() {
		return SUBDIV_EDLI_EXEMPT_FLAG;
	}
	public void setSUBDIV_EDLI_EXEMPT_FLAG(String sUBDIV_EDLI_EXEMPT_FLAG) {
		SUBDIV_EDLI_EXEMPT_FLAG = sUBDIV_EDLI_EXEMPT_FLAG;
	}
	public M_SUB_DIVISION(String cOMPANY_CODE, String dIV_CODE,
			String sUBDIV_CODE, String sUBDIV_DESCR,
			String sUBDIV_INCEPTION_DATE, String sUBDIV_ADDRESS1,
			String sUBDIV_ADDRESS2, String sUBDIV_ADDRESS3,
			String sUBDIV_PINCODE, String sUBDIV_TELNOS, String sUBDIV_FAXNOS,
			String sUBDIV_EMAIL, String pAN, String pAN_ALLOTMENT_DATE,
			String tAN, String tAN_ALLOTMENT_DATE, String aCCOUNTING_YEAR_FROM,
			String aCCOUNTING_YEAR_TO, String pF_TRUST_IND,
			String pF_ACCOUNT_NO, String pF_ACCOUNT_COVERAGE_DATE,
			String eSI_ACCOUNT_NO, String eSI_ACCOUNT_COVERAGE_DATE,
			String fACTORY_LICENCE_NO, String lICENCE_COVERAGE_DATE,
			String tDS_CIRCLE, String cREATION_DATE, String uSER_ID,
			String mACHINE_ID, String tDS_CIRCLE_ADD1, String tDS_CIRCLE_ADD2,
			String tDS_CIRCLE_CITY, String tDS_CIRCLE_PINCODE,
			String uNIT_HR_EMP_CODE, String sUBDIV_EDLI_EXEMPT_FLAG) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		DIV_CODE = dIV_CODE;
		SUBDIV_CODE = sUBDIV_CODE;
		SUBDIV_DESCR = sUBDIV_DESCR;
		SUBDIV_INCEPTION_DATE = sUBDIV_INCEPTION_DATE;
		SUBDIV_ADDRESS1 = sUBDIV_ADDRESS1;
		SUBDIV_ADDRESS2 = sUBDIV_ADDRESS2;
		SUBDIV_ADDRESS3 = sUBDIV_ADDRESS3;
		SUBDIV_PINCODE = sUBDIV_PINCODE;
		SUBDIV_TELNOS = sUBDIV_TELNOS;
		SUBDIV_FAXNOS = sUBDIV_FAXNOS;
		SUBDIV_EMAIL = sUBDIV_EMAIL;
		PAN = pAN;
		PAN_ALLOTMENT_DATE = pAN_ALLOTMENT_DATE;
		TAN = tAN;
		TAN_ALLOTMENT_DATE = tAN_ALLOTMENT_DATE;
		ACCOUNTING_YEAR_FROM = aCCOUNTING_YEAR_FROM;
		ACCOUNTING_YEAR_TO = aCCOUNTING_YEAR_TO;
		PF_TRUST_IND = pF_TRUST_IND;
		PF_ACCOUNT_NO = pF_ACCOUNT_NO;
		PF_ACCOUNT_COVERAGE_DATE = pF_ACCOUNT_COVERAGE_DATE;
		ESI_ACCOUNT_NO = eSI_ACCOUNT_NO;
		ESI_ACCOUNT_COVERAGE_DATE = eSI_ACCOUNT_COVERAGE_DATE;
		FACTORY_LICENCE_NO = fACTORY_LICENCE_NO;
		LICENCE_COVERAGE_DATE = lICENCE_COVERAGE_DATE;
		TDS_CIRCLE = tDS_CIRCLE;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
		TDS_CIRCLE_ADD1 = tDS_CIRCLE_ADD1;
		TDS_CIRCLE_ADD2 = tDS_CIRCLE_ADD2;
		TDS_CIRCLE_CITY = tDS_CIRCLE_CITY;
		TDS_CIRCLE_PINCODE = tDS_CIRCLE_PINCODE;
		UNIT_HR_EMP_CODE = uNIT_HR_EMP_CODE;
		SUBDIV_EDLI_EXEMPT_FLAG = sUBDIV_EDLI_EXEMPT_FLAG;
	}                       



}

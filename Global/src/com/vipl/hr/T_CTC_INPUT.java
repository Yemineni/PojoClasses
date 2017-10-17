package com.vipl.hr;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name="hr.t_ctc_input")
@IdClass(T_CTC_INPUT_PK.class)
public class T_CTC_INPUT implements Serializable {

	public T_CTC_INPUT() {
		// TODO Auto-generated constructor stub
	}
	
	@Id String  COMPANY_CODE="";      
	@Id String EMP_CODE       ="";   
	@Id String SAL_MONTH      ="";          
	@Column int  SR_NO=0;                 
	@Column String LOT_NUMBER="";  
	@Column String EFFECTIVE_DATE  ="";          
	@Column float   CTC  =0.0f;  
	@Column float STIPD                     =0.0f;  
	@Column float BASIC                     =0.0f;  
	@Column float VDA                       =0.0f;  
	@Column float HRA                       =0.0f;  
	@Column float CONV                      =0.0f;  
	@Column float SPLAL                     =0.0f;  
	@Column float ATTAL                     =0.0f;  
	@Column float  STSAL                     =0.0f;  
	@Column float GOA                       =0.0f;  
	@Column float GCTAM                     =0.0f;  
	@Column float GOART                     =0.0f;  
	@Column float SFDRV                     =0.0f;  
	@Column float MEIS                      =0.0f;  
	@Column float MED                       =0.0f;  
	@Column float LTA                       =0.0f;  
	@Column float FUEL                      =0.0f;  
	@Column float DRVR                      =0.0f;  
	@Column float TEL                       =0.0f;  
	@Column float SODEX                     =0.0f;  
	@Column float FIXOT                     =0.0f;  
	@Column float EPF                       =0.0f;  
	@Column float ESI                       =0.0f;  
	@Column float GTLI                      =0.0f;  
	@Column float GPAP                      =0.0f;  
	@Column float GMI                       =0.0f;  
	@Column float EDLI                      =0.0f;  
	@Column float LWF                       =0.0f;  
	@Column float GRAT                      =0.0f;  
	@Column float SUPAN                     =0.0f;  
	@Column float PLI                       =0.0f;  
	@Column float PFEES                     =0.0f;  
	@Column int CURR_EMP_TCC_UNIQUE_NO   =0;     
	@Column int REV_EMP_TCC_UNIQUE_NO           =0;     
	@Column int CURR_EMP_PERK_UNIQUENO    =0;     
    @Column int 	REV_EMP_PERK_UNIQUENO    =0;     
	@Column String REMARKS="";                         
	@Column String PROCESSED_FLAG  ="";  
	@Column String CREATION_DATE    ="";         
	@Column String USER_ID                      ="";  
	@Column String MACHINE_ID="";
	public T_CTC_INPUT(String cOMPANY_CODE, String eMP_CODE, String sAL_MONTH,
			int sR_NO, String lOT_NUMBER, String eFFECTIVE_DATE, float cTC,
			float sTIPD, float bASIC, float vDA, float hRA, float cONV,
			float sPLAL, float aTTAL, float sTSAL, float gOA, float gCTAM,
			float gOART, float sFDRV, float mEIS, float mED, float lTA,
			float fUEL, float dRVR, float tEL, float sODEX, float fIXOT,
			float ePF, float eSI, float gTLI, float gPAP, float gMI,
			float eDLI, float lWF, float gRAT, float sUPAN, float pLI,
			float pFEES, int cURR_EMP_TCC_UNIQUE_NO, int rEV_EMP_TCC_UNIQUE_NO,
			int cURR_EMP_PERK_UNIQUENO, int rEV_EMP_PERK_UNIQUENO,
			String rEMARKS, String pROCESSED_FLAG, String cREATION_DATE,
			String uSER_ID, String mACHINE_ID) {
		super();
		COMPANY_CODE = cOMPANY_CODE;
		EMP_CODE = eMP_CODE;
		SAL_MONTH = sAL_MONTH;
		SR_NO = sR_NO;
		LOT_NUMBER = lOT_NUMBER;
		EFFECTIVE_DATE = eFFECTIVE_DATE;
		CTC = cTC;
		STIPD = sTIPD;
		BASIC = bASIC;
		VDA = vDA;
		HRA = hRA;
		CONV = cONV;
		SPLAL = sPLAL;
		ATTAL = aTTAL;
		STSAL = sTSAL;
		GOA = gOA;
		GCTAM = gCTAM;
		GOART = gOART;
		SFDRV = sFDRV;
		MEIS = mEIS;
		MED = mED;
		LTA = lTA;
		FUEL = fUEL;
		DRVR = dRVR;
		TEL = tEL;
		SODEX = sODEX;
		FIXOT = fIXOT;
		EPF = ePF;
		ESI = eSI;
		GTLI = gTLI;
		GPAP = gPAP;
		GMI = gMI;
		EDLI = eDLI;
		LWF = lWF;
		GRAT = gRAT;
		SUPAN = sUPAN;
		PLI = pLI;
		PFEES = pFEES;
		CURR_EMP_TCC_UNIQUE_NO = cURR_EMP_TCC_UNIQUE_NO;
		REV_EMP_TCC_UNIQUE_NO = rEV_EMP_TCC_UNIQUE_NO;
		CURR_EMP_PERK_UNIQUENO = cURR_EMP_PERK_UNIQUENO;
		REV_EMP_PERK_UNIQUENO = rEV_EMP_PERK_UNIQUENO;
		REMARKS = rEMARKS;
		PROCESSED_FLAG = pROCESSED_FLAG;
		CREATION_DATE = cREATION_DATE;
		USER_ID = uSER_ID;
		MACHINE_ID = mACHINE_ID;
	}
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
	public String getSAL_MONTH() {
		return SAL_MONTH;
	}
	public void setSAL_MONTH(String sAL_MONTH) {
		SAL_MONTH = sAL_MONTH;
	}
	public int getSR_NO() {
		return SR_NO;
	}
	public void setSR_NO(int sR_NO) {
		SR_NO = sR_NO;
	}
	public String getLOT_NUMBER() {
		return LOT_NUMBER;
	}
	public void setLOT_NUMBER(String lOT_NUMBER) {
		LOT_NUMBER = lOT_NUMBER;
	}
	public String getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public float getCTC() {
		return CTC;
	}
	public void setCTC(float cTC) {
		CTC = cTC;
	}
	public float getSTIPD() {
		return STIPD;
	}
	public void setSTIPD(float sTIPD) {
		STIPD = sTIPD;
	}
	public float getBASIC() {
		return BASIC;
	}
	public void setBASIC(float bASIC) {
		BASIC = bASIC;
	}
	public float getVDA() {
		return VDA;
	}
	public void setVDA(float vDA) {
		VDA = vDA;
	}
	public float getHRA() {
		return HRA;
	}
	public void setHRA(float hRA) {
		HRA = hRA;
	}
	public float getCONV() {
		return CONV;
	}
	public void setCONV(float cONV) {
		CONV = cONV;
	}
	public float getSPLAL() {
		return SPLAL;
	}
	public void setSPLAL(float sPLAL) {
		SPLAL = sPLAL;
	}
	public float getATTAL() {
		return ATTAL;
	}
	public void setATTAL(float aTTAL) {
		ATTAL = aTTAL;
	}
	public float getSTSAL() {
		return STSAL;
	}
	public void setSTSAL(float sTSAL) {
		STSAL = sTSAL;
	}
	public float getGOA() {
		return GOA;
	}
	public void setGOA(float gOA) {
		GOA = gOA;
	}
	public float getGCTAM() {
		return GCTAM;
	}
	public void setGCTAM(float gCTAM) {
		GCTAM = gCTAM;
	}
	public float getGOART() {
		return GOART;
	}
	public void setGOART(float gOART) {
		GOART = gOART;
	}
	public float getSFDRV() {
		return SFDRV;
	}
	public void setSFDRV(float sFDRV) {
		SFDRV = sFDRV;
	}
	public float getMEIS() {
		return MEIS;
	}
	public void setMEIS(float mEIS) {
		MEIS = mEIS;
	}
	public float getMED() {
		return MED;
	}
	public void setMED(float mED) {
		MED = mED;
	}
	public float getLTA() {
		return LTA;
	}
	public void setLTA(float lTA) {
		LTA = lTA;
	}
	public float getFUEL() {
		return FUEL;
	}
	public void setFUEL(float fUEL) {
		FUEL = fUEL;
	}
	public float getDRVR() {
		return DRVR;
	}
	public void setDRVR(float dRVR) {
		DRVR = dRVR;
	}
	public float getTEL() {
		return TEL;
	}
	public void setTEL(float tEL) {
		TEL = tEL;
	}
	public float getSODEX() {
		return SODEX;
	}
	public void setSODEX(float sODEX) {
		SODEX = sODEX;
	}
	public float getFIXOT() {
		return FIXOT;
	}
	public void setFIXOT(float fIXOT) {
		FIXOT = fIXOT;
	}
	public float getEPF() {
		return EPF;
	}
	public void setEPF(float ePF) {
		EPF = ePF;
	}
	public float getESI() {
		return ESI;
	}
	public void setESI(float eSI) {
		ESI = eSI;
	}
	public float getGTLI() {
		return GTLI;
	}
	public void setGTLI(float gTLI) {
		GTLI = gTLI;
	}
	public float getGPAP() {
		return GPAP;
	}
	public void setGPAP(float gPAP) {
		GPAP = gPAP;
	}
	public float getGMI() {
		return GMI;
	}
	public void setGMI(float gMI) {
		GMI = gMI;
	}
	public float getEDLI() {
		return EDLI;
	}
	public void setEDLI(float eDLI) {
		EDLI = eDLI;
	}
	public float getLWF() {
		return LWF;
	}
	public void setLWF(float lWF) {
		LWF = lWF;
	}
	public float getGRAT() {
		return GRAT;
	}
	public void setGRAT(float gRAT) {
		GRAT = gRAT;
	}
	public float getSUPAN() {
		return SUPAN;
	}
	public void setSUPAN(float sUPAN) {
		SUPAN = sUPAN;
	}
	public float getPLI() {
		return PLI;
	}
	public void setPLI(float pLI) {
		PLI = pLI;
	}
	public float getPFEES() {
		return PFEES;
	}
	public void setPFEES(float pFEES) {
		PFEES = pFEES;
	}
	public int getCURR_EMP_TCC_UNIQUE_NO() {
		return CURR_EMP_TCC_UNIQUE_NO;
	}
	public void setCURR_EMP_TCC_UNIQUE_NO(int cURR_EMP_TCC_UNIQUE_NO) {
		CURR_EMP_TCC_UNIQUE_NO = cURR_EMP_TCC_UNIQUE_NO;
	}
	public int getREV_EMP_TCC_UNIQUE_NO() {
		return REV_EMP_TCC_UNIQUE_NO;
	}
	public void setREV_EMP_TCC_UNIQUE_NO(int rEV_EMP_TCC_UNIQUE_NO) {
		REV_EMP_TCC_UNIQUE_NO = rEV_EMP_TCC_UNIQUE_NO;
	}
	public int getCURR_EMP_PERK_UNIQUENO() {
		return CURR_EMP_PERK_UNIQUENO;
	}
	public void setCURR_EMP_PERK_UNIQUENO(int cURR_EMP_PERK_UNIQUENO) {
		CURR_EMP_PERK_UNIQUENO = cURR_EMP_PERK_UNIQUENO;
	}
	public int getREV_EMP_PERK_UNIQUENO() {
		return REV_EMP_PERK_UNIQUENO;
	}
	public void setREV_EMP_PERK_UNIQUENO(int rEV_EMP_PERK_UNIQUENO) {
		REV_EMP_PERK_UNIQUENO = rEV_EMP_PERK_UNIQUENO;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getPROCESSED_FLAG() {
		return PROCESSED_FLAG;
	}
	public void setPROCESSED_FLAG(String pROCESSED_FLAG) {
		PROCESSED_FLAG = pROCESSED_FLAG;
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
	

}

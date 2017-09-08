package com.vipl.hrms;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="hrms.M_MODULES_ROLES_COMPONENTS")
@IdClass(M_MODULES_ROLES_COMPONENTS_pk.class)
public class M_MODULES_ROLES_COMPONENTS implements Serializable {
public M_MODULES_ROLES_COMPONENTS() {}
	
@Id String	COMPANY_CODE="";    
@Id String	MODULE_CODE ="";   
@Id String MODULE_ROLE_CODE=""; 
@Id String	COMPONENT_CODE="";  
@Column String	COMPONENT_DESCR=""; 
@Column String	COMPONENT_ORDER_NO="";    
@Column String	MODULE_ROLE_DESCR="";  
@Column String	CREATION_DATE="";              
@Column String	USER_ID="";            
@Column String	MACHINE_ID="";
public M_MODULES_ROLES_COMPONENTS(String cOMPANY_CODE, String mODULE_CODE,
		String mODULE_ROLE_CODE, String cOMPONENT_CODE, String cOMPONENT_DESCR,
		String cOMPONENT_ORDER_NO, String mODULE_ROLE_DESCR,
		String cREATION_DATE, String uSER_ID, String mACHINE_ID) {
	super();
	COMPANY_CODE = cOMPANY_CODE;
	MODULE_CODE = mODULE_CODE;
	MODULE_ROLE_CODE = mODULE_ROLE_CODE;
	COMPONENT_CODE = cOMPONENT_CODE;
	COMPONENT_DESCR = cOMPONENT_DESCR;
	COMPONENT_ORDER_NO = cOMPONENT_ORDER_NO;
	MODULE_ROLE_DESCR = mODULE_ROLE_DESCR;
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
public String getMODULE_CODE() {
	return MODULE_CODE;
}
public void setMODULE_CODE(String mODULE_CODE) {
	MODULE_CODE = mODULE_CODE;
}
public String getMODULE_ROLE_CODE() {
	return MODULE_ROLE_CODE;
}
public void setMODULE_ROLE_CODE(String mODULE_ROLE_CODE) {
	MODULE_ROLE_CODE = mODULE_ROLE_CODE;
}
public String getCOMPONENT_CODE() {
	return COMPONENT_CODE;
}
public void setCOMPONENT_CODE(String cOMPONENT_CODE) {
	COMPONENT_CODE = cOMPONENT_CODE;
}
public String getCOMPONENT_DESCR() {
	return COMPONENT_DESCR;
}
public void setCOMPONENT_DESCR(String cOMPONENT_DESCR) {
	COMPONENT_DESCR = cOMPONENT_DESCR;
}
public String getCOMPONENT_ORDER_NO() {
	return COMPONENT_ORDER_NO;
}
public void setCOMPONENT_ORDER_NO(String cOMPONENT_ORDER_NO) {
	COMPONENT_ORDER_NO = cOMPONENT_ORDER_NO;
}
public String getMODULE_ROLE_DESCR() {
	return MODULE_ROLE_DESCR;
}
public void setMODULE_ROLE_DESCR(String mODULE_ROLE_DESCR) {
	MODULE_ROLE_DESCR = mODULE_ROLE_DESCR;
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

/**
 * 
 */
package com.insurance.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Persistent IndustryCodeContainer entity with JPA markup. Accounts are stored in an H2
 * relational database.
 * @author francisphiri
 *
 */
@Entity
public class IndustryCodeContainer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	protected Long id;
	
	protected String ISO_DESCRIPTION;
	
	protected String ISO_CGL;
	
	protected String SIC;
	
	protected String NAICS;
	
	protected String GENERAL_DESCRIPTION;
	
	protected String NCCI;
	
	protected String CA_WC;
	
	protected String DE_WC;
	
	protected String MI_WC;
	
	protected String NJ_WC;
	
	protected String NY_WC;
	
	protected String PA_WC;
	
	protected String TX_WC;
	
	IndustryCodeContainer(){}

	public String getISO_DESCRIPTION() {
		return ISO_DESCRIPTION;
	}

	public String getISO_CGL() {
		return ISO_CGL;
	}

	public String getSIC() {
		return SIC;
	}

	public String getNAICS() {
		return NAICS;
	}

	public String getGENERAL_DESCRIPTION() {
		return GENERAL_DESCRIPTION;
	}

	public String getNCCI() {
		return NCCI;
	}

	public String getCA_WC() {
		return CA_WC;
	}

	public String getDE_WC() {
		return DE_WC;
	}

	public String getMI_WC() {
		return MI_WC;
	}

	public String getNJ_WC() {
		return NJ_WC;
	}

	public String getNY_WC() {
		return NY_WC;
	}

	public String getPA_WC() {
		return PA_WC;
	}

	public String getTX_WC() {
		return TX_WC;
	}

	public void setISO_DESCRIPTION(String iSO_DESCRIPTION) {
		ISO_DESCRIPTION = iSO_DESCRIPTION;
	}

	public void setISO_CGL(String iSO_CGL) {
		ISO_CGL = iSO_CGL;
	}

	public void setSIC(String sIC) {
		SIC = sIC;
	}

	public void setNAICS(String nAICS) {
		NAICS = nAICS;
	}

	public void setGENERAL_DESCRIPTION(String gENERAL_DESCRIPTION) {
		GENERAL_DESCRIPTION = gENERAL_DESCRIPTION;
	}

	public void setNCCI(String nCCI) {
		NCCI = nCCI;
	}

	public void setCA_WC(String cA_WC) {
		CA_WC = cA_WC;
	}

	public void setDE_WC(String dE_WC) {
		DE_WC = dE_WC;
	}

	public void setMI_WC(String mI_WC) {
		MI_WC = mI_WC;
	}

	public void setNJ_WC(String nJ_WC) {
		NJ_WC = nJ_WC;
	}

	public void setNY_WC(String nY_WC) {
		NY_WC = nY_WC;
	}

	public void setPA_WC(String pA_WC) {
		PA_WC = pA_WC;
	}

	public void setTX_WC(String tX_WC) {
		TX_WC = tX_WC;
	}
	
	
	
}


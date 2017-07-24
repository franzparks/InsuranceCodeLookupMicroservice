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
public class InsuranceCodeContainer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	protected Long id;
	
	protected String iSODescription;
	
	protected String iSOcgl;
	
	protected String sIC;
	
	protected String nAICS;
	
	protected String generalDescription;
	
	protected String nCCI;
	
	protected String caWC;
	
	protected String deWC;
	
	protected String miWC;
	
	protected String njWC;
	
	protected String nyWC;
	
	protected String paWC;
	
	protected String txWC;
	
	InsuranceCodeContainer(){} //for JPA

	public InsuranceCodeContainer(String iSODescription, String nAICS,
            String generalDescription, String nCCI, String caWC) {
	    super();
	    this.iSODescription = iSODescription;
	    this.nAICS = nAICS;
	    this.generalDescription = generalDescription;
	    this.nCCI = nCCI;
	    this.caWC = caWC;
    }

	public String getiSODescription() {
		return iSODescription;
	}

	public String getiSOcgl() {
		return iSOcgl;
	}

	public String getsIC() {
		return sIC;
	}

	public String getnAICS() {
		return nAICS;
	}

	public String getGeneralDescription() {
		return generalDescription;
	}

	public String getnCCI() {
		return nCCI;
	}

	public String getCaWC() {
		return caWC;
	}

	public String getDeWC() {
		return deWC;
	}

	public String getMiWC() {
		return miWC;
	}

	public String getNjWC() {
		return njWC;
	}

	public String getNyWC() {
		return nyWC;
	}

	public String getPaWC() {
		return paWC;
	}

	public String getTxWC() {
		return txWC;
	}

	public void setiSODescription(String iSODescription) {
		this.iSODescription = iSODescription;
	}

	public void setiSOcgl(String iSOcgl) {
		this.iSOcgl = iSOcgl;
	}

	public void setsIC(String sIC) {
		this.sIC = sIC;
	}

	public void setnAICS(String nAICS) {
		this.nAICS = nAICS;
	}

	public void setGeneralDescription(String generalDescription) {
		this.generalDescription = generalDescription;
	}

	public void setnCCI(String nCCI) {
		this.nCCI = nCCI;
	}

	public void setCaWC(String caWC) {
		this.caWC = caWC;
	}

	public void setDeWC(String deWC) {
		this.deWC = deWC;
	}

	public void setMiWC(String miWC) {
		this.miWC = miWC;
	}

	public void setNjWC(String njWC) {
		this.njWC = njWC;
	}

	public void setNyWC(String nyWC) {
		this.nyWC = nyWC;
	}

	public void setPaWC(String paWC) {
		this.paWC = paWC;
	}

	public void setTxWC(String txWC) {
		this.txWC = txWC;
	}
	
	

	
	
	
}


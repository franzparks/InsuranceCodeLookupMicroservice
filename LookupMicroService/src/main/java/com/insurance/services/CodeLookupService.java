/**
 * 
 */
package com.insurance.services;

import com.insurance.domain.InsuranceCodeContainer;

/**
 * @author francisphiri
 *
 */
public interface CodeLookupService {
	InsuranceCodeContainer findByISODescription(String text);
	InsuranceCodeContainer findByNAICS(String text);
	InsuranceCodeContainer findByGeneralDescription(String text);
	InsuranceCodeContainer findByGeneralDescriptionContains(String text);
	InsuranceCodeContainer findByGeneralDescriptionIgnoreCase(String text);
	InsuranceCodeContainer findByNCCI(String text);
	InsuranceCodeContainer findByCaWC(String text);
	InsuranceCodeContainer findByDeWC(String text);
	InsuranceCodeContainer findByMiWC(String text);
	InsuranceCodeContainer findByNyWC(String text);
	InsuranceCodeContainer findByNjWC(String text);
	InsuranceCodeContainer findByPaWC(String text);
	InsuranceCodeContainer findByTxWC(String text);
	InsuranceCodeContainer save(InsuranceCodeContainer container);
	
}

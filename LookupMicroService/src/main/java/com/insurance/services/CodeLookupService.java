/**
 * 
 */
package com.insurance.services;

import java.util.List;

import com.insurance.domain.InsuranceCodeContainer;

/**
 * @author francisphiri
 *
 */

public interface CodeLookupService {
	List<InsuranceCodeContainer> findByISODescription(String text);
	List<InsuranceCodeContainer> findByNAICS(String text);
	List<InsuranceCodeContainer> findByGeneralDescription(String text);
	List<InsuranceCodeContainer> findByGeneralDescriptionContains(String text);
	List<InsuranceCodeContainer> findByGeneralDescriptionIgnoreCase(String text);
	List<InsuranceCodeContainer> findByNCCI(String text);
	List<InsuranceCodeContainer> findByCaWC(String text);
	List<InsuranceCodeContainer> findByDeWC(String text);
	List<InsuranceCodeContainer> findByMiWC(String text);
	List<InsuranceCodeContainer> findByNyWC(String text);
	List<InsuranceCodeContainer> findByNjWC(String text);
	List<InsuranceCodeContainer> findByPaWC(String text);
	List<InsuranceCodeContainer> findByTxWC(String text);
	List<InsuranceCodeContainer> save(InsuranceCodeContainer container);
	
}

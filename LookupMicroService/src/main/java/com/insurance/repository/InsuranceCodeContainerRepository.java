/**
 * 
 */
package com.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.insurance.domain.InsuranceCodeContainer;

/**
 * @author francisphiri
 *
 */

@RepositoryRestResource
public interface InsuranceCodeContainerRepository extends JpaRepository<InsuranceCodeContainer, Long>{
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
}

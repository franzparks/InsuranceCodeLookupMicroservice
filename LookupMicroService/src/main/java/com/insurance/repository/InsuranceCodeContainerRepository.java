/**
 * 
 */
package com.insurance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.insurance.domain.InsuranceCodeContainer;

/**
 * @author francisphiri
 *
 */

@RepositoryRestResource
public interface InsuranceCodeContainerRepository extends JpaRepository<InsuranceCodeContainer, Long>{
	Optional<InsuranceCodeContainer> findByISODescription(String text);
	Optional<InsuranceCodeContainer> findByNAICS(String text);
	Optional<InsuranceCodeContainer> findByGeneralDescription(String text);
	Optional<InsuranceCodeContainer> findByGeneralDescriptionContains(String text);
	Optional<InsuranceCodeContainer> findByGeneralDescriptionIgnoreCase(String text);
	Optional<InsuranceCodeContainer> findByNCCI(String text);
	List<InsuranceCodeContainer> findByCaWC(String text);
	Optional<InsuranceCodeContainer> findByDeWC(String text);
	Optional<InsuranceCodeContainer> findByMiWC(String text);
	Optional<InsuranceCodeContainer> findByNyWC(String text);
	Optional<InsuranceCodeContainer> findByNjWC(String text);
	Optional<InsuranceCodeContainer> findByPaWC(String text);
	Optional<InsuranceCodeContainer> findByTxWC(String text);
}

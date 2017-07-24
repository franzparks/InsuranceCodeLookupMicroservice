/**
 * 
 */
package com.insurance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.InsuranceCodeContainer;

/**
 * @author francisphiri
 *
 */
public interface InsuranceCodeContainerRepository extends JpaRepository<InsuranceCodeContainer, Long>{
	Optional<InsuranceCodeContainer> findByISODescription(String text);
	Optional<InsuranceCodeContainer> findByNAICS(String text);
	Optional<InsuranceCodeContainer> findByGeneralDescription(String text);
	Optional<InsuranceCodeContainer> findByGeneralDescriptionContains(String text);
	Optional<InsuranceCodeContainer> findByGeneralDescriptionIgnoreCase(String text);
	Optional<InsuranceCodeContainer> findByNCCI(String text);
	Optional<InsuranceCodeContainer> findByCaWC(String text);
	Optional<InsuranceCodeContainer> findByDeWC(String text);
	Optional<InsuranceCodeContainer> findByMiWC(String text);
	Optional<InsuranceCodeContainer> findByNyWC(String text);
	Optional<InsuranceCodeContainer> findByNjWC(String text);
	Optional<InsuranceCodeContainer> findByPaWC(String text);
	Optional<InsuranceCodeContainer> findByTxWC(String text);
}

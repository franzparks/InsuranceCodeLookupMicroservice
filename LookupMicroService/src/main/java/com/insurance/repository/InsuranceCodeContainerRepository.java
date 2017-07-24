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
}

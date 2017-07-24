package com.insurance.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.domain.InsuranceCodeContainer;
import com.insurance.repository.InsuranceCodeContainerRepository;
import com.insurance.services.CodeLookupService;
/**
 * @author francisphiri
 *
 */
@Service
public class CodeLookupServiceImp implements CodeLookupService {
	
	@Autowired
	private InsuranceCodeContainerRepository insuranceCodeContainerRepository;
	
	@Override
	public List<InsuranceCodeContainer> findByISODescription(String text) {
		return insuranceCodeContainerRepository.findByISODescription(text);
	}
	
	@Override
	public List<InsuranceCodeContainer> findByNAICS(String text) {
		return insuranceCodeContainerRepository.findByNAICS(text);
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescription(String text) {
		return insuranceCodeContainerRepository.findByGeneralDescription(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByGeneralDescriptionContains(String text) {
		return insuranceCodeContainerRepository.findByGeneralDescriptionContains(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByGeneralDescriptionIgnoreCase(String text) {
		return insuranceCodeContainerRepository.findByGeneralDescriptionIgnoreCase(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByNCCI(String text) {
		return insuranceCodeContainerRepository.findByNCCI(text);
	}
	
	@Override
	public List<InsuranceCodeContainer> findByCaWC(String text) {
		return insuranceCodeContainerRepository.findByCaWC(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByDeWC(String text) {
		return insuranceCodeContainerRepository.findByDeWC(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByMiWC(String text) {
		return insuranceCodeContainerRepository.findByMiWC(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByNyWC(String text) {
		return insuranceCodeContainerRepository.findByNyWC(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByNjWC(String text) {
		return insuranceCodeContainerRepository.findByNjWC(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByPaWC(String text) {
		return insuranceCodeContainerRepository.findByPaWC(text);
	}
	
	@Override
	public List<InsuranceCodeContainer>  findByTxWC(String text) {
		return insuranceCodeContainerRepository.findByTxWC(text);
	}

	@Override
    public List<InsuranceCodeContainer>  save(List<InsuranceCodeContainer>  container) {
		return insuranceCodeContainerRepository.save(container);
    }
	
}

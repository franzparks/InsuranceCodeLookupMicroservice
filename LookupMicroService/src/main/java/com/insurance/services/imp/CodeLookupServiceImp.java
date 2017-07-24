package com.insurance.services.imp;

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
	public InsuranceCodeContainer findByISODescription(String text) {
		return insuranceCodeContainerRepository.findByISODescription(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByNAICS(String text) {
		return insuranceCodeContainerRepository.findByNAICS(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescription(String text) {
		return insuranceCodeContainerRepository.findByGeneralDescription(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescriptionContains(String text) {
		return insuranceCodeContainerRepository.findByGeneralDescriptionContains(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescriptionIgnoreCase(String text) {
		return insuranceCodeContainerRepository.findByGeneralDescriptionIgnoreCase(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByNCCI(String text) {
		return insuranceCodeContainerRepository.findByNCCI(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByCaWC(String text) {
		return insuranceCodeContainerRepository.findByCaWC(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByDeWC(String text) {
		return insuranceCodeContainerRepository.findByDeWC(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByMiWC(String text) {
		return insuranceCodeContainerRepository.findByMiWC(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByNyWC(String text) {
		return insuranceCodeContainerRepository.findByNyWC(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByNjWC(String text) {
		return insuranceCodeContainerRepository.findByNjWC(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByPaWC(String text) {
		return insuranceCodeContainerRepository.findByPaWC(text).get();
	}
	
	@Override
	public InsuranceCodeContainer findByTxWC(String text) {
		return insuranceCodeContainerRepository.findByTxWC(text).get();
	}

	@Override
    public InsuranceCodeContainer save(InsuranceCodeContainer container) {
		return insuranceCodeContainerRepository.save(container);
    }
	
}

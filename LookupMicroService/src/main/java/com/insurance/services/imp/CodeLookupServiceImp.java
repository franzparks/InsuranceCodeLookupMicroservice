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
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByNAICS(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescription(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescriptionContains(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByGeneralDescriptionIgnoreCase(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByNCCI(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByCaWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByDeWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByMiWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByNyWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByNjWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByPaWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public InsuranceCodeContainer findByTxWC(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

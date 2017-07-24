/**
 * 
 */
package com.insurance;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.domain.InsuranceCodeContainer;
import com.insurance.services.CodeLookupService;

/**
 * @author francisphiri
 *
 */
@RestController
public class LookupsController {
	
	protected Logger logger = Logger.getLogger(LookupsController.class.getName());
	
	@Autowired
	protected CodeLookupService codeLookupService;
	
	@RequestMapping(value = "/codes/cacw/{codeNumber}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> findByCaWC(@PathVariable("codeNumber") String codeNumber) {
		logger.info("micro-service findByCaWC() invoked: " + codeNumber);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByCaWC(codeNumber);
		logger.info("micro-service findByCaWC() found: " + codeContainer);
		return codeContainer;
	}
	
	@RequestMapping(value = "/codes/description/{text}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> findByGeneralDescription(
			@PathVariable("text") String text) {
		logger.info("micro-service findByGeneralDescription() invoked: " + text);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByGeneralDescription(text);
		logger.info("micro-service findByGeneralDescription() found: " + codeContainer);
		return codeContainer;
	}
	
	//@RequestMapping(value = "/codes/{text}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> findByGeneralDescriptionContains(
			@PathVariable("text") String text) {
		logger.info("micro-service findByGeneralDescriptionContains() invoked: " + text);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByGeneralDescriptionContains(text);
		logger.info("micro-service findByGeneralDescriptionContains() found: " + codeContainer);
		return codeContainer;
	}
	
	//@RequestMapping(value = "/codes/{text}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> findByGeneralDescriptionIgnoreCase(
			@PathVariable("text") String text) {
		logger.info("micro-service findByGeneralDescriptionIgnoreCase() invoked: " + text);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByGeneralDescriptionIgnoreCase(text);
		logger.info("micro-service findByGeneralDescriptionIgnoreCase() found: " + codeContainer);
		return codeContainer;
	}
	
	@RequestMapping(value = "/codes/naics/{codeNumber}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> findByNAICS(@PathVariable("codeNumber") String codeNumber) {
		logger.info("micro-service findByNAICS() invoked: " + codeNumber);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByNAICS(codeNumber);
		logger.info("micro-service findByNAICS() found: " + codeContainer);
		return codeContainer;
	}
	
	@RequestMapping(value = "/codes/ncci/{codeNumber}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> findByNCCI(@PathVariable("codeNumber") String codeNumber) {
		logger.info("micro-service findByNCCI() invoked: " + codeNumber);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByNCCI(codeNumber);
		logger.info("micro-service findByNCCI() found: " + codeContainer);
		return codeContainer;
	}
	
	@RequestMapping(value = "/codes/doSearch/{codeNumber}", produces = "application/json")
	public @ResponseBody List<InsuranceCodeContainer> search(@PathVariable("codeNumber") String codeNumber) {
		logger.info("micro-service search() invoked: " + codeNumber);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByNCCI(codeNumber);
		codeContainer.addAll(codeLookupService.findByCaWC(codeNumber));
		codeContainer.addAll(codeLookupService.findByNAICS(codeNumber));
		logger.info("micro-service search() found: " + codeContainer);
		return codeContainer;
	}
	
	
}

/**
 * 
 */
package com.insurance;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/codes/{codeNumber}")
	public @ResponseBody List<InsuranceCodeContainer> findByCaWC(@PathVariable("codeNumber") String codeNumber) {
		logger.info("micro-service findByCaWC() invoked: " + codeNumber);
		List<InsuranceCodeContainer> codeContainer = codeLookupService.findByCaWC(codeNumber);
		logger.info("micro-service findByCaWC() found: " + codeContainer);
		return codeContainer;
	}
	
}

/**
 * 
 */
package com.insurance.services.web;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author francisphiri
 *
 */
public class WebLookupsController {
	
	@Autowired
	protected WebLookupService lookupService;

	protected Logger logger = Logger.getLogger(WebLookupsController.class
			.getName());

	public WebLookupsController(WebLookupService lookupService) {
		this.lookupService = lookupService;
	}
	
	@RequestMapping("/codes")
	public String goHome() {
		return "index";
	}
	
	@RequestMapping("/codes/all")
	public InsuranceCodeContainer allCodes() {
		return lookupService.findByCode("1741");
		//return "index";
	}
	@RequestMapping("/codes/{codeNumber}")
	public String byCodeNumber(Model model,
			@PathVariable("codeNumber") String codeNumber) {

		logger.info("web-service byCodeNumber() invoked: " + codeNumber);

		//InsuranceCodeContainer codeContainer = accountsService.findByCode(codeNumber);
		//logger.info("web-service byCode() found: " + codeContainer);
		//model.addAttribute("codeContainer", codeContainer);
		return "index";
	}
}

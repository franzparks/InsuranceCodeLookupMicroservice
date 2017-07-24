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
public class WebAccountsController {
	
	@Autowired
	protected WebLookupService accountsService;

	protected Logger logger = Logger.getLogger(WebAccountsController.class
			.getName());

	public WebAccountsController(WebLookupService accountsService) {
		this.accountsService = accountsService;
	}
	
	@RequestMapping("/codes")
	public String goHome() {
		return "index";
	}
	
	@RequestMapping("/codes/{codeNumber}")
	public String byCodeNumber(Model model,
			@PathVariable("codeNumber") String codeNumber) {

		logger.info("web-service byCodeNumber() invoked: " + codeNumber);

		InsuranceCodeContainer codeContainer = accountsService.findByCode(codeNumber);
		logger.info("web-service byCode() found: " + codeContainer);
		model.addAttribute("account", codeContainer);
		return "codeContainer";
	}
}

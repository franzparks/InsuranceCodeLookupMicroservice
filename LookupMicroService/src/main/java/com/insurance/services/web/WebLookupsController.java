/**
 * 
 */
package com.insurance.services.web;


import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author francisphiri
 *
 */
@Controller
@RequestMapping("/web")
public class WebLookupsController {
	
	@Autowired
	protected WebLookupService lookupService;

	protected Logger logger = Logger.getLogger(WebLookupsController.class
			.getName());

	/*public WebLookupsController(WebLookupService lookupService) {
		this.lookupService = lookupService;
	}*/
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setAllowedFields("codeNumber");
	}
	
	@RequestMapping("/codes")
	public String goHome() {
		return "index";
	}
	
	
	@RequestMapping("/codes/cacw/{codeNumber}")
	public String byCaWC(Model model,
			@PathVariable("codeNumber") String codeNumber) {

		logger.info("web-service byCaWC() invoked: " + codeNumber);

		List<InsuranceCodeContainer> codes = lookupService.findByCaWC(codeNumber);
		logger.info("web-service byCaWC() found: " + codes);
		if (codes != null){
			model.addAttribute("codes", codes);
		}
		return "codes";
	}
	
	@RequestMapping("/codes/naics/{codeNumber}")
	public String byNAICS(Model model,
			@PathVariable("codeNumber") String codeNumber) {

		logger.info("web-service byNAICS() invoked: " + codeNumber);

		List<InsuranceCodeContainer> codes = lookupService.findByNAICS(codeNumber);
		logger.info("web-service byNAICS() found: " + codes);
		if (codes != null)
			model.addAttribute("codes", codes);
		return "codes";
	}
	
	@RequestMapping("/codes/ncci/{codeNumber}")
	public String byNCCI(Model model,
			@PathVariable("codeNumber") String codeNumber) {

		logger.info("web-service byNCCI() invoked: " + codeNumber);

		List<InsuranceCodeContainer> codes = lookupService.findByNCCI(codeNumber);
		logger.info("web-service byNCCI() found: " + codes);
		if (codes != null)
			model.addAttribute("codes", codes);
		return "codes";
	}
	
	@RequestMapping(value = "/codes/search", method = RequestMethod.GET)
	public String searchForm(Model model) {
		model.addAttribute("searchCriteria", new SearchCriteria());
		return "codeSearch";
	}

	
	@RequestMapping(value = "/codes/dosearch")
	public String doSearch(Model model, SearchCriteria criteria,
			BindingResult result) {
		logger.info("web-service search() invoked: " + criteria);
		
		String codeNumber = criteria.getCodeNumber();
		return byNCCI(model, codeNumber);

	}
}

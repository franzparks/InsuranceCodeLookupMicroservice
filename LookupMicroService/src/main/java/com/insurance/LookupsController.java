/**
 * 
 */
package com.insurance;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}

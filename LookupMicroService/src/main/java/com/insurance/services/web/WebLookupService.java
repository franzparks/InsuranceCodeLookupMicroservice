/**
 * 
 */
package com.insurance.services.web;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Hide the access to the microservice inside this local service.
 * @author francisphiri
 *
 */

@Service
public class WebLookupService {
	
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;

	protected String serviceUrl = "http://LOOKUP-SERVICE";;

	protected Logger logger = Logger.getLogger(WebLookupService.class.getName());

	/**
	 * The RestTemplate works because it uses a custom request-factory that uses
	 * Ribbon to look-up the service to use. This method simply exists to show
	 * this.
	 */
	@PostConstruct
	public void demoOnly() {
		// Can't do this in the constructor because the RestTemplate injection
		// happens afterwards.
		logger.warning("The RestTemplate request factory is "
				+ restTemplate.getRequestFactory().getClass());
	}
	
	public List<InsuranceCodeContainer> findByCaWC(String codeNumber) {
		logger.info("findByCaWC() invoked: for " + codeNumber);
		InsuranceCodeContainer containers[] = null;
		
		try {
			containers = restTemplate.getForObject(serviceUrl
					+ "/codes/cacw/{codeNumber}", InsuranceCodeContainer[].class, codeNumber);
		} catch (HttpClientErrorException e) { // 404
			// Nothing found
		}

		if (containers == null || containers.length == 0)
			return null;
		else
			return Arrays.asList(containers);
	}
	
	public List<InsuranceCodeContainer> findByNAICS(String codeNumber) {
		logger.info("findByNAICS() invoked: for " + codeNumber);
		InsuranceCodeContainer containers[] = null;
		
		try {
			containers = restTemplate.getForObject(serviceUrl
					+ "/codes/naics/{codeNumber}", InsuranceCodeContainer[].class, codeNumber);
		} catch (HttpClientErrorException e) { // 404
			// Nothing found
		}

		if (containers == null || containers.length == 0)
			return null;
		else
			return Arrays.asList(containers);
	}
	
	public List<InsuranceCodeContainer> findByNCCI(String codeNumber) {
		logger.info("findByNCCI() invoked: for " + codeNumber);
		InsuranceCodeContainer containers[] = null;
		
		try {
			containers = restTemplate.getForObject(serviceUrl
					+ "/codes/ncci/{codeNumber}", InsuranceCodeContainer[].class, codeNumber);
		} catch (HttpClientErrorException e) { // 404
			// Nothing found
		}

		if (containers == null || containers.length == 0)
			return null;
		else
			return Arrays.asList(containers);
	}


	
}

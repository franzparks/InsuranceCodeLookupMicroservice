/**
 * 
 */
package com.insurance.services.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Lokkup web-server. Works as a microservice client, fetching data from the
 * Lookup-Service. Uses the Discovery Server (Eureka) to find the microservice.
 * @author francisphiri
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false) // Disable component scanner
public class WebServer {
	
	/**
	 * URL uses the logical name of lookup-service - upper or lower case,
	 * doesn't matter.
	 */
	public static final String LOOKUP_SERVICE_URL = "http://LOOKUP-SERVICE";
	
	//@Autowired
	//protected WebLookupService lookupService;
	
	public static void main(String[] args) {
		// Tell server to look for web-server.properties or web-server.yml
		System.setProperty("spring.config.name", "web-server");
		SpringApplication.run(WebServer.class, args);
	}
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

	/**
	 * The AccountService encapsulates the interaction with the micro-service.
	 * 
	 * @return A new service instance.
	 */
	//@Bean
	//public WebLookupService lookupService() {
	//	return new WebLookupService(LOOKUP_SERVICE_URL); //
	//}

	/**
	 * Create the controller, passing it the {@link WebLookupService} to use.
	 * 
	 * @return
	 */
	//@Bean
	//public WebLookupsController lookupController() {
	//	return new WebLookupsController(lookupService());
	//}

	@Bean
	public HomeController homeController() {
		return new HomeController();
	}

	
}

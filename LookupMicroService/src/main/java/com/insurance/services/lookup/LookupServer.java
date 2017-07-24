/**
 * 
 */
package com.insurance.services.lookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author francisphiri
 *
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
public class LookupServer {
	
	public void main(String[] args){
		// Tell server to look for lookup-server.properties or
		// lookup-server.yml
		System.setProperty("spring.config.name", "accounts-server");

		SpringApplication.run(LookupServer.class, args);
	}
	
}

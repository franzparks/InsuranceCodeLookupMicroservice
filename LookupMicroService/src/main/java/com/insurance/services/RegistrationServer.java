/**
 * 
 */
package com.insurance.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author francisphiri
 *
 */
//Needed to run a Eureka registration server.
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {
	
	public static void main(String[] args) {
		// Tell server to look for registration.properties or registration-server.yml
		System.setProperty("spring.config.name", "registration-server");

		SpringApplication.run(RegistrationServer.class, args);
	}
}

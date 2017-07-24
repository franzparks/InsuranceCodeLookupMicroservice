package com.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class LookupMicroServiceApplicationServer {

	public static void main(String[] args) {
		// Tell server to look for lookup-server.properties or
		// lookup-server.yml
		System.setProperty("spring.config.name", "lookup-server");
		SpringApplication.run(LookupMicroServiceApplicationServer.class, args);
	}
}

package com.insurance;


import java.util.logging.Logger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.insurance.services.CodeLookupService;
import com.insurance.utils.PDFManager;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class LookupMicroServiceApplicationServer {
	
	@Autowired
	protected CodeLookupService codeLookupService;
	
	protected Logger logger = Logger.getLogger(LookupMicroServiceApplicationServer.class.getName());

	public static void main(String[] args) {
		
		// Tell server to look for lookup-server.properties or
		// lookup-server.yml
		System.setProperty("spring.config.name", "lookup-server");
		SpringApplication.run(LookupMicroServiceApplicationServer.class, args);
		
		PDFManager	pdfManager	= new PDFManager();
		pdfManager.setFilePath("data/fastcompclasscodecrossreferenceguide.pdf");
		String[] arrayOfPDFLines = pdfManager.ToText().split("\n");
		
		List<Map<String, String>> listOfMappings = pdfManager.getListOfMappings(arrayOfPDFLines);
	}
}

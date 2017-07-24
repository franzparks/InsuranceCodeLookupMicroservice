package com.insurance;


import java.util.logging.Logger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.insurance.config.LookupConfig;
import com.insurance.domain.InsuranceCodeContainer;
import com.insurance.services.CodeLookupService;
import com.insurance.services.web.HomeController;
import com.insurance.services.web.WebLookupService;
import com.insurance.services.web.WebLookupsController;
import com.insurance.services.web.WebServer;
import com.insurance.utils.PDFManager;

@SpringBootApplication()
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan({"com.insurance"})
@EntityScan("com.insurance.domain")
@EnableJpaRepositories("com.insurance.repository")
public class LookupMicroServiceApplicationServer implements CommandLineRunner{
	
	enum CODES { ISO_DESC, ISO_CGL, SIC, NAICS, GENERAL_DESC, NCCI, CA_WC, DE_WC, MI_WC, NJ_WC, NY_WC, PA_WC, TX_WC}
	
	@Autowired
	private CodeLookupService codeLookupService;
	
	protected Logger logger = Logger.getLogger(LookupMicroServiceApplicationServer.class.getName());

	public static void main(String[] args) {
		
		// Tell server to look for lookup-server.properties or
		// lookup-server.yml
		System.setProperty("spring.config.name", "lookup-server");
		SpringApplication.run(LookupMicroServiceApplicationServer.class, args);
		
	}
	
	@Override
    public void run(String... arg0) throws Exception {
		PDFManager	pdfManager	= new PDFManager();
		pdfManager.setFilePath("data/fastcompclasscodecrossreferenceguide.pdf");
		String[] arrayOfPDFLines = pdfManager.ToText().split("\n");
		
		List<Map<String, String>> listOfMappings = pdfManager.getListOfMappings(arrayOfPDFLines);
		
		for(Map<String, String> mapping:listOfMappings){
			codeLookupService.save(new InsuranceCodeContainer(mapping.get(CODES.ISO_DESC.toString()), 
					mapping.get(CODES.NAICS.toString()), mapping.get(CODES.GENERAL_DESC.toString()),
					mapping.get(CODES.NCCI.toString()), 
					mapping.get(CODES.CA_WC.toString())));
		}
	}
}




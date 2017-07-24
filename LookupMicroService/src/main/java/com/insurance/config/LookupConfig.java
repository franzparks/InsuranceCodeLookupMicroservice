/**
 * 
 */
package com.insurance.config;

//import org.springframework.boot.orm.jpa.EntityScan;
import java.util.logging.Logger;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author francisphiri
 *
 */
@Configuration
@ComponentScan
//@EntityScan("com.insurance")
@EnableJpaRepositories("com.insurance.repository")
public class LookupConfig {
	
	protected Logger logger;
	
	public LookupConfig(){
		logger = Logger.getLogger(getClass().getName());
	}
	
}

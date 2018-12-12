package com.testjsp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{   private static final Log LOG = LogFactory.getLog(App.class);
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        LOG.info("spring-boot-practice is started.");
    }
}

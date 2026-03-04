package com.sb.ocp.test.sbmain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOCPApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootOCPApplication.class);

	public static void main(String[] args) {

		LOG.info("Loaded SpringBootOCPApplication successfully...");

		SpringApplication.run(SpringBootOCPApplication.class, args);
	}

}

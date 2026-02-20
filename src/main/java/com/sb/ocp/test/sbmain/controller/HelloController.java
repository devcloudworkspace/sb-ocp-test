package com.sb.ocp.test.sbmain.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbocp")
public class HelloController {
	private Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/sayhi")
	public ResponseEntity<String> sayHi() {
		LOG.info("entering 'sayHi'");
		try {
			LOG.info("exiting 'sayHi'");
			return new ResponseEntity<>("Hi, ", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/sayhello")
	public ResponseEntity<String> sayHello(@RequestParam(required = false) String name) {
		LOG.info("entering 'sayHello'");

		try {
			if (name.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			LOG.info("exiting 'sayHello'");
			return new ResponseEntity<>("Hello, "+name, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

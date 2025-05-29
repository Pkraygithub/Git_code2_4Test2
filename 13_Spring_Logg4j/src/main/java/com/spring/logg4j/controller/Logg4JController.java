package com.spring.logg4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logg4JController {

	private Logger logger = LoggerFactory.getLogger(Logg4JController.class);

	@GetMapping("/log4j")
	public String showLog4jMessage() {
		
		logger.trace("this is Log4j()--Trace() Message");
		logger.debug("this is Log4j()--Debug()  Message");
		logger.info("Welcome to Learn Log4j....Info() Message");
		
		String str = "Welcome to Learn For Log4j....!";
		
		logger.warn("this is Log4j()--Warn()  Message");
		logger.error("this is Log4j()--Error() Message");
		
		return str;
	}
}

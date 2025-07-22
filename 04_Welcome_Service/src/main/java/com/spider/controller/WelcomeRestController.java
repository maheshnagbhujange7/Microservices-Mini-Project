package com.spider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;


@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
	    String port =	env.getProperty("server.port");
		
		String msg = "Welcome to SpiderMan...!! (" + port + ")";
	    return msg;
	}
}

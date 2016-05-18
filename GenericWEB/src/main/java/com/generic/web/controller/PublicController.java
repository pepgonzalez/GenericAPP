package com.generic.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {
		
	private static final Logger LOG = LoggerFactory.getLogger(PublicController.class);
	
	@RequestMapping("/")
	public String showIndex(){
		LOG.debug("mostrando index");
		return "index";
	}
	
	@RequestMapping("/auth/")
	public String showAuth(){
		LOG.debug("mostrando index logueado");
		return "auth";
	}
}

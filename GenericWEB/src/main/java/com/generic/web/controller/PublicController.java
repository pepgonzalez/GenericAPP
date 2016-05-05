package com.generic.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generic.service.IGenericService;

@Controller
public class PublicController {
		
	@Autowired
	private IGenericService genericService;
	
	private static final Logger LOG = LoggerFactory.getLogger(PublicController.class);
	
	@RequestMapping("/")
	public String showIndex(){
		LOG.debug("mostrando index");
		genericService.test();
		return "index";
	}
}

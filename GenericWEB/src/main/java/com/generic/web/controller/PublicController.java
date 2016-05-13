package com.generic.web.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping("/auth/")
	public String showAuth(){
		LOG.debug("mostrando index logueado");
		return "auth";
	}
}

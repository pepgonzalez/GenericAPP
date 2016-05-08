package com.generic.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generic.persistence.dao.IGeneric;
import com.generic.service.IGenericService;

@Service
public class GenericService implements IGenericService {

	private static final Logger LOG = LoggerFactory.getLogger(GenericService.class);
	
	@Autowired
	private IGeneric genericDAO;
	
	public void test() {
		LOG.debug("metodo test");
		int result = genericDAO.test();
		LOG.debug("Resultado de DAO: " + result); 
		
		LOG.debug("invocando test date: ");
		Date date = genericDAO.testDate();
		LOG.debug("Resultado de date: " + date);
	}

}

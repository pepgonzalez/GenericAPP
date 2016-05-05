package com.generic.persistence.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.generic.persistence.dao.IGeneric;

@Repository
public class GenericDAO implements IGeneric{

	private static final Logger LOG = LoggerFactory.getLogger(GenericDAO.class);
	
	public int test() {
		LOG.debug("test desde DAO");
		return 1;
	}

}

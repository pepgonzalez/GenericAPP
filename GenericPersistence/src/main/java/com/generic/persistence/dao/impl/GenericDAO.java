package com.generic.persistence.dao.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.generic.persistence.base.BaseDAO;
import com.generic.persistence.dao.IGeneric;

@Repository
public class GenericDAO extends BaseDAO implements IGeneric{

	private static final Logger LOG = LoggerFactory.getLogger(GenericDAO.class);
	
	public int test() {
		LOG.debug("test desde DAO");
		
		Integer result = this.getJdbcTemplate().queryForObject("SELECT 2 FROM DUAL", Integer.class);
		
		return result;
	}
	
	public Date testDate(){
		LOG.debug("test desde DAO: testDate");
		
		Date result = this.getJdbcTemplate().queryForObject("SELECT SYSDATE() FROM DUAL", Date.class);
		
		return result;
	}

}

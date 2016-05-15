package com.generic.persistence.base;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class BaseDAO {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate(){
		if(this.jdbcTemplate == null){
			this.jdbcTemplate = new JdbcTemplate(this.dataSource);
		}
		return this.jdbcTemplate;
	}
}

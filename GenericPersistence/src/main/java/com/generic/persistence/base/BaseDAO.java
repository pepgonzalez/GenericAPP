package com.generic.persistence.base;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class BaseDAO {

	private static final Logger LOG = LoggerFactory.getLogger(BaseDAO.class);
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private QueryContainer sql;
	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public String getSql(String k){
		return this.sql.get(k);
	}
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public JdbcTemplate getJdbcTemplate(){
		if(this.jdbcTemplate == null){
			this.jdbcTemplate = new JdbcTemplate(this.dataSource);
		}
		return this.jdbcTemplate;
	}
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		if(this.namedParameterJdbcTemplate == null){
			this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		}
		return this.namedParameterJdbcTemplate;
	}
	
	public <E> List<E> queryForList(Class<E> dto, String q, SqlParameterSource params, RowMapper<E> mapper) {
		return (List<E>) this.getNamedParameterJdbcTemplate().query(q, params, mapper);
	}
	
	public String getLabeledQuery(String base, Map<String, String> columnProps){
		StringBuilder q = new StringBuilder(base);
		
		Iterator<Entry<String,String>> it = columnProps.entrySet().iterator();
		int c = 0;
	    while (it.hasNext()) {
	    	if(c == 0){
	    		q.append(" WHERE ");
	    	}else{
	    		q.append(" AND ");
	    	}
	        Entry<String, String> e = it.next();
	        q.append(e.getKey().toUpperCase()).append(" = :").append(e.getKey().toLowerCase());
	        it.remove();
	        c++;
	    }
	    LOG.debug("Consulta: " + q.toString());
		return q.toString();
	}
}

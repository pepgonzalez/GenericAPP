package com.generic.persistence.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public interface IBase<K> {

	public K findById(Long id);
	
	public List<K> findAll();
	
	public List<K> findByPropierties(Map<String, String> columnProps, SqlParameterSource propsValues);
}

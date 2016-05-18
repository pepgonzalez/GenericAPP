package com.generic.persistence.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.generic.persistence.base.BaseDAO;
import com.generic.persistence.base.SQLConstants;
import com.generic.persistence.dao.IUser;
import com.generic.persistence.mapper.UserMapper;
import com.generic.shared.dto.UserDTO;

@Repository
public class UserDAO extends BaseDAO implements IUser {

	private static final Logger LOG = LoggerFactory.getLogger(UserDAO.class);
	
	/* CRUD SERVICES */
	
	public UserDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDTO> findByPropierties(Map<String, String> columnProps, SqlParameterSource propsValues) {
		return this.queryForList(UserDTO.class, this.getLabeledQuery(this.getSql(SQLConstants.GET_USER_BY_PROPERTIES), columnProps), propsValues, new UserMapper());
	}

	/* BUSSINESS SERVICES */
	
	public UserDTO findUserByUserName(String username) {
		Map<String, String> columnProps = new HashMap<String, String>();
		columnProps.put("USERNAME", username);
		SqlParameterSource propsValues = new MapSqlParameterSource().addValue("username", username);
		List<UserDTO> l = this.findByPropierties(columnProps, propsValues);
		LOG.debug("Elementos encontrados: " + l.size());
		UserDTO userDTO = (!l.isEmpty() ? l.get(0) : null);
		if(userDTO == null){
			LOG.debug("DTO obtenido es nulo");
		}else{
			LOG.debug("Valor de dto obtenido: " + userDTO.getUsername());
		}
		return userDTO;
	}
}
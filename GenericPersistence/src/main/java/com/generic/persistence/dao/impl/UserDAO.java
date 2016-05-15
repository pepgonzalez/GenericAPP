package com.generic.persistence.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.generic.persistence.base.BaseDAO;
import com.generic.persistence.dao.IUser;
import com.generic.shared.dto.UserDTO;

public class UserDAO extends BaseDAO implements IUser {

	public UserDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDTO> findByPropierties(Map<String, String> columnProps, SqlParameterSource propsValues) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO findByUserName(String username) {
		Map<String, String> columnProps = new HashMap<String, String>();
		columnProps.put("USERNAME", username);
		SqlParameterSource propsValues = new MapSqlParameterSource().addValue("username", username);
		return this.findByPropierties(columnProps, propsValues).get(0);
	}

}

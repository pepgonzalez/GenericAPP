package com.generic.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.generic.shared.dto.UserDTO;

public class UserMapper implements RowMapper<UserDTO> {

	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDTO u = new UserDTO();
		u.setUserId(rs.getLong("USER_ID"));
		u.setUsername(rs.getString("USERNAME"));
		u.setPassword(rs.getString("PASSWORD"));
		
		u.setCreationDate(rs.getTimestamp("CREATION_DATE"));
		u.setLastUpdateDate(rs.getTimestamp("LAST_UPDATE_DATE"));
		u.setCreatorId(rs.getLong("CREATOR_ID"));
		u.setLastUpdatorId(rs.getLong("LAST_UPDATOR_ID"));
		u.setActive(rs.getInt("ACTIVE") > 0);
		
		return u;
	}

}

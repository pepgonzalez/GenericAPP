package com.generic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generic.persistence.dao.IUser;
import com.generic.service.ICommonService;
import com.generic.shared.dto.UserDTO;

@Service
public class CommonService implements ICommonService {

	@Autowired
	private IUser userDAO;
	
	public UserDTO getUserByUsername(String username) {
		return userDAO.findUserByUserName(username);
	}

}

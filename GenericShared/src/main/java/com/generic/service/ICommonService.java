package com.generic.service;

import com.generic.shared.dto.UserDTO;

public interface ICommonService {

	UserDTO getUserByUsername(String username);
}

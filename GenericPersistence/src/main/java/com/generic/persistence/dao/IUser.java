package com.generic.persistence.dao;

import com.generic.shared.dto.UserDTO;

public interface IUser extends IBase<UserDTO> {

	UserDTO findByUserName(String username);
}

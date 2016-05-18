package com.generic.web.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generic.service.ICommonService;
import com.generic.shared.dto.UserDTO;

@Service("customUserDetailService")
public class CustomUserDetailService implements UserDetailsService{

	private static final Logger LOG = LoggerFactory.getLogger(CustomUserDetailService.class);
	
	@Autowired
	private ICommonService commonService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		LOG.debug("Buscando usuario: " + username);
		
		UserDTO user = commonService.getUserByUsername(username);
		if (user == null){
			LOG.debug("Usuario no encontrado");
			throw new UsernameNotFoundException("Usuario no encontrado en el sistema");
		}else{
			LOG.debug("Objeto no nulo");
		}
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("USER"));
		
		return new User(user.getUsername(), user.getPassword(), authorities);
	}

}

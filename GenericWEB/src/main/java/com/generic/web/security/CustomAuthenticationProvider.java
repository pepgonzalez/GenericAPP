package com.generic.web.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private CustomUserDetailService customUserDetailService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomUserDetailService.class);
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		LOG.debug("Iniciando authenticacion");
		
		//Datos del formulario de login
		String principal = authentication.getName();
		String credentials = (String)authentication.getCredentials();
		
		LOG.debug("Obteniendo informacion de usuario");
		User u = (User) customUserDetailService.loadUserByUsername(principal);
		
		if(u == null){
			LOG.debug("usuario no encontrado");
			throw new BadCredentialsException("usuario no encontrado");
		}
		
		String criptoPass = passwordEncoder.encode(u.getPassword());
		LOG.info("Coded pass: " + criptoPass);
		
		if(passwordEncoder.matches(credentials, passwordEncoder.encode(u.getPassword()))){
			LOG.debug("Login correcto");
			return new UsernamePasswordAuthenticationToken(principal, credentials, u.getAuthorities());
		}else{
			LOG.debug("Credenciales invalidas: " + principal);
			throw new BadCredentialsException("Credenciales incorrectas");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}

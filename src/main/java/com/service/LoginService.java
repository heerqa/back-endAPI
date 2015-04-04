package com.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class LoginService {
	

	public boolean validate(String username, String password){
		
		if (username.toLowerCase().equals("admin") && password.equals("Admin")) {
			return true;	
		}
		else {
			return false;	
		}
	
		
	}


	
}

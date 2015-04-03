package com.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	

	public boolean validate(String username, String password){
		
		if (username.toLowerCase().equals("admin") && password.equals("Admin")) {
			return false;	
		}
		else {
			return false;	
		}
	
		
	}
}

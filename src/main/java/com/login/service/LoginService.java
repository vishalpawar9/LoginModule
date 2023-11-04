package com.login.service;

import org.springframework.stereotype.Service;

import com.login.api.response.LoginApiResponse;
@Service
public interface LoginService {

	 LoginApiResponse authenticateUser(String username, String password);	
}

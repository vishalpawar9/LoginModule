package com.login.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.api.response.LoginApiResponse;
import com.login.controller.LoginController;
import com.login.service.LoginService;
@RestController
public class LoginControllerImpl implements LoginController{

	@Autowired
	private LoginService loginService;
	@Autowired
	public LoginControllerImpl(LoginService loginService)
	{
		this.loginService=loginService;
	}

	@Override 
	 public ResponseEntity<LoginApiResponse> authenticateUser(
	            @RequestParam String username,
	            @RequestParam String password) {
		LoginApiResponse response= loginService.authenticateUser(username, password);
	        return new ResponseEntity<>(response,response.getStatus());
	    }
}

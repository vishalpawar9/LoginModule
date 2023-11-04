package com.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.api.response.LoginApiResponse;

@RestController
@RequestMapping("/api")
public interface LoginController {

	@PostMapping("/authentication")
	ResponseEntity<LoginApiResponse> authenticateUser(String username, String password);
	
}

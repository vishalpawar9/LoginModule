package com.login.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.login.api.response.LoginApiResponse;
import com.login.respository.UserRepository;
import com.login.service.LoginService;
import com.login.user.dto.UserDto;
import com.login.user.mapper.UserMapper;
import com.login.user.master.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	public LoginApiResponse authenticateUser(final String username, final String password) {
	    final Optional<User> userOptional = userRepository.findByUsername(username);
	    final LoginApiResponse response = new LoginApiResponse();

	    if (userOptional.isPresent()) {
	        User user = userOptional.get();
	        if (user.getPassword().equals(password)) {
	            UserDto userDto = userMapper.toDto(user); // Use userMapper.toDto(user) directly
	            response.setUserDto(userDto);
	            response.setMessage("Authentication Successful");
	            response.setStatus(HttpStatus.OK);
	        } else {
	            response.setMessage("Authentication Failed");
	            response.setStatus(HttpStatus.UNAUTHORIZED);
	        }
	    } else {
	        response.setMessage("User not found");
	        response.setStatus(HttpStatus.NOT_FOUND);
	    }

	    return response;
	}
}
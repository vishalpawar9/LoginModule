package com.login.api.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.login.user.dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginApiResponse {

	private UserDto userDto;
	private List<UserDto> users;
	private String message;
	private HttpStatus status;

}

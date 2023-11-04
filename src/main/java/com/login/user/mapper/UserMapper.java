package com.login.user.mapper;

import org.mapstruct.Mapper;

import com.login.user.dto.UserDto;
import com.login.user.master.User;

@Mapper(componentModel="spring")
public interface UserMapper {
	UserDto toDto(User user);
   User toEntity(UserDto userDto);
}


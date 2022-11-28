package com.roy.blog.services;

import java.util.List;

import com.roy.blog.playloads.UserDto;

public interface UserService {

	// register new user
	UserDto registerNewUser(UserDto userDto);

	// delete
	void deleteUser(Integer userId);

	// update
	UserDto updateUser(UserDto userDto, Integer userId);

	// get
	UserDto getUserById(Integer userId);

	// get all
	List<UserDto> getAllUsers();
	

}

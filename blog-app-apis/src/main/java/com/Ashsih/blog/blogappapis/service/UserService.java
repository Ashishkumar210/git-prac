package com.Ashsih.blog.blogappapis.service;

import java.util.List;

import com.Ashsih.blog.blogappapis.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);

	// to update by user id we take below method
	UserDto updateUser(UserDto user, Integer userId);

	UserDto getById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUSer(Integer userId);

}

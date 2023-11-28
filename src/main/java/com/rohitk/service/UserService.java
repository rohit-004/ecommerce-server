package com.rohitk.service;

import java.util.List;

import com.rohitk.exception.UserException;
import com.rohitk.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();
}

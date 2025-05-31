package com.FashNova.service;

import com.FashNova.exception.UserException;
import com.FashNova.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}

package com.proyecto.leandro.service;

import javax.validation.Valid;

import com.proyecto.leandro.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

}

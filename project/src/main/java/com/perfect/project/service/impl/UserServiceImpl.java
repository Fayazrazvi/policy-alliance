package com.perfect.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perfect.project.entity.User;
import com.perfect.project.repository.UserRepository;
import com.perfect.project.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public List<User> getAllCustomers(){
		return userRepository.findAll();
	}

}

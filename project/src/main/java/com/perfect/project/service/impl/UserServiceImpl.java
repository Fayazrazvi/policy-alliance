package com.perfect.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfect.project.controller.UserController;
import com.perfect.project.entity.Payment;
import com.perfect.project.repository.UserRepository;




@Service
public class UserServiceImpl {
	
	
	@Autowired
	UserRepository userRepository;
	private static final Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	

	public Map<String , Object> getAllCustomers(){
		
		Map<String , Object> p=new HashMap<>();
		List<Payment>policy=userRepository.findAll();
		p.put("payment_details", policy);
		return p;
	}
	
	public Map<String, Object> getCustomers() {
		Map<String, Object> r = new HashMap<>();
		List<Map<String, Object>> dataOut = userRepository.display();
		r.put("company_details", dataOut);
		return r;
	}

}

package com.perfect.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfect.project.entity.User;
import com.perfect.project.repository.UserRepository;

import jakarta.transaction.Transactional;




@Service
public class UserServiceImpl {
	
	
	@Autowired
	UserRepository userRepository;
	private static final Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	

	public Map<String , Object> getAllCustomers(){
		
		Map<String , Object> p=new HashMap<>();
		List<User>policy=userRepository.findAll();
		p.put("payment_details", policy);
		return p;
	}
	
	public Map<String, Object> getCustomers( Map<String,Object> user) {
		Map<String, Object> r = new HashMap<>();
		String name = (String) user.get("Name");
	    String mobile_number =(String)user.get("MobileNumber");
	    String age =(String)user.get("Age");
	    String password =(String)user.get("Password");
	    long number2 = Long.valueOf(mobile_number);
	    int age2=Integer.valueOf(age);
	    logger.info(name);
	    logger.info(age);
	    logger.info(password);
	    userRepository.insertCustomer(name, number2, age2,password);
		return r;
	}
	
//	public boolean numberExistsInDatabase(long number) {
//	    List<User> entities = userRepository.findByMyNumber(number);
//	    return !entities.isEmpty();
//	  }
	
	
	
	
	
	public User insertData(User user) {
		return userRepository.save(user);
	}
	
	
//    @Transactional
//	public void addCustomer(String Name, String MobileNumber) {
//        userRepository.insertData(Name, MobileNumber);
//    }
	
	

  

}

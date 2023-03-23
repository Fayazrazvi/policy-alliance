package com.perfect.project.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.perfect.project.entity.User;
import com.perfect.project.repository.UserRepository;
import com.perfect.project.service.impl.UserServiceImpl;

@Controller
//@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String dummy() {
		return "Hiii";
	}

//	public UserController(UserService userService) {
//		super();
//		this.userService = userService;
//	}
	
	
	
	@GetMapping("/users")
	public String listUsers() {
		return "users";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/company")
	public String companies() {
		return "company";
	}
	
	
	@GetMapping("/customers")
	public String customerList() {
		return "customers";
	}

	

	
	@PostMapping("/check")
	@ResponseBody
	public String company()
	{
		Map<String,Object>c = userService.getAllCustomers();
		String data=new Gson().toJson(c);
		
		return data;
	}
	
//	@PostMapping("/outNew")
//	@ResponseBody
//	public String display()
//	{
//		Map<String, Object> on=userService.getCustomers();
//		String data2 =new Gson().toJson(on);
//		return data2;
//	}
	
	
	@PostMapping("/register")
	@ResponseBody
	public String insertData(@RequestBody Map<String,Object> user) {
		Map<String,Object> result=userService.getCustomers(user);
		String data =new Gson().toJson(result);
		logger.info("check32312" + data);
	    return data;
	}
	
	
	@PostMapping("/users")
	@ResponseBody
	public String checkExistCustomer(@RequestBody Map<String,Object> user) {
		Map<String,Object> ce=userService.existCustomer(user);
		String data2 = new Gson().toJson(ce);
		return data2;
	}
	
//	@PostMapping("/register")
//	public String addUser(@PathVariable long mobile_number, Map<String , Object> user)
//	{
//		
//		List<User> list=userService.isUserExistsByMobileNumber(mobile_number);
//		
//		if(list.isEmpty())
//		{
//		return "Oops!  There is already a user registered with the email provided.";
//		
//		}
//		else
//		{
//		userService.getCustomers(user);
//		return"User has been successfully registered.";
//		}
//		
//		
//	}

	  
}

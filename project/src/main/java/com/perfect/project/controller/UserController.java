package com.perfect.project.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
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
	public String companies(Model model ) {
		model.addAttribute("company",userService.getAllCustomers());
		return "company";
	}
	
	
	@GetMapping("/customers")
	public String customerList(Model model) {
		model.addAttribute("customers",userService.getAllCustomers());
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
	public String insertData(@RequestBody Map<String,Object> user) {
	    userService.getCustomers(user);
	    return "users";
	}
	
//	 @PostMapping("/checkNumber")
//	  public Map<String, Boolean> checkNumber(@RequestParam long number) {
//	    boolean exists = userService.numberExistsInDatabase(number);
//	    return Collections.singletonMap("exists", exists);
//	  } 
	  
}

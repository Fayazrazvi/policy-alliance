package com.perfect.project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.perfect.project.service.impl.UserServiceImpl;


@Controller

public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/")
	public String dummy() {
		return "Hiii";
	}

//	public UserController(UserService userService) {
//		super();
//		this.userService = userService;
//	}
	
	
	
	@GetMapping("/users")
	public String listUsers(Model model ) {
		model.addAttribute("users",userService.getAllCustomers());
		return "users";
	}
	
	@GetMapping("/register")
	public String register(Model model ) {
		model.addAttribute("register",userService.getAllCustomers());
		return "register";
	}
	
	@GetMapping("/company")
	public String companies(Model model ) {
		model.addAttribute("company",userService.getAllCustomers());
		return "company";
	}
	
	
//	@GetMapping("/test")
//	public String listUsers(Model model ) {
//		model.addAttribute("test",userService.getAllCustomers());
//		return "test";
//	}
//	
	
	@PostMapping("/check")
	@ResponseBody
	public String company()
	{
		Map<String,Object>c = userService.getAllCustomers();
		String data=new Gson().toJson(c);
		return data;
	}
	
	@PostMapping("/outNew")
	@ResponseBody
	public String display()
	{
		Map<String, Object> on=userService.getCustomers();
		String data2 =new Gson().toJson(on);
		return data2;
	}

	
	
}

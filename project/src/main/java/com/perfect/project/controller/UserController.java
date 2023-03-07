package com.perfect.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfect.project.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	@GetMapping("/")
	public String dummy() {
		return "Hiii";
	}

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@GetMapping("/users")
	public String listUsers(Model model ) {
		model.addAttribute("users",userService.getAllCustomers());
		return "users";
	}

}

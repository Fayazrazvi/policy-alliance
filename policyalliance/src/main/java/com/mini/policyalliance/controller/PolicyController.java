package com.mini.policyalliance.controller;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@RestController
public class PolicyController
{
	@PostMapping("/view")
	public static String display()
	{
		String val="Hi";
		System.out.println(val);
		return val;
	}
}
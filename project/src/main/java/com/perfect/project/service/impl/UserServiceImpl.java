package com.perfect.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.perfect.project.entity.User;
import com.perfect.project.repository.UserRepository;




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
	    
	    List<Map<String,Object>> result =userRepository.checkCustomer(number2);
		if (result.isEmpty()) {
			userRepository.insertCustomer(name, number2, age2,password);
			r.put("Success",result);
		} 
		else {
			logger.info("check");
			r.put("status","201");
			
		}
		return r;
		
	}
	
	
	public Map<String, Object> getHistory(Map<String,Object> user) {
		Map<String, Object> h = new HashMap<>();
		String name = (String) user.get("userName");
		Long mobile_number=Long.valueOf((String)user.get("userMobileNumber"));
	    String payment_via =(String)user.get("PaymentVia");
	    String policy_start_date =(String)user.get("PolicyStartdate");
	    String policy_end_date =(String)user.get("PolicyEndDate");
//	    String premium_amount=(String)user.get("Amount");
	    int premium_amount=Integer.valueOf((String)user.get("Amount"));
	    String company_name = (String) user.get("CompanyName");
	    String plan = (String) user.get("Plan");
//	    int amount=Integer.valueOf(premium_amount);
	    logger.info(name);
	    logger.info("check9"+mobile_number);
	    logger.info(payment_via);
	    logger.info(policy_start_date);
	    logger.info(policy_end_date);
	    //logger.info(premium_amount);
	    logger.info(company_name);
	    logger.info(plan);
	    
	    
	    userRepository.insertPaymentDetails(name,mobile_number, payment_via, policy_start_date,policy_end_date,company_name,plan,premium_amount);
		h.put("status","200");
		return h;
		
	}
	public Map<String, Object> existCustomer( Map<String,Object> user) {
		Map<String, Object> e = new HashMap<>();
		String mobile_number =(String)user.get("MobileNumber");
		long number2 = Long.valueOf(mobile_number);
		String password =(String)user.get("Password");
		Map<String,Object> check =userRepository.loginCustomer(number2, password);
		if(check.isEmpty()) {
			e.put("status", "300");
			
		}
		else {
			e.put("status", "200");
			e.put("name",check.get("name"));
			e.put("mobileNumber",check.get("mobile_number"));
			logger.info("check"+e);
		}
		return e;
	}
	
	public Map<String, Object> getCustomer(@RequestBody Map<String,Object> user){
		Map<String,Object> resultData= new HashMap<>();
		String mobile_number =(String)user.get("MobileNumber");
		long number2 = Long.valueOf(mobile_number);
		List<Map<String, Object>> customerDetail=userRepository.getCustomerDetails(number2);
		logger.info("individual customer"+customerDetail);
		if(customerDetail.isEmpty()) {
			resultData.put("status","200");
			
		}
		else {
			resultData.put("success", customerDetail);
		}
		return resultData;
	
	}
	
	
	public Map<String, Object> getAllCompany() {
		List<Map<String, Object>> allCompanies=userRepository.getCompanyDetails();
		Map<String,Object> resultData= new HashMap<>();
		resultData.put("company", allCompanies);
		return resultData;
		}
	
	
	public Map<String , Object> customerDetails(){
		Map<String,Object> resultData= new HashMap<>();
		List<Map<String, Object>> customerDetail=userRepository.individualCustomerDetails();
		resultData.put("customer", customerDetail);
		return resultData;
	}

}

package com.perfect.project.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "company_details")
public class Company {
	@Column(name = "user_id")
    private int user_id;
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int company_id;
	
	
	@Column(name = "company_name")
    private String company_name;
	
	
	@Column(name = "premium_amount")
	private int premium_amount;
	
	 public Company() {

	    }
	 public Company(int user_id , int company_id ,String company_name , int premium_amount) {
		 this.user_id=user_id;
		 this.company_id=company_id;
		 this.company_name=company_name;
		 this.premium_amount=premium_amount;
	 }
	 

	    public int getcompany_id() {
	        return company_id;
	    }
	    
	    public void setcompany_id(int company_id) {
	        this.company_id = company_id;
	    }
	    
	    public int getuser_id() {
	        return user_id;
	    }

	    public void setCust_id(int user_id) {
	        this.user_id = user_id;
	    }
	    
	    public String getcompany_name() {
	        return company_name;
	    }

	    public void setcompany_name(String company_name) {
	        this.company_name = company_name;
	    }
	    
	    public int getpremium_amount() {
	        return premium_amount;
	    }

	    public void setpremium_amount(int premium_amount) {
	        this.premium_amount = premium_amount;
	    }



}

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
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int company_id;
	
	@Column(name = "star_rating")
    private int star_rating;
	
	
	@Column(name = "company_name")
    private String company_name;
	
	
	@Column(name = "premium_amount")
	private int premium_amount;
	
	
	@Column(name="company_image")
	private String company_image;
	
	@Column(name="plan")
	private String plan;
	
	
	public Company() {

	    }
	 public Company(int star_rating , int company_id ,String company_name , int premium_amount, String company_image ,  String plan) {
		 this.star_rating=star_rating;
		 this.company_id=company_id;
		 this.company_name=company_name;
		 this.premium_amount=premium_amount;
		 this.company_image=company_image;
		 this.plan=plan;
	 }
	 

	    public int getcompany_id() {
	        return company_id;
	    }
	    
	    public void setcompany_id(int company_id) {
	        this.company_id = company_id;
	    }
	    
	    public int getstar_rating() {
	        return star_rating;
	    }

	    public void setCust_id(int star_rating) {
	        this.star_rating = star_rating;
	    }
	    
	    public String getPlan() {
			return plan;
		}
		public void setPlan(String plan) {
			this.plan = plan;
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
	    
	    
	    public String getCompany_image() {
			return company_image;
		}
		public void setCompany_image(String company_image) {
			this.company_image = company_image;
		}



}

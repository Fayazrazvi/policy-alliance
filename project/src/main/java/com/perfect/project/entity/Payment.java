package com.perfect.project.entity;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "payment_details")
public class Payment {
	
	 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int payment_id;
    
    @Column(name = "payment_via")
    private String payment_via;
    
    @Column(name = "policy_start_date")
    private String policy_start_date;
    
    @Column(name = "policy_end_date")
    private String policy_end_date;
    
    @Column(name = "user_id")
    private int user_id;
    
    @Column(name = "company_id")
    private int company_id;
    
    @Column(name = "mobile_number")
    private long mobile_number;
    
   
    
   

	public Payment() {
    	
    }
     
 public Payment(int payment_id , String payment_via , String policy_start_date , String policy_end_date,int user_id,int company_id,long mobile_number) {
	 this.payment_id=payment_id;
	 this.payment_via=payment_via;
	 this.policy_start_date=policy_start_date;
	 this.policy_end_date=policy_end_date;
	 this.user_id=user_id;
	 this.company_id=company_id;
	 this.mobile_number=mobile_number;
    	
    }
 
 public String getPayment_via() {
		return payment_via;
	}

	public void setPayment_via(String payment_via) {
		this.payment_via = payment_via;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	

	public String getPolicy_start_date() {
		return policy_start_date;
	}

	public void setPolicy_start_date(String policy_start_date) {
		this.policy_start_date = policy_start_date;
	}

	public String getPolicy_end_date() {
		return policy_end_date;
	}

	public void setPolicy_end_date(String policy_end_date) {
		this.policy_end_date = policy_end_date;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

}

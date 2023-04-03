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
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "company_name")
    private String company_name;
    
    @Column(name = "mobile_number")
    private long mobile_number;
    
   
    
   

	public Payment() {
    	
    }
     
 public Payment(int payment_id , String payment_via , String policy_start_date , String policy_end_date,String name,String company_name,long mobile_number) {
	 this.payment_id=payment_id;
	 this.payment_via=payment_via;
	 this.policy_start_date=policy_start_date;
	 this.policy_end_date=policy_end_date;
	 this.name=name;
	 this.company_name=company_name;
	 this.mobile_number=mobile_number;
    	
    }
 
	
	public String getPayment_via() {
			return payment_via;
		}

	public void setPayment_via(String payment_via) {
		this.payment_via = payment_via;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany_Name() {
		return company_name;
	}

	public void setCompany_Name(String company_name) {
		this.company_name = company_name;
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

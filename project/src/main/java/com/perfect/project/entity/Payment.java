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
    
    @Column(name = "pay_via")
    private String pay_via;
    
    @Column(name = "policy_start_date")
    private String policy_start_date;
    
    @Column(name = "policy_end_date")
    private String policy_end_date;
    
    public Payment() {
    	
    }
     
 public Payment(int payment_id , String pay_vai , String policy_start_date , String policy_end_date) {
	 this.payment_id=payment_id;
	 this.pay_via=pay_via;
	 this.policy_start_date=policy_start_date;
	 this.policy_end_date=policy_end_date;
    	
    }

	public String getPay_via() {
		return pay_via;
	}

	public void setPay_via(String pay_via) {
		this.pay_via = pay_via;
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

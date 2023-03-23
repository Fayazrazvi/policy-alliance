package com.perfect.project.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_details")


public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "user_id")
	private int user_id;
	 
	 
	 @Column(name = "name")
	 private String name;
	 
	 @Column(name = "age")
	 private int age;
	 
	 @Column(name = "mobile_number")
	 private long mobile_number;
	 
	 
	 @Column(name = "password")
	 private String password;
	 
	 public User() {
	    } 
	 public User(int user_id , String name ,int age , long mobile_number,String password) {
		 this.user_id = user_id;
		 this.name = name;
		 this.age = age;
		 this.mobile_number=mobile_number;
		 this.password=password;
	 }
	   
		public int getuser_id() {
	        return user_id;
	    }
	    public void setuser_id(int user_id) {
	        this.user_id = user_id;
	    }

	    public String getname() {
	        return name;
	    }

	    public void setname(String name) {
	        this.name = name;
	    }

	    public int getage() {
	        return  age;
	    }

	    public void setage(int age) {
	        this.age = age;
	    }

	    public long getmobile_number() {
	        return mobile_number;
	    }

	    public void setmobile_number(long mobile_number) {
	        this.mobile_number = mobile_number;
	    }

	    public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	    


}

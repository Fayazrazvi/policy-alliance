package com.perfect.project.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.perfect.project.entity.Company;
import com.perfect.project.entity.Payment;
import com.perfect.project.entity.User;



public interface UserRepository extends JpaRepository<Payment , Integer> {
	
//	@Query(nativeQuery=true,value="Select * from user_details")
//	public List<Map<String ,Object>> out ();
	

}

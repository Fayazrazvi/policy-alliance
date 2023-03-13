package com.perfect.project.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.perfect.project.entity.Payment;


@Repository
@Component
public interface UserRepository extends JpaRepository<Payment , Integer> {
	
	@Query(nativeQuery=true,value="Select * from user_details where mobile_number='7010105285'")
	public List<Map<String ,Object>> display();
	

}

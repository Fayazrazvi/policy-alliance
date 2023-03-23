package com.perfect.project.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.perfect.project.entity.User;

import jakarta.transaction.Transactional;


@Repository
@Component
public interface UserRepository extends JpaRepository<User , Integer> {
	
	@Query(nativeQuery=true,value="Select * from user_details where mobile_number='7010105285'")
	public List<Map<String ,Object>> display();
	
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO user_details(name, mobile_number,age,password) VALUES(?1,?2,?3,?4)", nativeQuery = true)
    void insertCustomer( String name,  long mobile_number, Integer age,String password);
    
    
    @Query(value="select * from user_details where mobile_number=?1",nativeQuery=true)
    public List<Map<String , Object>> checkCustomer(long mobile_number);
    
    @Query(value="select * from user_details where mobile_number=?1 && password=?2",nativeQuery=true)
    public List<Map<String , Object>> loginCustomer(long mobile_number , String password);


}

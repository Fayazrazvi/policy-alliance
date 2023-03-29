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
    
    @Query(value="select name,mobile_number from user_details where mobile_number=?1 && password=?2",nativeQuery=true)
    public Map<String , Object> loginCustomer(long mobile_number , String password);
    
    @Query(nativeQuery = true,value="Select * from company_details ")
    public List<Map<String,Object>> getCompanyDetails();
    
    @Query(nativeQuery = true,value="Select * from payment_details where mobile_number=?1")
    public List<Map<String,Object>> getCustomerDetails(long mobile_number);
    
    @Query(nativeQuery = true,value="Select * from payment_details ")
    public List<Map<String,Object>> individualCustomerDetails();
    
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO payment_details(name,mobile_number,payment_via,policy_start_date,policy_end_date,company_name,plan,premium_amount) VALUES(?1,?2,?3,?4,?5,?6,?7,?8)", nativeQuery = true)
    void insertPaymentDetails( String name,long mobile_number, String payment_via, String policy_start_date,String policy_end_date,String company_name,String plan,int premium_amount);

}

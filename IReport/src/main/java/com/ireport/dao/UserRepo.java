package com.ireport.dao;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ireport.model.Employees;
import com.ireport.model.User;



public interface UserRepo extends JpaRepository<User, String>
{	
	User findByUname(String uname);
	
	@Query("select email from User where uname=:uname")
	String findEmailByUname(@Param("uname") String uname);
	
	@Query("from Employees")
	List<Employees> createQuery();
	
	
	
}

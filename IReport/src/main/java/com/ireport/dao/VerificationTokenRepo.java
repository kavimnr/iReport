package com.ireport.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ireport.model.VerificationToken;


public interface VerificationTokenRepo extends JpaRepository<VerificationToken, Integer> 
{
	
	@Query("select token from VerificationToken where uname = :uname")
	String findByUname(@Param("uname") String uname);
}
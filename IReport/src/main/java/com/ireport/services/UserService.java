package com.ireport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ireport.dao.VerificationTokenRepo;
import com.ireport.model.VerificationToken;

@Component
public class UserService 
{
	@Autowired
	TokenGenerator tokenGenerator;
	@Autowired
	VerificationTokenRepo tokenRepo;
	
	public String createVerificationToken(String uname)
	{
		String token=tokenGenerator.getToken();
		VerificationToken verificationToken=new VerificationToken(token,uname);
		tokenRepo.save(verificationToken);
		return token;
	}
}

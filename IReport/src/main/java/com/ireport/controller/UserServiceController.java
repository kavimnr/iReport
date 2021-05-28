package com.ireport.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ireport.dao.UserRepo;
import com.ireport.dao.VerificationTokenRepo;
import com.ireport.mail.EmailService;
import com.ireport.model.User;
import com.ireport.services.UserService;

@Controller
public class UserServiceController 
{
	@Autowired
	UserService userService;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	VerificationTokenRepo tokenRepo;
	
	@RequestMapping("/forgotPassword")
	String forgotPassword(@RequestParam("uname") String uname,HttpServletRequest request)
	{
		request.getSession().setAttribute("uname", uname);
		String token=userService.createVerificationToken(uname);
		String to=userRepo.findEmailByUname(uname);
		System.out.println("In forgot "+to);
		emailService.sendSimpleMessage(to, "Reset Password Request-Verification Token","Hi,\n\nPlease Enter the below Verification token in your browser\n\n Token : "+token+"\n\nThanks and Regards,\nTeam IReport");
		request.getSession().setAttribute("token", token);
		return "verify-token.jsp";
	}
	@RequestMapping("/verifyToken")
	String verifyToken(@RequestParam("token") String token,@RequestParam("uname") String uname,HttpServletRequest request)
	{
		
		String generatedToken=tokenRepo.findByUname(uname);
		request.getSession().setAttribute("uname", uname);
		if(token.equals(generatedToken))
		{
			return "reset-forgot-password.jsp";
		}
		else
		{
			return "error-verify-token.jsp";
		}
	}
	@RequestMapping("/resetForgotPassword")
	String resetForgotPassword(@RequestParam("newPassword") String newPassword,@RequestParam("confirmPassword") String confirmPassword,@RequestParam("uname") String uname,HttpServletRequest request)
	{
		request.getSession().setAttribute("uname", uname);
		if(newPassword.equals(confirmPassword))
		{
			User user=userRepo.findByUname(uname);
			user.setPassword(newPassword);
			userRepo.save(user);
			return "success.jsp";
		}
		else
		{
			return "error-forgot-password.jsp";
		}
	}
}

package com.ireport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ireport.dao.RoleRepo;
import com.ireport.dao.UserRepo;
import com.ireport.model.Role;
import com.ireport.model.User;

@Controller
public class AdminController 
{
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RoleRepo roleRepo;
	
	@Autowired
	User user;
	
	@Autowired
	Role role;
	
	@RequestMapping("/createUser")
	String createUser(@RequestParam("uname") String uname)
	{
		user.setUname(uname);
		role.setUname(uname);
		
		user.setPassword("Test@123");
		role.setRole("member");
		
		userRepo.save(user);
		roleRepo.save(role);
		
		return "success.jsp";
	}
	@RequestMapping("/deleteUser")
	String deleteUser(@RequestParam("uname") String uname)
	{
		userRepo.deleteById(uname);
		
		return "success.jsp";
	}
	@RequestMapping("/modifyUser")
	String modifyUser(@RequestParam("uname") String uname,@RequestParam("role") String role)
	{
		Role user=roleRepo.findByUname(uname);
		user.setRole(role);
		roleRepo.save(user);
		return "success.jsp";
	}
	@RequestMapping("/resetPassword")
	String resetPassword(@RequestParam("uname") String uname,@RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword,@RequestParam("confirmPassword") String confirmPassword)
	{
		if(!newPassword.equals(confirmPassword))
			return "New password not matched with confirm password. Go back and retry.!";
		else
		{
			User user=userRepo.findByUname(uname);
			user.setPassword(newPassword);
			userRepo.save(user);
			return "success.jsp";
		}
	}
}

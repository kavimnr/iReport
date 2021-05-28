package com.ireport.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ireport.dao.UserRepo;
import com.ireport.model.User;

@Controller
public class LoginController 
{
	@Autowired
	UserRepo repo;
	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	@RequestMapping(value="/login") //,method = RequestMethod.POST
	public String login(User user)
	{
		User isUser=repo.findByUname(user.getUname());
		if(isUser==null||!(isUser.getPassword().equals(user.getPassword())))
	    {
	    	return "login-error.jsp";
	    }
	    else
	    {
	    	return "admin-actions.html";
	    }
		
	}
}

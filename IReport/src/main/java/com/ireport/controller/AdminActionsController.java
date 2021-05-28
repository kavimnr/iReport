package com.ireport.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminActionsController 
{
	@RequestMapping("/home")
	String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/create")
	String create()
	{
		return "create-user.jsp";
	}
	
	@RequestMapping("/delete")
	String delete()
	{
		return "delete-user.jsp";
	}
	
	@RequestMapping("/modify")
	String modify()
	{
		return "modify-user.jsp";
	}
	@RequestMapping("/reset")
	String reset()
	{
		return "reset-password.jsp";
	}
	@RequestMapping("/forgot")
	String forgot()
	{
		return "forgot-password.jsp";
	}
	@RequestMapping("/backHome")
	String backHome()
	{
		return "admin-actions.html";
	}
}

package com.ireport.controller;

import java.io.*;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

import org.springframework.core.io.Resource;
import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ireport.mail.EmailService;
import com.ireport.services.ReportGenerator;
import com.ireport.services.UserService;

@Controller
public class HomeController 
{
	
	@Autowired
	ReportGenerator reportGenerator;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/download")
	public ResponseEntity<Resource> downloadFileFromLocal() {
		Path path = Paths.get("D:\\reports\\employees.csv");
		Resource resource = null;
		try {
			resource = (Resource) new UrlResource(path.toUri());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/octet-stream")).header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + ((UrlResource) resource).getFilename() + "\"").body(resource);
	}
	@RequestMapping("/sendReport")
	String sendReport(@RequestParam("submit") String submit) throws SQLException, IOException, MessagingException
	{
		if(submit.equals("Send"))
		{
			reportGenerator.generateReport();
			emailService.sendMessageWithAttachment("kaviyarasan1098@gmail.com", "Employee List", "Hi,\n\nPlease find the attached Report for your reference.\n\nThanks and Regards,\nTeam IReport\n","D:\\reports\\employees.csv");
			return "mail-success.jsp";
		}
		else if(submit.equals("Download"))
		{
			reportGenerator.generateReport();			  
			return "redirect:/download";
		}
		else
		{
			return "error.jsp";
		}
	}
}

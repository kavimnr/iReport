package com.ireport.mail;

import javax.mail.MessagingException;

import org.springframework.stereotype.Component;

@Component
public interface EmailService 
{
	public void sendSimpleMessage(String to, String subject, String text);
	public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment) throws MessagingException;
}

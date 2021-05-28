package com.ireport.services;

import org.springframework.stereotype.Component;

@Component
public class TokenGenerator 
{
	public String getToken()
	{
		String string="0123456789";
		int i=0;
		String token="";
		while(i<6)
		{
			int index=(int)(Math.random()*9);
			i++;
			token=token+string.charAt(index);
		}
		return token;
	}
}

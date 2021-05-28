package com.ireport.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ireport.dao.UserRepo;
import com.ireport.model.Employees;

@Component
public class ReportGenerator 
{
	@Autowired
	UserRepo userRepo;
	
	public void generateReport() throws IOException
	{
		List<Employees> result=userRepo.createQuery();
		File file=new File("D:\\reports\\employees.csv");
		if(!file.exists())
			file.createNewFile();
		BufferedWriter bufw=new BufferedWriter(new FileWriter(file));
		bufw.write("Employee ID,Name,City,Email,Mobile,Age,Salary\n");
		Iterator<Employees> i=result.iterator();
		while(i.hasNext())
		{
			Employees e=i.next();
			bufw.write(e.getEmp_id()+",");
			bufw.write(e.getEmp_name()+",");
			bufw.write(e.getCity()+",");
			bufw.write(e.getEmail()+",");
			bufw.write(e.getMobile()+",");
			bufw.write(e.getAge()+",");
			bufw.write(e.getSalary()+"\n");
		}
		bufw.close();
	}
}

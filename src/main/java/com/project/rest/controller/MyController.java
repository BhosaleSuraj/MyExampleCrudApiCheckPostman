package com.project.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.rest.Services.CourcesServices;
import com.project.rest.entity.Cource;

@RestController
public class MyController {
	@Autowired
	private CourcesServices courcesServices;
	
	
	@GetMapping("/home")
     public String home()
	{
		return "this is my first rest api";
	}
   
	
	@GetMapping("/cources")
	public List<Cource> getCource()
	{
		return this.courcesServices.getCource(); 
	}
	
	@GetMapping("/cources/{courseId}")
	public Cource getCourses( @PathVariable String courseId)
	{
		
		return this.courcesServices.getCourses(Long.parseLong(courseId));
		
	}
	
	@PostMapping("/cources")
	public Cource addCourses(@RequestBody Cource cource)
	{
		return this.courcesServices.addCourses(cource);	
	}
	
}


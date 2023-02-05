package com.project.rest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.rest.entity.Cource;

@Service
public class CourceImplementation implements CourcesServices {

	List<Cource> list= new ArrayList<>();
	
	Cource c=new Cource(123, "qwertwdef","dsfguhijkoplghjk");
	
	public CourceImplementation()
	{
		list.add (new Cource(123,"java","Practicle of rest api"));
		list.add(new Cource(456,"python","python rest api") );
		list.add(c);
	}
	
	
	@Override
	public List<Cource> getCource() {
		// TODO Auto-generated method stub
		
		
		
		return list;
	}


	@Override
	public Cource getCourses(long courseId) {
		// TODO Auto-generated method stub
		
		
		Cource c=null;
		
		for(Cource course:list)
		{
			if(course.getId() == courseId)
			{   
				c=course;
				break;
			}
		}
		return c;
		
		
	}


	@Override
	public Cource addCourses(Cource cource) {
		// TODO Auto-generated method stub
		
		list.add(cource);
		return cource;
	}
  
	
	
	// this is get one id
	
	

	

}

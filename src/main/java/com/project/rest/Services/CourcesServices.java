package com.project.rest.Services;

import java.util.List;

import com.project.rest.entity.Cource;

public interface CourcesServices {
	
	public List<Cource> getCource();
	public Cource getCourses(long  courseId);
    public Cource  addCourses(Cource cource);
}

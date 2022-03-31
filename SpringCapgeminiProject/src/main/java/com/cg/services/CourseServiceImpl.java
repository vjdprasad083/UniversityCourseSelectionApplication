package com.cg.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Course;
import com.cg.repos.CourseRepo;
@Service
public class CourseServiceImpl implements CourseService {
	
	CourseRepo repo;

	@Override
	@Transactional
	public Course addCourse(Course course) {
		Course courseRef=repo.save(course);
		return courseRef;
	}

	@Override
	@Transactional
	public Course updateCourse(Course course) {
		Course courseRef=repo.save(course);
		return courseRef;
	}

	@Override
	@Transactional
	public void removeCourse(int courseId) {
		repo.deleteById(courseId);
	}

	@Override
	@Transactional
	public Course viewCourse(int courseId) {
		Course courseRef=repo.getById(courseId);
		return courseRef;
	}
	

	@Override
	@Transactional
	public List<Course> viewAllCourses() {
		List<Course> courseRef=repo.findAll();
		return courseRef;
	}

}

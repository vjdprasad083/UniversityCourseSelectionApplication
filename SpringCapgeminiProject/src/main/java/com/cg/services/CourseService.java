package com.cg.services;

import java.util.List;
import com.cg.entities.Course;

public interface CourseService {
	
	Course addCourse(Course course);
	Course updateCourse(Course course);
	void removeCourse(int courseId);
	Course viewCourse(int courseId);
	List<Course> viewAllCourses();
}

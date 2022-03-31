package service;

import java.util.List;

import javax.persistence.EntityTransaction;

import repo.CourseRepository;
import repo.CourseRepositoryImp;
import util.JPAUtil;
import entities.Course;

public class CourseServiceImp implements CourseService {
	CourseRepository repo;
	EntityTransaction transaction;
	public CourseServiceImp() {
		repo = new CourseRepositoryImp();
		transaction = JPAUtil.getEntityManager().getTransaction();
		
	}
	
	@Override
	public Course addCourse(Course course) {
		transaction.begin();
		repo.addCourse(course);
		transaction.commit();
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		transaction.begin();
		repo.addCourse(course);
		transaction.commit();
		return course;
	}
	@Override
	public void removeCourse(int courseId) {
		transaction.begin();
		repo.removeCourse(courseId);
		transaction.commit();
	}
	@Override
	public Course viewCourse(int courseId) {
		Course course=null;
		transaction.begin();
		course =repo.viewCourse(courseId);
		transaction.commit();
		return course;
	}
	@Override
	public List<Course> viewAllCourseService() {
		List<Course> course=null;
		transaction.begin();
		course =repo.viewAllCourseList();
		transaction.commit();
		return course;
	}
	

}

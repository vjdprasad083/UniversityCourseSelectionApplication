package repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.Course;
import util.JPAUtil;

public class CourseRepositoryImp implements CourseRepository {
	EntityManager entityManager;
	Course course;
	public CourseRepositoryImp(){
	entityManager= JPAUtil.getEntityManager();
	}

	@Override
	public Course addCourse(Course course) {
		entityManager.persist(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		entityManager.merge(course);
		return course;
	}

	@Override
	public void removeCourse(int courseId) {
		entityManager.remove(courseId);
		
	}

	@Override
	public Course viewCourse(int courseId) {
		course=entityManager.find(Course.class, courseId);
		return course;
		
	}

	@Override
	public List<Course> viewAllCourseList() {
		 String str="SELECT course FROM Course course";
		 TypedQuery<Course> query = entityManager.createQuery(str, Course.class);
			return query.getResultList();
		}
	}



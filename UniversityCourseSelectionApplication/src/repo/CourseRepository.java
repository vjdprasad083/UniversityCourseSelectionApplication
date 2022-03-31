package repo;

import java.util.List;

import entities.Course;

public interface CourseRepository {
	Course addCourse(Course course);
	Course updateCourse(Course course);
	void removeCourse(int courseId);
	Course viewCourse(int courseId);
	List<Course> viewAllCourseList();
}

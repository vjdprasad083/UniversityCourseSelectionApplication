package service;

import java.util.List;
import entities.Course;
public interface CourseService {
Course addCourse(Course course);
Course updateCourse(Course course);
void removeCourse(int courseId);
Course viewCourse(int courseId);
List<Course> viewAllCourseService();
}

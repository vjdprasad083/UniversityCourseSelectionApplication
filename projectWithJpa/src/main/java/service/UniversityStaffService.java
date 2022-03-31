package service;

import java.util.List;

import entities.Course;
import entities.UniversityStaffMember;
public interface UniversityStaffService {
UniversityStaffMember addStaff(UniversityStaffMember uniStaff);
UniversityStaffMember updateStaff(UniversityStaffMember uniStaff);
UniversityStaffMember viewStaff(int staffId);
void removeStaff(int staffId);
List<UniversityStaffMember> viewAllStaffs();
Course addCourse(Course course);
Course updateCourse(Course course);
void removeCourse(int courseId);

}
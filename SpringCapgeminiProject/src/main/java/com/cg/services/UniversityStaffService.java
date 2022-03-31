package com.cg.services;

import java.util.List;

import com.cg.entities.Course;
import com.cg.entities.UniversityStaffMember;

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
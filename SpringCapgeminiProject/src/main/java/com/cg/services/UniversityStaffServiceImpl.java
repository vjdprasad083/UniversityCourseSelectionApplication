package com.cg.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Course;
import com.cg.entities.UniversityStaffMember;
import com.cg.repos.CourseRepo;
import com.cg.repos.UniversityStaffMemberRepo;
@Service
public class UniversityStaffServiceImpl implements UniversityStaffService {
	
	UniversityStaffMemberRepo repo;
	CourseRepo courseRepo;

	@Override
	@Transactional
	public UniversityStaffMember addStaff(UniversityStaffMember uniStaff) {
		UniversityStaffMember staff=repo.save(uniStaff);
		return staff;
	}

	@Override
	@Transactional
	public UniversityStaffMember updateStaff(UniversityStaffMember uniStaff) {
		UniversityStaffMember staff=repo.save(uniStaff);
		return staff;
	}

	@Override
	@Transactional
	public UniversityStaffMember viewStaff(int staffId) {
		UniversityStaffMember staff=repo.getById(staffId);
		return staff;
	}

	@Override
	@Transactional
	public void removeStaff(int staffId) {
		repo.deleteById(staffId);

	}

	@Override
	@Transactional
	public List<UniversityStaffMember> viewAllStaffs() {
		List<UniversityStaffMember> staff=repo.findAll();
		return staff;
	}

	@Override
	@Transactional
	public Course addCourse(Course course) {
		Course courseRef=courseRepo.save(course);
		return courseRef;
	}

	@Override
	@Transactional
	public Course updateCourse(Course course) {
		Course courseRef=courseRepo.save(course);
		return courseRef;
	}

	@Override
	@Transactional
	public void removeCourse(int courseId) {
		 courseRepo.deleteById(courseId);

	}

}

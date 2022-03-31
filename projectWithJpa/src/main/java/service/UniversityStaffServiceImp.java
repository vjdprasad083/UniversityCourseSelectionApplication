package service;

import java.util.List;

import javax.persistence.EntityTransaction;

import entities.Course;
import entities.UniversityStaffMember;
import repo.CourseRepository;
import repo.CourseRepositoryImp;
import repo.UniversityStaffRepository;
import repo.UniversityStaffRepositoryImp;
import util.JPAUtil;

public class UniversityStaffServiceImp implements UniversityStaffService {
	UniversityStaffRepository repo;
	CourseRepository courseRepo;
	EntityTransaction transaction;
	public UniversityStaffServiceImp() {
		repo = new UniversityStaffRepositoryImp();
		courseRepo=new CourseRepositoryImp();
		transaction = JPAUtil.getEntityManager().getTransaction();
		
	}
	

	@Override
	public UniversityStaffMember addStaff(UniversityStaffMember uniStaff) {
		transaction.begin();
		repo.addStaff(uniStaff);
		transaction.commit();
		return uniStaff;
	}

	@Override
	public UniversityStaffMember updateStaff(UniversityStaffMember uniStaff) {
		transaction.begin();
		repo.updateStaff(uniStaff);
		transaction.commit();
		return uniStaff;
	}

	@Override
	public UniversityStaffMember viewStaff(int staffId) {
		UniversityStaffMember uniStaff=null;
		transaction.begin();
		uniStaff=repo.viewStaff(staffId);
		transaction.commit();
		return uniStaff;
	}

	@Override
	public void removeStaff(int staffId) {
		transaction.begin();
		repo.removeStaff(staffId);
		transaction.commit();
	}

	@Override
	public List<UniversityStaffMember> viewAllStaffs() {
		List<UniversityStaffMember> uniStaff=null;
		transaction.begin();
		uniStaff =repo.viewAllStaffs();
		transaction.commit();
		return uniStaff;
	}

	@Override
	public Course addCourse(Course course) {
		transaction.begin();
		courseRepo.addCourse(course);
		transaction.commit();
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		transaction.begin();
		courseRepo.updateCourse(course);
		transaction.commit();
		return course;
	}

	@Override
	public void removeCourse(int courseId) {
		
		transaction.begin();
		courseRepo.removeCourse(courseId);
		transaction.commit();
	}

}

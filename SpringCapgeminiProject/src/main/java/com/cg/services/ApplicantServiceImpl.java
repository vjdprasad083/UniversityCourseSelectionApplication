package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Applicant;
import com.cg.repos.ApplicantRepo;
@Service
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	ApplicantRepo repo;

	
	@Transactional
	public Applicant addApplicant(Applicant applicant) {
		Applicant app=repo.save(applicant);
		return app;
	}


	@Transactional
	public Applicant updateApplicant(Applicant applicant) {
		Applicant app=repo.save(applicant);
		
		return app;
	}

	@Override
	@Transactional
	public void deleteApplicant(int applicantId) {
		repo.deleteById(applicantId);

	}

	
	@Transactional
	public Applicant veiwApplicant(int applicantId) {
		Applicant app=repo.getById(applicantId);
		return app;
	}
	@Transactional
	public List<Applicant> veiwAllApplicantsByStatus(String status){
		List<Applicant> app=repo.FindAllByApplicantsStatus(status);
		return app;
	}

	@Transactional
	public List<Applicant> FindAllByCourse(int courseId) {
		List<Applicant> app=repo.FindAllByCourse(courseId);
		return app;
	}

}

package service;

import java.util.List;

//import java.util.List;

import javax.persistence.EntityTransaction;

import repo.ApplicantRepositoryImp;
import entities.Applicant;

import repo.ApplicantRepository;
import util.JPAUtil;

public class ApplicantServiceImpl implements ApplicantService {
	private ApplicantRepository repo;

	private EntityTransaction transaction;
	
	public ApplicantServiceImpl() {
		repo = new ApplicantRepositoryImp();
		transaction = JPAUtil.getEntityManager().getTransaction();
	}

	@Override
	public Applicant addApplicant(Applicant applicant) {
		transaction.begin();
		repo.addApplicant(applicant);
		transaction.commit();
		return applicant;
	}

	@Override
	public Applicant updateApplicant(Applicant applicant) {
		transaction.begin();
		repo.updateApplicant(applicant);
		transaction.commit();
		return applicant;
		
		
	}

	
	public void deleteApplicant(int applicantId) {
		
		transaction.begin();
		repo.deleteApplicant(applicantId);
		transaction.commit();
		
	}
	
	public Applicant veiwApplicant(int applicantId) {
		Applicant applicant = null;
		transaction.begin();
		applicant = repo.veiwApplicant(applicantId);
		transaction.commit();
		return applicant;
	}


	@Override
	public List<Applicant> veiwAllApplicantsByStatus(String status) {
		List<Applicant> applicant=null;
		transaction.begin();
		applicant = repo.veiwAllApplicantsByStatus(status);
		transaction.commit();
		return applicant;
	}

}

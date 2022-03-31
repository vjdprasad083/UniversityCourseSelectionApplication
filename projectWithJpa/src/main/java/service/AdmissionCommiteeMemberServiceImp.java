package service;

import java.util.List;

import javax.persistence.EntityTransaction;

import entities.Admission;
import entities.AdmissionCommiteeMember;
import entities.Applicant;
import repo.AdmissionCommiteeMemberRepository;
import repo.AdmissioncommiteeMemberRepositoryImp;
import util.JPAUtil;

public class AdmissionCommiteeMemberServiceImp implements AdmissionCommiteeMemberService {
	private AdmissionCommiteeMemberRepository repo;
	private EntityTransaction transaction;
	public AdmissionCommiteeMemberServiceImp() {
		repo=new AdmissioncommiteeMemberRepositoryImp();
		transaction=JPAUtil.getEntityManager().getTransaction();
	}

	@Override
	public AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember admiComm) {
		transaction.begin();
		repo.addCommiteeMember(admiComm);
		transaction.commit();
		return admiComm;
	}

	@Override
	public AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember admiComm) {
		transaction.begin();
		repo.updateCommiteeMember(admiComm);
		transaction.commit();
		return admiComm;
	}

	@Override
	public AdmissionCommiteeMember viewCommiteeMember(int adminId) {
		AdmissionCommiteeMember admincomm=null;
		transaction.begin();
		admincomm=repo.viewCommiteeMember(adminId);
		transaction.commit();
		return admincomm;
	}

	@Override
	public void removeCommiteeMember(int adminId) {
		transaction.begin();
		repo.removeCommiteeMember(adminId);
		transaction.commit();

	}

	@Override
	public List<AdmissionCommiteeMember> veiwAllCommiteeMember() {
		List<AdmissionCommiteeMember> adminCommiteeMember;
		transaction.begin();
		adminCommiteeMember=repo.veiwAllCommiteeMember();
		transaction.commit();
		return adminCommiteeMember;
	}
	@Override
	public void provideAdmissionResult(Applicant applicant,Admission admin) {
		
	}

}

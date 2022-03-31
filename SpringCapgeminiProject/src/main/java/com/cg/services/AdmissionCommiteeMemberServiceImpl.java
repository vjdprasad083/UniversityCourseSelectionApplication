package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Admission;
import com.cg.entities.AdmissionCommiteeMember;
import com.cg.entities.Applicant;
import com.cg.repos.AdmissionCommiteeMemberRepo;
@Service
public class AdmissionCommiteeMemberServiceImpl implements AdmissionCommiteeMemberService {
	@Autowired
	AdmissionCommiteeMemberRepo repo;

	@Override
	@Transactional
	public AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember admiComm) {
		AdmissionCommiteeMember adminCommitee=repo.save(admiComm);
		return adminCommitee;
	}

	@Override
	@Transactional
	public AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember admiComm) {
		AdmissionCommiteeMember adminCommitee=repo.save(admiComm);
		return adminCommitee;
	}

	@Override
	@Transactional
	public AdmissionCommiteeMember viewCommiteeMember(int adminId) {
		AdmissionCommiteeMember adminCommitee=repo.getById(adminId);
		return adminCommitee;
	}

	@Override
	@Transactional
	public void removeCommiteeMember(int adminId) {
		repo.deleteById(adminId);

	}

	@Override
	@Transactional
	public List<AdmissionCommiteeMember> veiwAllCommiteeMember() {
		List<AdmissionCommiteeMember> adminCommitee= repo.findAll();
		return adminCommitee;
	}

	@Override
	@Transactional
	public void provideAdmissionResult(Applicant applicant, Admission admin) {
		

	}

}

package com.cg.services;

import java.util.List;

import com.cg.entities.Admission;
import com.cg.entities.AdmissionCommiteeMember;
import com.cg.entities.Applicant;

public interface AdmissionCommiteeMemberService {
	AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember admiComm);
	AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember admiComm);
	AdmissionCommiteeMember viewCommiteeMember(int adminId);
	void removeCommiteeMember(int adminId);
	List<AdmissionCommiteeMember> veiwAllCommiteeMember(); 
	void provideAdmissionResult(Applicant applicant,Admission admin);
}

package service;

import java.util.List;

import entities.Admission;
import entities.AdmissionCommiteeMember;
import entities.Applicant;

public interface AdmissionCommiteeMemberService {
	AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember admiComm);
	AdmissionCommiteeMember updateCommiteeMember(AdmissionCommiteeMember admiComm);
	AdmissionCommiteeMember viewCommiteeMember(int adminId);
	void removeCommiteeMember(int adminId);
	List<AdmissionCommiteeMember> veiwAllCommiteeMember(); 
	void provideAdmissionResult(Applicant applicant,Admission admin);
}

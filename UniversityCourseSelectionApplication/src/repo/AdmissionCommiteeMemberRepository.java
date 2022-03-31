package repo;

import java.util.List;

import entities.AdmissionCommiteeMember;


public interface AdmissionCommiteeMemberRepository {
	AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember admiComm);
	void updateCommiteeMember(AdmissionCommiteeMember admiComm);
	AdmissionCommiteeMember viewCommiteeMember(int adminId);
	void removeCommiteeMember(int adminId);
	List<AdmissionCommiteeMember> veiwAllCommiteeMember(); 
}

package com.cg.repos;


public class LoginRepositoryImp implements LoginRepository {


	@Override
	public boolean verifyApplicantCredentials(String username, String password) {
		
		return false;
	}

	@Override
	public boolean verifyAdmissionCommiteeMemberCredentials(String username, String password) {
		
		return false;
	}

	@Override
	public boolean verifyUniversityStaffMemberCredentials(String username, String password) {
		
		return false;
	}

}

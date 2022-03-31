package com.cg.services;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean loginAsApplicant(String username, String password) {
		
		return false;
	}

	@Override
	public boolean loginAsAdmissionCommiteeMember(String username, String password) {
		return false;
	}

	@Override
	public boolean loginAsUniversityStaffMember(String username, String password) {
		return false;
	}

}

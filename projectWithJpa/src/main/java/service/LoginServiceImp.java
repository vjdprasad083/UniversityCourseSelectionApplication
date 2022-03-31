package service;

import javax.persistence.EntityTransaction;

import repo.LoginRepository;
import repo.LoginRepositoryImp;
import util.JPAUtil;

public class LoginServiceImp implements LoginService {
	LoginRepository repo;
	EntityTransaction transaction;
	public LoginServiceImp() {
		repo = new LoginRepositoryImp();
		transaction = JPAUtil.getEntityManager().getTransaction();
		
	}

	@Override
	public boolean loginAsApplicant(String username, String password) {
		boolean bool=false;
		transaction.begin();
		bool =repo.verifyApplicantCredentials(username, password);
		transaction.commit();
		return bool;
	}

	@Override
	public boolean loginAsAdmissionCommiteeMember(String username, String password) {
		boolean bool=false;
		transaction.begin();
		bool =repo.verifyAdmissionCommiteeMemberCredentials(username, password);
		transaction.commit();
		return bool;
	}

	@Override
	public boolean loginAsUniversityStaffMember(String username, String password) {
		boolean bool=false;
		transaction.begin();
		bool =repo.verifyUniversityStaffMemberCredentials(username, password);
		transaction.commit();
		return bool;
	}

}

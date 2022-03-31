package repo;

import javax.persistence.EntityManager;
import util.JPAUtil;

public class LoginRepositoryImp implements LoginRepository {
	EntityManager entityManager;
	public LoginRepositoryImp(){
		entityManager= JPAUtil.getEntityManager();
		}


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

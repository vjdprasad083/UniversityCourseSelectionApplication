package repo;

public interface LoginRepository {
	boolean verifyApplicantCredentials(String username,String password );
	boolean verifyAdmissionCommiteeMemberCredentials(String username,String password );	
	boolean verifyUniversityStaffMemberCredentials(String username,String password );

}

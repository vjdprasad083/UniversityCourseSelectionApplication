package service;

public interface LoginService
{
    boolean loginAsApplicant(String username,String password );
    boolean loginAsAdmissionCommiteeMember(String username,String password);
    boolean loginAsUniversityStaffMember(String username,String password);
}
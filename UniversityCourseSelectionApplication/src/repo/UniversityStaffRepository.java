package repo;

import java.util.List;

import entities.UniversityStaffMember;

public interface UniversityStaffRepository {
	UniversityStaffMember addStaff(UniversityStaffMember uniStaff);
	UniversityStaffMember updateStaff(UniversityStaffMember uniStaff);
	UniversityStaffMember viewStaff(int staffId);
	void removeStaff(int staffId);
	List<UniversityStaffMember> viewAllStaffs();

}

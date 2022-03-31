package repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.UniversityStaffMember;
import util.JPAUtil;

public class UniversityStaffRepositoryImp implements UniversityStaffRepository {
	EntityManager entityManager;
	

	public UniversityStaffRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public UniversityStaffMember addStaff(UniversityStaffMember uniStaff) {
		entityManager.persist(uniStaff);
		return uniStaff;
	}

	@Override
	public UniversityStaffMember updateStaff(UniversityStaffMember uniStaff) {
		entityManager.merge(uniStaff);
		return uniStaff;
			}

	@Override
	public UniversityStaffMember viewStaff(int staffId) {
		return  entityManager.find(UniversityStaffMember.class,staffId);
	}

	@Override
	public void removeStaff(int staffId) {
		entityManager.remove(staffId);

	}

	@Override
	public List<UniversityStaffMember> viewAllStaffs() {
		String str="SELECT UniversityStaffMember FROM UniversityStaffMember universityStaffMember ";
		TypedQuery<UniversityStaffMember> query=entityManager.createQuery(str, UniversityStaffMember.class);
		return query.getResultList();	}

}

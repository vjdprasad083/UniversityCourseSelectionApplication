package repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.AdmissionCommiteeMember;
import util.JPAUtil;

public class AdmissioncommiteeMemberRepositoryImp implements AdmissionCommiteeMemberRepository {
	private EntityManager entityManager;
	public AdmissioncommiteeMemberRepositoryImp() {
		entityManager= JPAUtil.getEntityManager();
		
	}
	@Override
	public AdmissionCommiteeMember addCommiteeMember(AdmissionCommiteeMember admiComm) {
		entityManager.persist(admiComm);
		return admiComm;
	}

	@Override
	public void updateCommiteeMember(AdmissionCommiteeMember admiComm) {
		entityManager.merge(admiComm);

	}

	@Override
	public AdmissionCommiteeMember viewCommiteeMember(int adminId) {
		AdmissionCommiteeMember adminComm=entityManager.find(AdmissionCommiteeMember.class,adminId);
		return adminComm;
		
	}

	@Override
	public void removeCommiteeMember(int adminId) {
		AdmissionCommiteeMember adminComm=null;
		adminComm=entityManager.find(AdmissionCommiteeMember.class,adminId);
		entityManager.remove(adminComm);
		
	}

	@Override
	public List<AdmissionCommiteeMember> veiwAllCommiteeMember() {
		 String str="SELECT admissionCommiteeMember FROM AdmissionCommiteeMember admissionCommiteeMember";
		 TypedQuery<AdmissionCommiteeMember> query = entityManager.createQuery(str, AdmissionCommiteeMember.class);
			return query.getResultList();
	}

}

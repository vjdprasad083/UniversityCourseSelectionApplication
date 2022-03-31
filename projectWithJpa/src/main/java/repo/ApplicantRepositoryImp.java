package repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.Applicant;
import util.JPAUtil;

public class ApplicantRepositoryImp implements ApplicantRepository {
	Applicant applicant;
	EntityManager entityManager;
	public ApplicantRepositoryImp() {
		entityManager= JPAUtil.getEntityManager();
	}

	@Override
	public Applicant addApplicant(Applicant applicant) {
		entityManager.persist(applicant);
		return applicant;
	}

	@Override
	public Applicant updateApplicant(Applicant upAppliacnt) {
		entityManager.merge(applicant);
		return applicant;
	}

	@Override
	public void deleteApplicant(int applicantId) {
		entityManager.remove(applicantId);
	}

	@Override
	public Applicant veiwApplicant(int applicantId) {
		 return entityManager.find(Applicant.class, applicantId);
	}

	@Override
	public List<Applicant> veiwAllApplicantsByStatus(String status) {
		String str="SELECT applicant FROM Applicant applicant WHERE Applicant.status LIKE:Pstatus";
		TypedQuery<Applicant> query = entityManager.createQuery(str, Applicant.class);
		query.setParameter("pstatus", "%"+status+"%");
		return query.getResultList();
		
	}

}

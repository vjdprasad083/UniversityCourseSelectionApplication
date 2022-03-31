package repo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.Admission;
import util.JPAUtil;

public class AdmissionRepositoryImp implements AdmissionRepository {
	EntityManager entityManager;
	public AdmissionRepositoryImp() {
		entityManager= JPAUtil.getEntityManager();
	}
	@Override
	public Admission addAdmission(Admission admin) {
		entityManager.persist(admin);
		return admin;
	}
	@Override
	public Admission updateAdmission(Admission admin) {
		entityManager.merge(admin);
		return admin;
	}
	@Override
	public void cancleAdmission(int addmissionId) {
		entityManager.remove(addmissionId);
	}
	@Override
	public List<Admission> showAllAdmissionByCourseId(int courseId) {
		String str="SELECT admission FROM Admission admission WHERE Admission.courseId LIKE:PcourseId";
		TypedQuery<Admission> query = entityManager.createQuery(str, Admission.class);
		query.setParameter("PcourseId", "%"+courseId+"%");
		return query.getResultList();
	}
	@Override
	public List<Admission> showAllAdmissionByDate(LocalDate admissionDate) {
		String str="SELECT admission FROM Admission admission WHERE Admission.admissionDate LIKE:PadmissionDate";
		TypedQuery<Admission> query = entityManager.createQuery(str, Admission.class);
		query.setParameter("PadmissionDate", "%"+admissionDate+"%");
		return query.getResultList();
	}
	@Override
	public List<Admission> showAllAdmissionsByApplicant(int applicantId) {
		String str="SELECT admission FROM Admission admission WHERE Admission.applicantId LIKE:PapplicantId";
		TypedQuery<Admission> query = entityManager.createQuery(str, Admission.class);
		query.setParameter("PapplicantId", "%"+applicantId+"%");
		return query.getResultList();
	}
	@Override
	public double calculateTotalCost(int amount) {
		
		return amount;
	}

}

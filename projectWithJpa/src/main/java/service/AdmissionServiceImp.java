package service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityTransaction;

import repo.AdmissionRepository;
import repo.AdmissionRepositoryImp;
import util.JPAUtil;
import entities.Admission;

public class AdmissionServiceImp implements AdmissionService{
	private AdmissionRepository repo;
	private EntityTransaction transaction ;
	public AdmissionServiceImp() {
		repo = new AdmissionRepositoryImp();
		transaction = JPAUtil.getEntityManager().getTransaction();
	

}
	@Override
	public Admission addAdmission(Admission admin) {
		transaction.begin();
		repo.addAdmission(admin);
		transaction.commit();
		return admin;
	}
	@Override
	public Admission updateAdmission(Admission admin) {
		transaction.begin();
		repo.updateAdmission(admin);
		transaction.commit();
		return admin;
	}
	@Override
	public Admission cancleAdmission(int admissionId) {
		transaction.begin();
		repo.cancleAdmission(admissionId);
		transaction.commit();
		return null;
	}
	@Override
	public List<Admission> showAllAdmissionByCourseId(int courseId) {
		List<Admission> admission = null;
		transaction.begin();
		admission=repo.showAllAdmissionByCourseId(courseId);
		transaction.commit();
		return admission;
	}
	@Override
	public List<Admission> showAllAdmissionByDate(LocalDate Local) {
		List<Admission> admission = null;
		transaction.begin();
		admission=repo.showAllAdmissionByDate(Local);
		transaction.commit();
		return admission;
}
}

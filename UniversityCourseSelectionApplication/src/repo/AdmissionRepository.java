package repo;

import java.time.LocalDate;
import java.util.List;

import entities.Admission;

public interface AdmissionRepository {
	Admission addAdmission(Admission admin);
	Admission updateAdmission(Admission admin);
	void cancleAdmission(int addmissionId);
	List<Admission> showAllAdmissionByCourseId(int courseId); 
	List<Admission> showAllAdmissionByDate(LocalDate local);
	List<Admission> showAllAdmissionsByApplicant(int applicantId);
	double calculateTotalCost(int amount);
}


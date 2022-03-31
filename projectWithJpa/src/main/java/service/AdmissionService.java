package service;

import java.time.LocalDate;
import java.util.List;

import entities.Admission;

	public interface AdmissionService {
	Admission addAdmission(Admission admin);
	Admission updateAdmission(Admission admin);
	Admission cancleAdmission(int addmissionId);
	List<Admission> showAllAdmissionByCourseId(int courseId); 
	List<Admission> showAllAdmissionByDate(LocalDate local);
	}



package com.cg.services;

import java.time.LocalDate;
import java.util.List;

import com.cg.entities.Admission;

	public interface AdmissionService {
	Admission addAdmission(Admission admin);
	Admission updateAdmission(Admission admin);
	void cancleAdmission(int admissionId);
	List<Admission> showAllAdmissionByCourseId(int courseId); 
	List<Admission> showAllAdmissionByDate(LocalDate local);
	}



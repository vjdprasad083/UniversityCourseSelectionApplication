package com.cg.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Admission;

public interface AdmissionRepo extends JpaRepository<Admission, Integer> {
	
	public List<Admission> findAllByCourseId(int courseid);
	public List<Admission> findAllByAdmissionDate(LocalDate local );

}

package com.cg.repos;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.entities.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant, Integer> {
	
	public List<Applicant> FindAllByCourse(int courseId);
	public List<Applicant> FindAllByApplicantsStatus(String status);

}

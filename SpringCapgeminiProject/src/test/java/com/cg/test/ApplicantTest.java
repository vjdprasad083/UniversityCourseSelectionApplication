package com.cg.test;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.entities.Applicant;
import com.cg.repos.ApplicantRepo;
import com.cg.services.ApplicantService;
import com.cg.services.ApplicantServiceImpl;



@SpringBootTest
public class ApplicantTest {
	@Autowired
	private ApplicantService applicantService;
	
	@Test
	public void saveApplicant() {
		Applicant applicant=Applicant.builder()
				.applicantName("vjdprasad")
				.mobileNumber("9493529452")
				.applicantDegree("btech")
				.applicantGrauationPercentage(88)
				.build();
		applicantService.addApplicant(applicant);
	}
	
}

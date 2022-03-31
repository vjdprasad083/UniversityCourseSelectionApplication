package com.cg.services;

import java.util.List;


import com.cg.entities.Applicant;

public interface ApplicantService {
Applicant addApplicant(Applicant applicant);
Applicant updateApplicant(Applicant applicant);
void deleteApplicant(int applicantId);
Applicant veiwApplicant(int applicantId); 
List<Applicant> veiwAllApplicantsByStatus(String status);
public List<Applicant> FindAllByCourse(int courseId);
}

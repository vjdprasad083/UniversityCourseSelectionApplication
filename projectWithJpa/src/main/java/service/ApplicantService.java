package service;

import java.util.List;

import entities.Applicant;

public interface ApplicantService {
Applicant addApplicant(Applicant applicant);
Applicant updateApplicant(Applicant upAppliacnt);
void deleteApplicant(int applicantId);
Applicant veiwApplicant(int applicantId); 
List<Applicant> veiwAllApplicantsByStatus(String status);
}

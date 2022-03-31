package entities;

import java.time.LocalDate;

public class Admission {
	
	private int admissionnId;
	private LocalDate admissionDate;
	private Course course;
	private Applicant applicant;
	
	
	public Admission(int admissionnId, LocalDate admissionDate, Course course, Applicant applicant) {
		super();
		this.admissionnId = admissionnId;
		this.admissionDate = admissionDate;
		this.course = course;
		this.applicant = applicant;
	}
	
	
	public int getAdmissionnId() {
		return admissionnId;
	}
	public void setAdmissionnId(int admissionnId) {
		this.admissionnId = admissionnId;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}


	@Override
	public String toString() {
		return "Admission [admissionnId=" + admissionnId + ", admissionDate=" + admissionDate + ", course=" + course
				+ ", applicant=" + applicant + "]";
	}
	
	
	
	

}
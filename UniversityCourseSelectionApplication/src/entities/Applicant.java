package entities;

public class Applicant {
	private String applicantId;
	private String applicantName;
	private String mobileNumber;
	private String applicantDegree;
	private int applicantGrauationPercentage;
	
	public Applicant(String applicantId, String applicantName, String mobileNumber, String applicantDegree,
			int applicantGrauationPercentage) {
		super();
		this.applicantId = applicantId;
		this.applicantName = applicantName;
		this.mobileNumber = mobileNumber;
		this.applicantDegree = applicantDegree;
		this.applicantGrauationPercentage = applicantGrauationPercentage;
	}
	
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getApplicantDegree() {
		return applicantDegree;
	}
	public void setApplicantDegree(String applicantDegree) {
		this.applicantDegree = applicantDegree;
	}
	public int getApplicantGrauationPercentage() {
		return applicantGrauationPercentage;
	}
	public void setApplicantGrauationPercentage(int applicantGrauationPercentage) {
		this.applicantGrauationPercentage = applicantGrauationPercentage;
	}
	
	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", applicantName=" + applicantName + ", mobileNumber="
				+ mobileNumber + ", applicantDegree=" + applicantDegree + ", applicantGrauationPercentage="
				+ applicantGrauationPercentage + "]";
	}
	
	
	}
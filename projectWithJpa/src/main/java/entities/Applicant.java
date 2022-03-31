 package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="Applicant")
public class Applicant {
	
	@Id
	private String applicantId;
	private String applicantName;
	private String mobileNumber;
	private String applicantDegree;
	private int applicantGrauationPercentage;
	}
	

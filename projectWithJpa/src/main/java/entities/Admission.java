package entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Admission  {
	@Id
	private int admissionnId;
	private LocalDate admissionDate;
	private Course courseId;
	
	private Applicant applicantId;
	
	
	
}
	
	
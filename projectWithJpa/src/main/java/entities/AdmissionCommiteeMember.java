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
@Table(name="admissionCommeteeMember")
public class AdmissionCommiteeMember {
	@Id
	private int adminId;
	private String adminName;
	private String adminContact;
	
	
}

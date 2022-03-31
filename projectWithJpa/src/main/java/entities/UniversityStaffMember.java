package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class UniversityStaffMember {
	@Id
	private int staffId;
	private String password;
	private String role;
}
	
	
	
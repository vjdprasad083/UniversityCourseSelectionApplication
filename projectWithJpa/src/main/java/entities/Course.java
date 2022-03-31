package entities;

import java.time.LocalDate;

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
@Table(name="course")
public class Course {
	@Id
	 private int courseId;
	 private String courseName;
	 private String courseDuration;
   	 private LocalDate courseStartDate;
	 private LocalDate courseEndDate;
	 

	
	

}

package com.cg.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="course")
public class Course {
	@Id
	@SequenceGenerator(
			name="course_seq",
			sequenceName = "course_seq",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_seq")
	 private int courseId;
	 private String courseName;
	 private String courseDuration;
   	 private LocalDate courseStartDate;
	 private LocalDate courseEndDate;
	 

	
	

}

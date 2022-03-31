package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Admission")
public class Admission  {
	@Id
	@SequenceGenerator(
			name="admission_seq",
			sequenceName = "admission_seq",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "admission_seq")
	private int admissionnId;
	private LocalDate admissionDate;
	@ManyToMany
	@JoinColumn(name = "courseId" , referencedColumnName = "courseId")
	private Course courseId;
	@OneToOne
	@JoinColumn(name = "applicantId" , referencedColumnName = "applicantId")
	private Applicant applicantId;
	
	
	
}
	
	
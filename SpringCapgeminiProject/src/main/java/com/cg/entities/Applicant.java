 package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="Applicant")
public class Applicant {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.AUTO)
	private int applicantId;
	private String applicantName;
	private String mobileNumber;
	private String applicantDegree;
	private int applicantGrauationPercentage;
	}
	

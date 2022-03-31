package com.cg.entities;

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
@Table(name="admissionCommeteeMember")
public class AdmissionCommiteeMember {
	@Id
	@SequenceGenerator(
			name="admin_seq",
			sequenceName = "admin_seq",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "admin_seq")
	private int adminId;
	private String adminName;
	private String adminContact;
	
	
}

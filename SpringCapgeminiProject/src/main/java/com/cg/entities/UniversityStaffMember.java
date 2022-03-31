package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="UniversityStaffMember")
public class UniversityStaffMember {
	@Id
	private int staffId;
	@Column(nullable = false)
	private String password;
	private String role;
}
	
	
	
package com.everis.vms.dao.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	
	@ManyToOne
	private Category category;
	
	private String image;
	
	@ManyToOne
	private Centre centre;
	
	private Date everisHiringDate;
	private int vacationDays;
	private boolean status;
	
	@OneToMany(mappedBy = "employee", cascade=CascadeType.ALL)
	private List<Vacation> vacations;

}

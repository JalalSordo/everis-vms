package com.everis.vms.dao.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vacation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	private Employee employee;
	
	private String client;
	private String project;
	private String nameOfSignature;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
	private List<RequestedDay> requestedDays;

	private int businessDaysRequested;

}

package com.everis.vms.dao.entities;

import java.util.Date;

import com.everis.vms.dao.enums.Category;
import com.everis.vms.dao.enums.Centre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private Category category;
	private String Image;
	private Centre centre;
	private Date everisHiringDate;
	private int vacationDays;
	private boolean status;

}

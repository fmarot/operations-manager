package com.teamtter.operations.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class ClientSite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	String name;
	
	Set<Operation> operations;

	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	public Set<Operation> getOperations() {
		return operations;
	}
}

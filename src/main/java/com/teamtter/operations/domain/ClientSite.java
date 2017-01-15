package com.teamtter.operations.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;

@Entity
@Getter
@Table(name = "clientSite", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class ClientSite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	String name;

	// mappedBy -> requires field name in other entity
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	Collection<Operation> operations = new ArrayList<>();
	
	protected ClientSite() {
		// protected to please JPA
	}
	
	public ClientSite(String name) {
		this.name = name;
	}
	
	public void AddOperation(Operation op) {
		operations.add(op);
	}
}

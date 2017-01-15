package com.teamtter.operations.domain;

import java.time.Duration;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "operation")
@Getter
@AllArgsConstructor
@Slf4j
public class Operation {

	/** chantier */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	@ManyToOne
//	ClientSite clientSite;

	LocalDate date;

	Duration duration;

	OperationType type;

	String freeText;

	boolean completed = false;

	protected Operation() {
		// default constructor to make JPA happy
	}

	public Operation(LocalDate date,
			Duration duration, OperationType type,
			String freeText, boolean completed) {
		super();
//		this.clientSite = clientSite;
		this.date = date;
		this.duration = duration;
		this.type = type;
		this.freeText = freeText;
		this.completed = completed;
	}
	
	

}

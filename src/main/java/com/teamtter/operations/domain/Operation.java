package com.teamtter.operations.domain;

import java.time.Duration;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;

@Data
public class Operation {

	/** chantier */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@Getter
	@JoinColumn(name = "client_site_id")
	ClientSite site;

	LocalDate date;

	Duration duration;

	Operationtype type;

	String freeText;

	boolean completed = false;

	protected Operation() {
		// default constructor to make JPA happy
	}

}

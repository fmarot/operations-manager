package com.teamtter.operations.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientSiteRepository extends CrudRepository<ClientSite, Long> {

	List<Operation> findByName(String name);
}

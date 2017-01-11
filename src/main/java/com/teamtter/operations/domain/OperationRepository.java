package com.teamtter.operations.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OperationRepository extends CrudRepository<Operation, Long> {

	List<Operation> findByClientSite(ClientSite clientSite);
}

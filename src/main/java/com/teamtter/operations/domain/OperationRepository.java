package com.teamtter.operations.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends CrudRepository<Operation, Long> {

//	List<Operation> findByClientSite(ClientSite clientSite);
}

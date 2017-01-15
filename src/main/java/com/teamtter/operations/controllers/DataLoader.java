package com.teamtter.operations.controllers;

import java.time.Duration;
import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.teamtter.operations.domain.ClientSite;
import com.teamtter.operations.domain.ClientSiteRepository;
import com.teamtter.operations.domain.Operation;
import com.teamtter.operations.domain.OperationRepository;
import com.teamtter.operations.domain.OperationType;

@Component
public class DataLoader implements ApplicationRunner {

    private OperationRepository operationRepo;
    private ClientSiteRepository clientSiteRepo;

    public DataLoader(OperationRepository operationRepo, ClientSiteRepository clientSiteRepo) {
        this.operationRepo = operationRepo;
		this.clientSiteRepo = clientSiteRepo;
    }

    public void run(ApplicationArguments args) {
    	ClientSite site = new ClientSite("Toto");
    	Operation operation = new Operation(LocalDate.MAX,
    			Duration.ZERO, OperationType.EXTRA, "xxx xxx xx", true);
    	site.AddOperation(operation);
    	clientSiteRepo.save(site);
//    	operationRepo.save(operation);
    }
}
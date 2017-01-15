package com.teamtter.operations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teamtter.operations.domain.ClientSiteRepository;
import com.teamtter.operations.domain.Operation;
import com.teamtter.operations.domain.OperationRepository;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private OperationRepository operationRepo;
    private ClientSiteRepository clientSiteRepo;

    public HelloController(OperationRepository operationRepo, ClientSiteRepository clientSiteRepo) {
        this.operationRepo = operationRepo;
		this.clientSiteRepo = clientSiteRepo;
    }
    
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Operation> sayHello() {
		return operationRepo.findAll();
	}

}
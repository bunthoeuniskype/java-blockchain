package com.blockchain.ContractService.controllers;

import com.blockchain.ContractService.models.Contract;
import com.blockchain.ContractService.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    ContractService service;

    @GetMapping("/owner")
    public String getOwnerAccount() {
        return service.getOwnerAccount();
    }

    //curl -X POST -H "Content-Type: application/json" -d '{"fee":5}' http://localhost:8091/contract
    @PostMapping
    public Contract createContract(@RequestBody Contract newContract) throws Exception {
        return service.createContract(newContract);
    }

}
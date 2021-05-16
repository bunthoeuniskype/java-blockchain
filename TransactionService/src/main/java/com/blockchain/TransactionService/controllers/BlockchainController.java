package com.blockchain.TransactionService.controllers;

import com.blockchain.TransactionService.models.BlockchainTransaction;
import com.blockchain.TransactionService.services.BlockchainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.CipherException;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

@RestController
public class BlockchainController {

    @Autowired
    BlockchainService service;

    //$ curl --header "Content-Type: application/json" --request POST --data '{"fromId":2,"toId":1,"value":3}' http://localhost:8090/transaction
    @PostMapping("test/transaction")
    public BlockchainTransaction execute(@RequestBody BlockchainTransaction transaction) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, CipherException, IOException {
        return service.process(transaction);
    }

}
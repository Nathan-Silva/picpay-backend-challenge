package br.com.desafio.picpaybackend.transaction.rest;

import br.com.desafio.picpaybackend.transaction.dto.TransactionRequest;
import br.com.desafio.picpaybackend.transaction.dto.TransactionResponse;
import br.com.desafio.picpaybackend.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping
    public TransactionResponse createTransaction(@RequestBody TransactionRequest transactionRequest){
        return transactionService.createTransaction(transactionRequest);
    }

}

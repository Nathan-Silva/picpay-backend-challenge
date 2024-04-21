package br.com.desafio.picpaybackend.transaction.service;

import br.com.desafio.picpaybackend.transaction.dto.TransactionRequest;
import br.com.desafio.picpaybackend.transaction.dto.TransactionResponse;
import br.com.desafio.picpaybackend.transaction.repository.TransactionRepository;
import br.com.desafio.picpaybackend.wallet.repository.WalletRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public static final Logger LOGGER = LoggerFactory.getLogger(TransactionService.class);

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    WalletRepository walletRepository;


    public TransactionResponse createTransaction(TransactionRequest transactionRequest) {
        validateTransaction(transactionRequest);

        return null;
    }


    private void validateTransaction(TransactionRequest transactionRequest) {
        LOGGER.info("Validating transaction -> {}", transactionRequest);

//        walletRepository.findAllById(transactionRequest.payee())
//                .map

    }


}

package br.com.desafio.picpaybackend.transaction.dto;

import java.math.BigDecimal;

public record TransactionResponse(

        Long transactionId,
        BigDecimal value,
        Long payee,
        Long payer) {
}

package br.com.desafio.picpaybackend.transaction.dto;

import java.math.BigDecimal;

public record TransactionRequest(
        BigDecimal value,
        Long payee,
        Long payer) {
}

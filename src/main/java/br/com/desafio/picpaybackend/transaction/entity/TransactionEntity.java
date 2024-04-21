package br.com.desafio.picpaybackend.transaction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TRANSACTIONS")
public record TransactionEntity(

        @Id
        Long transactionId,
        Long payee,
        Long payer,
        BigDecimal value,
        LocalDateTime createDate
) {
}

package br.com.desafio.picpaybackend.wallet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "WALLETS")
public record WalletEntity(

        @Id
        Long walletId,
        String customerName,
        String customerDocument,
        String emailAddress,

        String password,

        int customerType,
        BigDecimal balance) {

    public WalletEntity debit(BigDecimal value) {
        return new WalletEntity(walletId, customerName, customerDocument, emailAddress, password, customerType,
                balance.subtract(value));
    }

    public WalletEntity credit(BigDecimal value) {
        return new WalletEntity(walletId, customerName, customerDocument, emailAddress, password, customerType,
                balance.add(value));
    }
}

package br.com.desafio.picpaybackend.transaction.repository;

import br.com.desafio.picpaybackend.transaction.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}

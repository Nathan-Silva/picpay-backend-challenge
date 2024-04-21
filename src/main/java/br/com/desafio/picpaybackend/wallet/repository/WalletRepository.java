package br.com.desafio.picpaybackend.wallet.repository;

import br.com.desafio.picpaybackend.wallet.entity.WalletEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface WalletRepository extends ListCrudRepository<WalletEntity, Long> {
}

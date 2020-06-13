package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
}

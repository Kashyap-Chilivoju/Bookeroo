package com.CaffeinatedPotatoes.transactionmicroservices.repositories;

import com.CaffeinatedPotatoes.transactionmicroservices.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Transaction getTransactionByTransactionId(Long transactionId);
    ArrayList<Transaction> findAllByUserIdIs(Long userId);
    ArrayList<Transaction> findAllByCreate_AtAfter(Date date);
}

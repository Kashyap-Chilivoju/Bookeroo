package com.CaffeinatedPotatoes.transactionmicroservices.repositories;

import com.CaffeinatedPotatoes.transactionmicroservices.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    Transaction getTransactionById(Long Id);
    //ArrayList<Transaction> findAllByUserIdIs(Long userId);

}

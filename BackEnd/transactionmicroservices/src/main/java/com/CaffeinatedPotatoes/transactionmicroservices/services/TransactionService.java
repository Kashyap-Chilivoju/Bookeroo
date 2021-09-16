package com.CaffeinatedPotatoes.transactionmicroservices.services;

import com.CaffeinatedPotatoes.transactionmicroservices.exceptions.AlreadyExistsException;
import com.CaffeinatedPotatoes.transactionmicroservices.model.Transaction;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTransaction(Transaction newTransaction){
        try{
            return transactionRepository.save(newTransaction);
        } catch (Exception e){
            throw new AlreadyExistsException("Transaction id:" + newTransaction.getId()+ " already exists");
        }
    }

}

package com.CaffeinatedPotatoes.transactionmicroservices.web;

import com.CaffeinatedPotatoes.transactionmicroservices.model.Transaction;
import com.CaffeinatedPotatoes.transactionmicroservices.payload.TransactionRequest;
import com.CaffeinatedPotatoes.transactionmicroservices.repositories.TransactionRepository;
import com.CaffeinatedPotatoes.transactionmicroservices.services.MapValidationErrorService;
import com.CaffeinatedPotatoes.transactionmicroservices.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @GetMapping
    public ResponseEntity<?> getTransactionById(@Valid @RequestBody TransactionRequest transactionRequest, BindingResult bindingResult){
        Transaction returnedTransaction = transactionRepository.getTransactionByTransactionId(transactionRequest.getId());

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(bindingResult);
        if(errorMap != null) {
            return errorMap;
        }

        return new ResponseEntity<>(returnedTransaction, HttpStatus.OK);
    }

}

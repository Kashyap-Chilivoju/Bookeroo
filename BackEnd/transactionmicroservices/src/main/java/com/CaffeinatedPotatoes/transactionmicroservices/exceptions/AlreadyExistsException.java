package com.CaffeinatedPotatoes.transactionmicroservices.exceptions;

public class AlreadyExistsException extends RuntimeException{
    public AlreadyExistsException(String message){
        super(message);
    }
}

package com.CaffeinatedPotatoes.bookmicroservices.exceptions;

public class AlreadyExistsException extends RuntimeException{

    public AlreadyExistsException(String message){
        super(message);
    }
}

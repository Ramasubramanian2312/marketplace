package com.marketplace.mvc.domain.exceptions;

/**
 * Created by Abhi on 4/3/16.
 */
public class EmailAlreadyExistsException extends RuntimeException{

    public EmailAlreadyExistsException(){

    }

    public EmailAlreadyExistsException(String message){

        super(message);
    }
}

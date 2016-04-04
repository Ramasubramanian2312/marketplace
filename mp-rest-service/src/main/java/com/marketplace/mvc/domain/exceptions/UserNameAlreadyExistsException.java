package com.marketplace.mvc.domain.exceptions;

/**
 * Created by Abhi on 4/3/16.
 */
public class UserNameAlreadyExistsException extends RuntimeException {

    public UserNameAlreadyExistsException(){

    }

    public UserNameAlreadyExistsException(String message){

            super(message);
    }
}

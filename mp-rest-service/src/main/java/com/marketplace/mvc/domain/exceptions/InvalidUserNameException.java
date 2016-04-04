package com.marketplace.mvc.domain.exceptions;

/**
 * Created by Abhi on 4/3/16.
 */
public class InvalidUserNameException extends RuntimeException {
    public InvalidUserNameException(){

    }

    public InvalidUserNameException(String message){

        super(message);
    }
}

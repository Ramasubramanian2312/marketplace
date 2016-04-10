package com.marketplace.mvc.domain.exceptions;

/**
 * Created by amysoresomasheka on 4/10/16.
 */
public class MpBadRequestException extends  RuntimeException {
    public MpBadRequestException(){

    }

    public MpBadRequestException(String message){

        super(message);
    }
}

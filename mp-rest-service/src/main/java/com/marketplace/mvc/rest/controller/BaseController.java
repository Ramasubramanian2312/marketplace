package com.marketplace.mvc.rest.controller;

import com.marketplace.mvc.domain.exceptions.MpBadRequestException;
import com.marketplace.mvc.domain.exceptions.UserNameAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Abhi on 4/2/16.
 */
public class BaseController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({UserNameAlreadyExistsException.class})
    public void handleUserNameAlreadyExistsExeption (UserNameAlreadyExistsException e){

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({MpBadRequestException.class})
    public void badRequestException (MpBadRequestException e){

    }
}

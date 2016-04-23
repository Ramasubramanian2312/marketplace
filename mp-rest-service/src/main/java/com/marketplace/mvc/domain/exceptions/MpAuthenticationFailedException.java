package com.marketplace.mvc.domain.exceptions;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by amysoresomasheka on 4/17/16.
 */
public class MpAuthenticationFailedException extends AuthenticationException {


    public MpAuthenticationFailedException(String explanation) {
        super(explanation);
    }
}

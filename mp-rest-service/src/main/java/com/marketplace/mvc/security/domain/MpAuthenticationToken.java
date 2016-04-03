package com.marketplace.mvc.security.domain;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created by Abhi on 3/29/16.
 */
public class MpAuthenticationToken extends UsernamePasswordAuthenticationToken{

    public MpAuthenticationToken(){
        super(null, null);
    }
    public MpAuthenticationToken(final Object principal, final Object credentials){
        super(principal, credentials);
    }

    public MpAuthenticationToken(final String username, final String password){
        super(username, password);
    }

}

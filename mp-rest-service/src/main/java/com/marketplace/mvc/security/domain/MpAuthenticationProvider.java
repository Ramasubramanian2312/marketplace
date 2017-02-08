package com.marketplace.mvc.security.domain;

import com.marketplace.mvc.database.service.CustomerService;
import com.marketplace.mvc.domain.exceptions.MpAuthenticationFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Abhi on 3/29/16.
 */
public class MpAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private CustomerService customerService;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        MpAuthenticationToken mpauthenticationToken = (MpAuthenticationToken) authentication;
        String username = (String)mpauthenticationToken.getPrincipal();
        String password = (String)mpauthenticationToken.getCredentials();
        if(customerService.isValidCredentials(username, password)){
                System.out.println("AM HRERERE");
        }
        else{
            throw new MpAuthenticationFailedException("Username password didn't at all match");
        }
        return mpauthenticationToken;
    }

    public boolean supports(final Class<? extends Object> authentication) {
        return true;
    }
}

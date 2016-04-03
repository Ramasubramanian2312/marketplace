package com.marketplace.mvc.security.domain;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Abhi on 3/29/16.
 */
public class MpAuthenticationProvider implements AuthenticationProvider {
    private static Map<String, String> userPwd = new HashMap<String, String>();
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return authentication;
    }

    public boolean supports(final Class<? extends Object> authentication) {
        return true;
    }
}

package com.marketplace.mvc.security.domain;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.keygen.StringKeyGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhi on 3/29/16.
 */
public class MpAuthenticationToken extends UsernamePasswordAuthenticationToken{

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getUsername() {
        return username;
    }

    private String username;

    public String getEmailId() {
        return emailId;
    }

    private String emailId;

    public String getFirstName() {
        return firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    private String lastName;

    public MpAuthenticationToken(){
        super(null, null);
    }
    public MpAuthenticationToken(final Object principal, final Object credentials, final List<GrantedAuthority> grantedAuthorities){

        super(principal, credentials,  grantedAuthorities);
    }

    public MpAuthenticationToken(final String username, final String password){
        super(username, password);
    }


    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }



}

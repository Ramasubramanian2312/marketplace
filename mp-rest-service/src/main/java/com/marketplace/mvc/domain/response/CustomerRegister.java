package com.marketplace.mvc.domain.response;

/**
 * Created by Abhi on 4/2/16.
 */
public class CustomerRegister {

    public CustomerRegister(String user, String msg){
        this.username = user;
        this.message = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}

package com.marketplace.mvc.domain.response;

/**
 * Created by amysoresomasheka on 4/10/16.
 */
public class MessageContent {

    private String message;

    public MessageContent(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

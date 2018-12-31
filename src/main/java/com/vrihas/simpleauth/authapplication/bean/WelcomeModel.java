package com.vrihas.simpleauth.authapplication.bean;

public class WelcomeModel {

    public WelcomeModel(String message){
        super();
        this.message = message;
    }

    private final String message;

    public String getMessage() {
        return message;
    }
}

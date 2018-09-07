package com.devilz.app;

import com.devilz.validator.Validator;

public class Main {

    private static final String WELCOME_MESSAGE = "Welcome to chess move validator";

    public static void main(String[] args){
        System.out.println(WELCOME_MESSAGE);
        Validator validator = new Validator();
    }
}

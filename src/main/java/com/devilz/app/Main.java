package com.devilz.app;

import com.devilz.validator.Validator;

import java.util.Scanner;

public class Main {

    private static final String WELCOME_MESSAGE = "Welcome to chess move validator";

    public static void main(String[] args){
        //initializing new validator
        System.out.println(WELCOME_MESSAGE);
        Validator validator = new Validator();

        //reading input
        Scanner in = new Scanner(System.in);
        String temp;
        while(true){
            temp = in.nextLine();
            if(temp.equals("exit"))break;
        }
    }
}

package com.devilz.app;

import com.devilz.validator.Validator;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to chess move validator");
        Validator validator = new Validator();
        validator.PrintVal();
        validator.SetVal(10);
        validator.PrintVal();
    }
}

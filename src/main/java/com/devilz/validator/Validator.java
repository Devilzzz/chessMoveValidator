package com.devilz.validator;

public class Validator{

    private int val = 0;

    public Validator(){
        val = 3;
    }

    public void PrintVal(){
        System.out.println("Val : " + val);
    }

    public void SetVal(int val){
        this.val = val;
    }
}
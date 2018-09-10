package com.devilz.app;

import com.devilz.models.Move;
import com.devilz.validator.Validator;

import java.util.Scanner;

public class Main {

    private static boolean _debug = false;

    private static final String WELCOME_MESSAGE = "Welcome to chess move validator";
    private static final String PLAY_MOVE = "Play the next move";
    private static final String INVALID_INPUT = "Invalid input";

    public static void main(String[] args){
        //initializing new validator
        System.out.println(WELCOME_MESSAGE);
        Validator validator = new Validator();

        //reading input
        Scanner in = new Scanner(System.in);
        String temp;
        while(true){
            System.out.println(PLAY_MOVE);
            temp = in.nextLine();
            if(temp.equals("exit"))break;

            if(isValidInput(temp)) {
                if(_debug)System.out.println("INFO : input string is = " + temp);
                String[] inps = temp.split(" ");
                Move move;
                try {
                    move = new Move(inps[0], Integer.parseInt(inps[1]), Integer.parseInt(inps[2]));
                }catch (Exception e){
                    System.out.println(INVALID_INPUT + ". Input should be of type /'AB 12 34 /' ");
                }
            }else{
                System.out.println(INVALID_INPUT);
            }
        }
    }

    private static boolean isValidInput(String inp){
        if(!isValidInputString(inp))return false;
        String[] inps = inp.split(" ");
        if(inps.length != 3)return false;
        if(inps[0].length()!=2 || inps[1].length()!=2 || inps[2].length()!=2)return false;
        return true;
    }

    private static boolean isValidInputString(String inp){
        if(inp == null || inp.length()<8 || inp.length()>8) return false;
        return true;
    }
}

package com.devilz.validator;

import com.devilz.board.Board;
import com.devilz.enums.Color;

public class Validator{

    private static final boolean _debug = false;

    private Board gameBoard;
    Color turn;

    public Validator(){
        gameBoard = new Board();
        turn = Color.WHITE;
    }

    public void ValidateMove(String unit, Integer posFrom, Integer posTo){

    }
}
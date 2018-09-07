package com.devilz.board;

import com.devilz.commons.Constants;
import com.devilz.enums.Color;
import com.devilz.models.Piece;
import com.devilz.models.Pawn;

import java.util.*;

public class Board{

    private static final boolean _debug = false;

    private HashMap<Integer, Piece> boardState = new HashMap<Integer, Piece>();

    public Board(){
        initializeBoard(Constants.FRESH_BOARD);
        printBoard();
    }

    private void initializeBoard(String state){
        if(_debug)System.out.println("Initializing board");
        String[] spots = state.split(" ");
        for(int y=0;y<8;y++){
            for(int x=0;x<8;x++){
                int pos = y*8 + x;
                if(spots[pos].equals(Constants.VACANT))continue;

                if(spots[pos].equals(Constants.BLACK_PAWN)){
                    Pawn pawn = new Pawn(Color.BLACK, pos);
                    boardState.put(pos, pawn);
                }else if(spots[pos].equals(Constants.WHITE_PAWN)){
                    Pawn pawn = new Pawn(Color.WHITE, pos);
                    boardState.put(pos, pawn);
                }
            }
        }
    }

    public void printBoard(){
        if(_debug)System.out.println("Printing the game board");
        for(int y=0;y<8;y++){
            for(int x=0;x<8;x++){
                int pos = y*8 + x;
                if(boardState.containsKey(pos)){
                    System.out.print(boardState.get(pos).getName()+" ");
                }else System.out.print(Constants.VACANT + " ");
            }System.out.print("\n");
        }
    }
}
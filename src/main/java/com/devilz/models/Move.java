package com.devilz.models;

public class Move {
    private String piece;
    private int from;
    private int to;

    public Move(String piece, int from , int to){
        this.piece = piece;
        this.from = from;
        this.to = to;
    }
}

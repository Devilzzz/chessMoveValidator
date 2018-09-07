package com.devilz.models;

import com.devilz.enums.Color;

public class Pawn extends Piece {
    Pawn(Color color, Integer position){
        this.color = color;
        this.position = position;

        if(this.color == Color.WHITE){
            name = "WP";
        }else{
            name = "BP";
        }
    }
}

package com.devilz.models;

import com.devilz.commons.Constants;
import com.devilz.enums.Color;

public class Pawn extends Piece {
    public Pawn(Color color, Integer position){
        setColor(color);
        setPosition(position);

        if(getColor() == Color.WHITE){
            setName(Constants.WHITE_PAWN);
        }else{
            setName(Constants.BLACK_PAWN);
        }
    }
}

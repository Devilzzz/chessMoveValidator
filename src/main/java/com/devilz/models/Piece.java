package com.devilz.models;

import com.devilz.enums.Color;

public class Piece {
    private String name;
    private Color color;
    private Integer position;

    public void setName(String name){ this.name = name; }

    public String getName(){
        return name;
    }

    public  void setColor(Color color){ this.color = color; }

    public Color getColor(){ return color; }

    public void setPosition(int position){ this.position = position; }

    public  Integer getPosition(){ return  position; }


}

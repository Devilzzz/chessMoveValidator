package com.devilz.board;

import java.util.*;

public class Board{
    private HashMap<Integer,String> boardState = new HashMap<Integer, String>();

    private static final String FRESH_BOARD =
            "-- -- -- -- -- -- -- -- " +
            "BP BP BP BP BP BP BP BP " +
            "-- -- -- -- -- -- -- -- " +
            "-- -- -- -- -- -- -- -- " +
            "-- -- -- -- -- -- -- -- " +
            "-- -- -- -- -- -- -- -- " +
            "WP WP WP WP WP WP WP WP " +
            "-- -- -- -- -- -- -- --";


    Board(){
        initializeBoard(FRESH_BOARD);
    }

    private void initializeBoard(String state){

    }
}
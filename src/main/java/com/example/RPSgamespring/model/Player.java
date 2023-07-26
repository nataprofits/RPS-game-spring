package com.example.RPSgamespring.model;

public interface Player {
    String getName();
    String makeMove();

    void setMove(String lowerCase);

    String getMove();
}

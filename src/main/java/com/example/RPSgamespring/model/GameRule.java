package com.example.RPSgamespring.model;

public interface GameRule {
    String getRuleName();
    int compareMoves(String move1, String move2);
}

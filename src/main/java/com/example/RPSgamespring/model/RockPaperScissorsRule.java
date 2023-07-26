package com.example.RPSgamespring.model;

import com.example.RPSgamespring.model.GameRule;

public class RockPaperScissorsRule implements GameRule {
    private static final String[] MOVES = {"ROCK", "PAPER", "SCISSORS"};

    @Override
    public String getRuleName() {
        return "Rock, Paper, Scissors";
    }

    @Override
    public int compareMoves(String move1, String move2) {
        int index1 = getIndex(move1);
        int index2 = getIndex(move2);

        if (index1 == index2) {
            return 0;
        } else if ((index1 + 1) % 3 == index2) {
            return -1;
        } else {
            return 1;
        }
    }
    public String[] getMoves() {
        return MOVES;
    }

    private int getIndex(String move) {
        for (int i = 0; i < MOVES.length; i++) {
            if (MOVES[i].equalsIgnoreCase(move)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Invalid move: " + move);
    }
}

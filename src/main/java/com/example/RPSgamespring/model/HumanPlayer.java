package com.example.RPSgamespring.model;


import com.example.RPSgamespring.model.Player;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private String name;
    private String move;
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeMove() {
        System.out.println("Enter your move (rock, paper, scissors): ");
        move = scanner.nextLine().trim().toLowerCase();
        return move;
    }

    @Override
    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String getMove() {
        return move;
    }
}
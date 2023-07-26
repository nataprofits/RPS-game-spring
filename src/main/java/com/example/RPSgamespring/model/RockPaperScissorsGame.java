package com.example.RPSgamespring.model;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissorsGame {
    private GameRule gameRule;
    private List<Player> players;

    public RockPaperScissorsGame(GameRule gameRule) {
        this.gameRule = gameRule;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {
        boolean playAgain;
        do {
            String move1 = players.get(0).makeMove();
            String move2 = players.get(1).makeMove();

            int result = gameRule.compareMoves(move1, move2);

            System.out.println(players.get(0).getName() + " chose " + move1);
            System.out.println(players.get(1).getName() + " chose " + move2);
            if (result == 0) {
                System.out.println("It's a draw! Let's replay.\n");
                playAgain = true;
            } else if (result < 0) {
                System.out.println(players.get(1).getName() + " wins!\n");
                playAgain = false;
            } else {
                System.out.println(players.get(0).getName() + " wins!\n");
                playAgain = false;
            }
        } while (playAgain);
    }
}


package com.example.RPSgamespring.controller;

import com.example.RPSgamespring.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {
    private GameRule gameRule = new RockPaperScissorsRule();
    private RockPaperScissorsGame game = new RockPaperScissorsGame(gameRule);
    private Player player1 = new HumanPlayer("Player1");
    private Player player2 = new ComputerPlayer("Computer", (RockPaperScissorsRule) gameRule);
    private List<String> moves = new ArrayList<>();

    @GetMapping("/play")
    public String showGame(Model model) {
        model.addAttribute("moves", moves);
        return "game";
    }


    @PostMapping("/play")
    public String playGame(@RequestParam String userMove, Model model) {

        player1.setMove(userMove.toLowerCase());

        player2.makeMove();

        int result = gameRule.compareMoves(player1.getMove(), player2.getMove());

        moves.add(player1.getName() + " chose " + player1.getMove());
        moves.add(player2.getName() + " chose " + player2.getMove());

        if (result == 0) {
            moves.add("It's a draw! Let's replay.");
        } else if (result < 0) {
            moves.add(player2.getName() + " wins!");
        } else {
            moves.add(player1.getName() + " wins!");
        }

        model.addAttribute("moves", moves);
        return "game";
    }
}


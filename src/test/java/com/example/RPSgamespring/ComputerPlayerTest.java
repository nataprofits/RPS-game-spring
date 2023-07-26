package com.example.RPSgamespring;

import com.example.RPSgamespring.model.ComputerPlayer;
import com.example.RPSgamespring.model.RockPaperScissorsRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerPlayerTest {

    @Test
    public void testMakeMove() {
        RockPaperScissorsRule gameRule = new RockPaperScissorsRule();
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer", gameRule);

        // Test if the move is one of the valid moves
        String move = computerPlayer.makeMove();
        String[] validMoves = gameRule.getMoves();
        boolean isValidMove = false;
        for (String validMove : validMoves) {
            if (validMove.equals(move)) {
                isValidMove = true;
                break;
            }
        }
        assertTrue(isValidMove, "ComputerPlayer should make a valid move");
    }
}
package com.example.RPSgamespring;

import com.example.RPSgamespring.model.HumanPlayer;
import com.example.RPSgamespring.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HumanPlayerTest {
    @Test
    public void testMakeMove(){
        String input = "rock";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Player humanPlayer = new HumanPlayer("Player1");
        String move = humanPlayer.makeMove();

        Assertions.assertEquals("rock", move);
    }
}

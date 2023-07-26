package com.example.RPSgamespring;

import com.example.RPSgamespring.model.GameRule;
import com.example.RPSgamespring.model.RockPaperScissorsRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsRuleTest {
    @Test
    public void testCompareMoves(){
        GameRule gameRule = new RockPaperScissorsRule();

        int result1 = gameRule.compareMoves("rock", "paper");
        Assertions.assertEquals(-1, result1);

        int result2 = gameRule.compareMoves("paper", "rock");
        Assertions.assertEquals(1, result2);

        int result3 = gameRule.compareMoves("rock", "rock");
        Assertions.assertEquals(0, result3) ;
    }
}

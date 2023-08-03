package com.example.RPSgamespring.model;
public class ComputerPlayer implements Player {
    private String name;
    private String move;
    private RockPaperScissorsRule gameRule;

    public ComputerPlayer(String name, RockPaperScissorsRule gameRule) {
        this.name = name;
        this.gameRule = gameRule;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeMove() {
        String[] moves = gameRule.getMoves();

        int index = (int) (Math.random() * moves.length);
        move = moves[index];
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
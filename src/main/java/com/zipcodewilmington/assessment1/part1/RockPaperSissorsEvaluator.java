package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        return (handSign.toLowerCase().equals("rock")) ? "paper" : (handSign.toLowerCase().equals("scissor")) ? "rock" : (handSign.equals("paper")) ? "scissor" : "what";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        return (handSign.toLowerCase().equals("rock")) ? "scissor" : (handSign.toLowerCase().equals("scissor")) ? "paper" : (handSign.equals("paper")) ? "rock" : "what";
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        return getLosingMove(handSignOfPlayer1).equals(handSignOfPlayer2) ? handSignOfPlayer1 : (getLosingMove(handSignOfPlayer2).equals(handSignOfPlayer1) ? handSignOfPlayer2 : "tie");
    }
}

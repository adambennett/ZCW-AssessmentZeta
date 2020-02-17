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
        switch (handSign.toLowerCase()) {
            case "rock":
                return "paper";
            case "scissor":
                return "rock";
            case "paper":
                return "scissor";
            default:
                return "what";
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        switch (handSign.toLowerCase()) {
            case "rock":
                return "scissor";
            case "scissor":
                return "paper";
            case "paper":
                return "rock";
            default:
                return "what";
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (getLosingMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            return handSignOfPlayer1;
        } else if (getLosingMove(handSignOfPlayer2).equals(handSignOfPlayer1)) {
            return handSignOfPlayer2;
        }
        return "tie";
    }
}

public class TennisScoringKata {

    // keep track of scores
    private int player1Score = 0;
    private int player2Score = 0;

    // players
    private String player1;
    private String player2;

    public TennisScoringKata(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // method for updating score when point is won
    public void points(String player) {
        if (player.equals(player1)) {
            player1Score++;
        } else if (player.equals(player2)) {
            player2Score++;
        }
    }

    // method to get score
    public String getScore() {
        // Special conditions
        if (hasPlayerWon(player1Score, player2Score)) {
            return player1 + " wins";
        }
        if (hasPlayerWon(player2Score, player1Score)) {
            return player2 + " wins";
        }
        if (playerDeuce(player1Score, player2Score)) {
            return "Deuce";
        }
        String advantageOrScore = getAdvantageOrScore(player1, player2, player1Score, player2Score);
        if (!advantageOrScore.isEmpty()) {
            return advantageOrScore;
        }

        // If no special conditions are met, return score
        return score(player1Score) + "-" + score(player2Score);
    }

    public boolean hasPlayerWon(int player1Score, int player2Score) {
        return player1Score >= 4 && player1Score - player2Score >= 2;
    }

    public boolean playerDeuce(int player1Score, int player2Score) {
        return player1Score >= 3 && player2Score >= 3 && player1Score == player2Score;
    }

    private String getAdvantageOrScore(String player1, String player2, int player1Score, int player2Score) {
        if (player1Score >= 3 && player2Score >= 3) {
            if (player1Score == player2Score + 1) {
                return "Advantage " + player1;
            }
            if (player2Score == player1Score + 1) {
                return "Advantage " + player2;
            }
        }
        return "";
    }

    // Tennis terms
    private String score(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        TennisScoringKata game = new TennisScoringKata("Player 1", "Player 2");
    }
}

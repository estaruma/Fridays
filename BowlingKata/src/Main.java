public class Main {
    public static void main(String[] args) {
        int[] rolls = {10, 2, 4, 5, 7, 1, 2, 4, 10, 10};
        int totalScore = BowlingScore.score(rolls);
        System.out.println(totalScore);
    }
}
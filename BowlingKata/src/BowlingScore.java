public class BowlingScore {

    // array of rolls and returns score

    public static int score(int[] rolls) {


        // keep track of scores
        int score = 0;
        int rollNumber = 0;

//        // loop to iterate 10 times
//        // Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
//
//        // include only allowed two tries per frame
//
        for (int frame = 0; frame < 10; frame++) {
            // If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
            // for tenth frame
            if (frame == 9) {
                if (isStrike(rolls, rollNumber)) {
                    // If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls,
                    score += 10 + rolls[rollNumber + 1] + rolls[rollNumber + 2];
                    // moveing past the bonus rolls
                    rollNumber += 3;
                } else if (isSpare(rolls, rollNumber)) {
                    score += 10 + rolls[rollNumber + 2];
                    rollNumber += 3;

                    // for 1-9
                } else {
                    if (isStrike(rolls, rollNumber)) {
                        score += 10 + calculateStrikeBonus(rolls, rollNumber);
                        rollNumber += 1;
                    } else if (isSpare(rolls, rollNumber)) {
                        score += 10 + calculateSpareBonus(rolls, rollNumber);
                        rollNumber += 2;

                    } else
                    score += sumOfNoOfPins(rolls, rollNumber);
                    rollNumber += 2;
                }
            }
        }
        return score;
    }


    private static boolean isStrike (int[] rolls, int rollNumber) {
        // strike - knocks down all the pins in one go
        return rolls[rollNumber] == 10;
    }
    private static int calculateStrikeBonus(int[] rolls, int rollNumber) {
            return 10 + rolls[rollNumber + 2] + rolls[rollNumber + 3];
    }

    private static boolean isSpare(int[] rolls, int rollNumber) {
        // spare - knocks down all in 2 goes
        return rolls[rollNumber] + rolls[rollNumber + 1] == 10;

    }

    private static int calculateSpareBonus(int[] rolls, int rollNumber) {
        // and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
        return 10 + rolls[rollNumber + 2];
    }

    // If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
    private static int sumOfNoOfPins(int[] rolls, int rollNumber) {
        return rolls[rollNumber] + rolls[1];
    }

    // If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.




    // We will not check for valid rolls.

    //We will not check for correct number of rolls and frames.

    // We will not provide scores for intermediate frames.

    // If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
//            if (isStrike(rolls, rollNumber)) {
//                rollNumber++;
//            } else if ((rolls, rollNumber)) {
//                score += 10 + calculateStrikeBonus(rolls, rollNumber);
//                rollNumber++
//            } else if (())


}

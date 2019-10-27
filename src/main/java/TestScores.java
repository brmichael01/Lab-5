/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class TestScores {
    //class variable that stores test scores
    private final double[] scores;

    /**
     * Class constructor that accepts test as its argument
     *
     * @param scores scores of a tests
     */
    public TestScores(double[] scores) {
        this.scores = scores;
    }

    /**
     * This method calculates and returns the average of the test scores
     *
     * @return the average of the test scores
     * @throws InvalidTestScore
     */
    public double calculateAverage() throws InvalidTestScore {
        double sum = 0;
        //calculate the total of all the scores
        for (int i = 0; i < scores.length; i++) {
            //if the score is negative or greater than 100
            if (scores[i] < 0 || scores[i] > 100) {
                if (scores[i] < 0) {
                    throw new InvalidTestScore("A score can't be negative");
                } else {
                    throw new InvalidTestScore("A score can't be greater than 100");
                }
            } else {
                sum = sum + scores[i];
            }
        }
        //calculate and return the average of the total scores
        return (sum / scores.length);
    }
}

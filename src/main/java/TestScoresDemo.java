/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
import java.util.Scanner;

/**
 * This class demonstrates the functionality of TestScores class
 */
public class TestScoresDemo {
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TestScores testScores;
        System.out.print("Enter the number of tests: ");
        int numberOfTests = keyboard.nextInt();
        double[] scores = new double[numberOfTests];
        //prompt user to enter the scores
        System.out.println("Enter the test scores: ");
        for (int index = 0; index < numberOfTests; index++) {
            scores[index] = keyboard.nextDouble();
        }
        testScores = new TestScores(scores);
        //calculate the average of the scores entered
        try {
            System.out.println("The average of the scores entered is: " + testScores.calculateAverage());
        } catch (InvalidTestScore invalidTestScore) {
            System.err.println(invalidTestScore.getMessage());
        }
    }
}



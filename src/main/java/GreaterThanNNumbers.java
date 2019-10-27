/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
/**
 * This class class contains a method that accepts an array of integers and a number n and prints the all
 * the numbers in the array that are greater than n
 */
public class GreaterThanNNumbers {
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        //create an array of integers
        int[] numbers = new int[]{45, 56, 99, 41, 32, 1256, 10, 13, 59, 89, 41, 896, 561, 63, 589, 745, 37, 2, 19, 96};
        System.out.println("The numbers in the array are: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();
        printNumbersGreaterThanN(63, numbers);
        System.out.println("\n");
        numbers = new int[]{5, 51, 30, 20, 15, 2, 3, 9, 11, 36, 36, 54, 41, 89};
        System.out.println("The numbers in the array are: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();
        printNumbersGreaterThanN(19, numbers);
    }

    /**
     * This methods accepts an array of integers and a number n and prints the all the numbers in the array that are greater than n
     *
     * @param n       the number to compare the array numbers with
     * @param numbers the array of integers
     */
    private static void printNumbersGreaterThanN(int n, int[] numbers) {
        //loop through the array to find the numbers greater than n
        System.out.println("The numbers which are greater than " + n + " are:");
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > n) {
                System.out.print(numbers[index] + " ");
            }
        }
    }
}


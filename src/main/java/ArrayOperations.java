/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class ArrayOperations {
 /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] data = new int[]{45, 56, 99, 41, 32, 1256, 10, 13, 59, 89, 41, 896, 561, 63, 589, 745, 37, 2, 19, 96};
        System.out.println("The array values are:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("The total of the array values is: " + getTotal(data));
        System.out.println("The average of the array values is: " + getAverage(data));
        System.out.println("The highest of the array values is: " + getHighest(data));
        System.out.println("The lowest of the array values is: " + getLowest(data));
    }

    /**
     * This method calculates and returns the total of the array values
     *
     * @param data array containing integer values
     * @return the total of the values
     */
    private static int getTotal(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    /**
     * This method calculates and returns the average of the array values
     *
     * @param data array containing integer values
     * @return the average of the values
     */
    private static int getAverage(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return (sum / data.length);
    }

    /**
     * This method finds and returns the highest value of all the array values
     *
     * @param data array containing integer values
     * @return the highest value
     */
    private static int getHighest(int[] data) {
        int highest = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > highest) {
                highest = data[i];
            }
        }
        return highest;
    }

    /**
     * This method finds and returns the lowest value of all the array values
     *
     * @param data array containing integer values
     * @return the lowest value
     */
    private static int getLowest(int[] data) {
        int lowest = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < lowest) {
                lowest = data[i];
            }
        }
        return lowest;
    }   
}

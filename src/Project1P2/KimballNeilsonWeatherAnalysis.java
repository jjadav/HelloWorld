//This program takes user input and calculates the
//average temperature of those days
//it also determines the # of days above the average
package Project1P2;

import java.util.Scanner;

public class KimballNeilsonWeatherAnalysis {
    public static void main(String[] args) {

        numOfDays();
    }

    //Step1: ask for user input, # of days
    //this method asks the user for the number of days
    public static void numOfDays() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numdays = console.nextInt();
        createArray(console, numdays);

    }

    //Step2: use user input to create an container
    //this method creates the array with a length specified by the user
    public static void createArray(Scanner console, int numdays) {
        int[] tempArray = new int[numdays];
        int cumSum = 0;
        populateArray(numdays, tempArray, cumSum, console);
    }

    //Step3: populate the container with user input, Temps
    //this method populates the array with user input
    public static void populateArray(int numdays, int[] tempArray, int cumSum, Scanner console) {
        for (
                int i = 0;
                i < numdays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            tempArray[i] = console.nextInt();
            cumSum += tempArray[i];
        }
        determineAverage(numdays, tempArray, cumSum);
    }

    //Step4: determine the average Temp
    //this method determines the average temprature
    public static void determineAverage(int numdays, int[] tempArray, int cumSum) {
        double average = (double) cumSum / (double) numdays;
        average = Math.round(average * 10.0) / 10.0;
        System.out.println("Average temp = " + average);
        numAboveAverage(numdays, tempArray, average);
    }

    //Step5: determine the # of days above the average Temp
    //This method print the number of days that were above the average temp
    public static void numAboveAverage(int numdays, int[] tempArray, double average) {
        int aboveAverage = 0;
        for (
                int i = 0;
                i < numdays; i++) {
            if (tempArray[i] > average) {
                aboveAverage++;
            }
        }
        System.out.println(aboveAverage + " days were above average.");
    }
}



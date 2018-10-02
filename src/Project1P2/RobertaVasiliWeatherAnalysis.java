// This program takes user input and calculates the avg. temp for n days.
// The program also identifies how many days are above avg.

package Project1P2;

import java.util.Arrays;
import java.util.Scanner;

public class RobertaVasiliWeatherAnalysis {

    // class members that can be accessed from all methods of this class
    private static int NumberOfDays = 0;    // number of days
    private static int Sum = 0;             // sum of all temps
    private static double RoundAvg = 0;     // average of temps
    private static int DaysOverAverage = 0; // number of days over average

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // 1. get user input
        int[] arrTemps = getData (console);

        // 2. calculate
        calc (arrTemps);

        // 3. show results
        show ();

    }

    // get user input and return the array with data
    public static int[] getData (Scanner console) {

        // temporary input data holders
        int data = 0;

        // ask user for numberOfDays and store it
        System.out.print("How many days' temperatures? ");
        NumberOfDays = console.nextInt();

        // create the array to store temps from user input
        int[] temps = new int[NumberOfDays];

        // loop to get user input for temps for NumberOfDays
        for(int i = 0; i < NumberOfDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            data = console.nextInt();  // user input
            temps[i] = data;           // store in array
            Sum += data;               // store cumulative sum
        }

        // return temps array from which we'll caclulate
        return temps;
    }

    // calculate from data in the array
    public static void calc (int[] temps) {

        // calc the average
        double average = (double) Sum / NumberOfDays;
        RoundAvg = (Math.round(average * 10.0)) / 10.0;

        // loop to calculate days over avg
        for(int i = 0; i < NumberOfDays; i++) {
            if(temps[i] > RoundAvg) {
                ++DaysOverAverage;
            }
        }
    }

    // show results on console
    public static void show () {
        System.out.println("Average temp = " + RoundAvg);
        System.out.println(DaysOverAverage + " days were above average.");
    }

}
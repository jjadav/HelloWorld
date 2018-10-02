package Project1P2;

import java.util.Scanner;
//This program take user input and calculates the average temperature for n days
//The program also identifies how many days are above the average temperature

public class HenryEatonWeatherAnalysis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = 0;
        intro(console, days);


        //Step 1: Ask for number of days
    }

    public static void intro(Scanner console, int days) { // Asks for user input # of days
        System.out.print("How many days?");
        days = console.nextInt();
        int[] data = new int[days];
        userInput(console, days, data);
    }

    public static void userInput(Scanner console, int days, int[] data) { //Asks for the high temperatures for each day
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            int temp = console.nextInt();
            data[i] = temp;
        }
        averages(data, days);
    }

    public static void averages(int[] data, int days) { //Calculates and prints the average
        int total = 0;
        double average;
        for (int x = 0; x < days; x++) {
            total += data[x];
        }
        average = (double) total / (double) days;
        average = (Math.round(average * 10.0)) / 10.0;
        System.out.println("Average temp = " + average);
        daysAbove(data, days, average);
    }

    public static void daysAbove(int[] data, int days, double average) {
        int counter = 0;
        for (int i = 0; i < days; i++) {
            if (data[i] > average) {
                counter++;
            }
        }
        System.out.println(counter + " days were above average.");
    }
}
//Solution:
//Step 1: Ask for number of days
//Step 2: Ask for n days high temperature, store input in cumulative variable
//Step 3: Calculate and print the average temperature (Cumulative temp/ #of days)
//Step 4: Calculate and print the number of days that the temperature was above average
//This program finds takes user input and finds the average temp and finds how many days are above average.
package Project1P2;

import java.util.Scanner;

public class TomConleyWeatherAnalysis {
    public static void main(String[] args) {
        //Step 1:ask for user input
        Scanner console = new Scanner(System.in);
        populate(console);
    }

    //Step 2:populate the array
    public static void populate(Scanner console) {
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temp = new int[days];
        daily(console, days, temp);
    }

    //Step 3: print daily temps
    public static void daily(Scanner input, int days, int[] temp) {
        int total = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            int dailytemp = input.nextInt();
            temp[i] = dailytemp;
            total += dailytemp;
        }
        calculate(temp, total, days);
    }

    //Step 4: calculate average
    public static void calculate(int[] temp, int total, int days) {
        double avg = (double) total / (double) days;
        avg = (Math.round(avg * 10.0)) / 10.0;
        int count = 0;
        for (int y = 0; y < days; y++) {
            if (temp[y] > avg) {
                count++;
            }
        }
        //Step 5:Print results
        System.out.println("Average temp = " + avg);
        System.out.println(count + " days were above average.");
    }
}


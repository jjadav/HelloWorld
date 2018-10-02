package Project1P2;//Jonny Xue
//Jadav
//Period 2
//This program takes user inputted temperature and calculates the average temperature for x days.
//finally, this programs compares the average temperature to each day prints how many days are above the average.


import java.util.Scanner;

//main method
public class JonnyXueWeatherAnalysis {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        input(console);
    }
//intro and creates array
    public static void input(Scanner console) {
        System.out.println("How many days' temperatures?");
        int days = console.nextInt();

        int[] data = new int[days];
        calcs(days, console, data);
    }
//does the math calculation for finding the average and comparing for the larger value
    public static void calcs(int days, Scanner console, int[] data) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            data[i] = console.nextInt();
            sum = sum + data[i];
        }
        double doubleDays = days;
        double average = sum / doubleDays;
        average = (Math.round(average * 10.0)) / 10.0;
        System.out.println("Average temp" + " = " + average);
        int aboveAverage = 0;
        for (int i = 1; i <= days; i++) {
            if (data[i - 1] > average) {
                aboveAverage++;
            }
        }
        System.out.println(aboveAverage + " days were above average.");

    }
}
//  1.ask for user input
//  2.used input as length of array
//  3. find average temperature
//  3.compare average temp to each temperature
//  4.keep track of count
//  5.print

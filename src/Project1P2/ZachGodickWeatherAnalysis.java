package Project1P2;

import java.util.Scanner;

//This program takes user input and calculates the average temperature for n days. THe program also identifies are
//above average temperature.
public class ZachGodickWeatherAnalysis {
    public static void main(String[] args) {
        //Ask for user input for # of days
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        //Creates variables: days, an array, a cumulative sum variable
        int days = input.nextInt();
        int[] temps = new int[days];
        loop(input, days, temps);
    }
        //Makes a for loop and asks for the high temp and cumulative sum variable runs
        public static void loop(Scanner input, int days, int[] temps){
            double csum = 0.0;
            for (int i = 0; i < temps.length; i++) {
                System.out.print("Day " + (i + 1) + "'s high temp: ");
                csum += input.nextInt();
            }
            avg(days, csum, temps);
        }
        public static void avg(int days, double csum, int[] temps) {
        //Calculates average and rounds to tenth
        double doubleDay = days;
        double avg = csum / doubleDay;
        avg = (Math.round(avg * 10.0)) / 10.0;
        System.out.println("Average temp = " + avg);
        int count = 4;
        //Calculates number of days were above avg temperature
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > avg) {
                count++;
            }
        }
        System.out.println(count + " days were above average.");
    }
    }

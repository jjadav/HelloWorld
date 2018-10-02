//This program takes user-input and calculates the average temperature
//for n-days. The program also identifies how many days are above the average temp.
//
package Project1P2;

import java.util.Scanner;

public class ConnorSundinWeatherAnalysis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
         userInput(console);


    }

       public static void userInput (Scanner console) {
           System.out.print("How many days worth of temperature?");
           int days = console.nextInt();
           int[] temps = new int[days];
           dayTemperatures(days,temps,console);


       }
       public static void dayTemperatures(int days, int[] temps, Scanner console) {
           int sum = 0;
           for (int i = 0; i < days; i++) {
               System.out.print("Day " + (i + 1) + "'s high temp: ");
               temps[i] = console.nextInt();
               sum = sum + temps[i];
           }
           averageAbove(days, sum, temps, console);
       }

        public static void averageAbove(int days, int sum, int[] temps, Scanner console){
        double average= sum/days;
        average = (Math.round(average * 10.0)) / 10.0;
        System.out.println("Average Temperature: "+ average);
        int numAbove=0;
        for(int i=0; i< temps.length; i++){
            if(temps[i]>average){
                numAbove++;
            }
        }
        System.out.println("There are " + numAbove + " days above average.");


    }
}
//Solution:
//Step 1: Ask for number of days
//Step 2: Ask for n days high temp, store input in cumulative variable
//Step 3: Calculate and print the average temperature (Cumulative temp/ # of days)
//Step 4: Calculate and print the number of days that the temperature was above average
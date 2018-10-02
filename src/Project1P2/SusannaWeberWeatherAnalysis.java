package Project1P2;

//ALGORITHM
//ask the user how many days they are checking the temperature
//record the temperature on each day
//add all variables together and divide by number of days to get average temperature
//compare all elements of temperature array to average and print how many of them are greater than the average

import java.util.Arrays;
import java.util.Scanner;


public class SusannaWeberWeatherAnalysis {
    //this program takes user input and finds the average temperature over a number of days
    // as well as the days that were above the average temperature


        public static void main (String[] args) {
            //the main method asks for user input
            // then declares the scanner and the array
            //declares and prints out out the average temperature
            //and prints out the number of days above average, using an if-else statement

            System.out.println("How many days' temperatures?");

            Scanner in = new Scanner(System.in);
            int number_of_days = in.nextInt();

            double [] temperatures = new double [number_of_days];

            double average = temps(temperatures, in);

            System.out.println("Average temp = " +  average );

            int days_above_avg = stats(temperatures, average);

            if( days_above_avg > 1) {
                System.out.println(  stats(temperatures, average)+ " days were above average.");
            }
            else {
                System.out.println( "1 day was above average.");
            }

        }


        public static double temps (double [] temperatures, Scanner in) {
            //this method goes through the array and calculates the sum of all temperatures using a for loop
            // then it calculates and returns the average temperature

            double total = 0;

            for (int i = 0; i < temperatures.length; i++) {

                System.out.println("Day " + (i +1) + "'s" + " high temp: ");

                temperatures[i] = in.nextDouble();

                total  +=  temperatures[i];


            }

            double average = Math.round(total/ temperatures.length* 100.0) / 100.0;

            return average;
        }

        public static int stats (double [] temperatures, double average) {
            //this method uses a for loop to find all the temperatures in the array that are above average
            //then it returns the number of days that are above average


            int days_above_avg = 0;

           for(int j = 0; j < temperatures.length; j++) {
               if(temperatures[j] > average) {
                   days_above_avg += 1;

               }
           }
            return days_above_avg;


        }

}

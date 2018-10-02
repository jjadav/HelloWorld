//this program takes user input and calculates the average temperature for n days
//the program also identifies how many days are above the average temperature
package Project1P2;

import java.util.Scanner;

public class JustinFiorilloWeatherAnalysis {
    public static void main(String [] args) {

        //Step1: Ask for user input for number of days
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int num = console.nextInt();

        //Step2: Create an array with the variable stored for number of days
        int[] weather = new int[num];
        fillarray(console,weather);
    }
        public static void fillarray(Scanner console, int[] weather){
            double sum = 0;
            int temp = 0;

            //Step3: Ask the user for the temperatures inside the loop
            for (int i = 0; i <= weather.length - 1; i++) {
                System.out.print("Day " + (i + 1) + "'s high temp: ");
                temp = console.nextInt();

                //Step4: Store the information in an array
                weather[i] = temp;
                sum = sum + temp;
            }
            average(weather,sum);
        }


        public static void average(int[] weather, double sum) {

            //Step5: Calculate the average of the values inside array
        int count = 1;
                double averagesum = (Math.round((sum/weather.length) * 10.0)) / 10.0; //rounding formula
                for(int i = 1; i <= weather.length-1; i++) {

                    //Step6: Calculate how many days were above the average with a for loop
                    if (weather[i] > averagesum) {
                        count++;    //variable for days above average

                    }
                }
                conclusion(averagesum,count);
        }

    //Step7: Print the results
    public static void conclusion(double average, int count) {
        System.out.println("Average temp = " + average);
        System.out.println(count + " days were above average.");
    }

}

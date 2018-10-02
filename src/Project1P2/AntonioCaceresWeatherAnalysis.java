package Project1P2;

import java.util.Arrays;
import java.util.Scanner;

//This program takes user input and calculates the mean temp.
// for n-days The program also identifies how many days are above the mean
public class AntonioCaceresWeatherAnalysis {
    public static void main(String[] args) {
        //Step1: Ask for the number of days the user want(prerequisite: integer)
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? "); //user input
        int input = console.nextInt();
        calc(input, console);

    }

    public static void calc(int num, Scanner s) {
        int[] days = new int[num];
        int sum = 0;
        int temp = 0;
        double average = 0.0;
        //Step2: Create an array of integers with based on user input #
        //Step3: Read in the user input for the array(within for loop)

        for (int i = 1; i <= num; i++) {
            System.out.print("Day " + (i) + "'s high temp: ");
            temp = s.nextInt();
            //Step4: sum the values within the array(within for loop)(cumulative sum)
            days[i - 1] = temp;
            sum += temp; // cumulative sum variable

        }
        //Step5: calculate average
        average = (double) sum / num;
        average = (Math.round(average * 10.0)) / 10.0; // round to the nearest tenth
        System.out.println("Average temp = " + average);
        compavg(average, days, num);
    }


    public static void compavg(double avg, int[] days, int num) {
        int count = 0;
        // Step6: compare other values with the average

        for (int j = 0; j < num; j++) {
            if (days[j] > avg) {
                count++;
            }
        }
        //Step7: Print input(x days were above average)
        if (count > 1) {
            System.out.println(count + " days were above average."); // to avoid plural use of days for 1 day
        } else {
            System.out.println("1 day was above average.");


        }
    }
}
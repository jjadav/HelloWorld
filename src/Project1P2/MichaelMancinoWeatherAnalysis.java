package Project1P2;

import java.util.Scanner;
public class MichaelMancinoWeatherAnalysis {
    public static void main(String[]args) {
        //1. Algorithm for the weather project
        //2. Initialize a cumulative sum variable and an array
        //3. Make a for loop to fill the array and add the cumulative sum variable
        //4. calculate the average
        //5. This program calculates the average temperature for any number of days.
        //6. It also calculates how many temps are above average

        Scanner scan = new Scanner(System.in);
        calctemp(scan);



    }
    public static void calctemp(Scanner scan){
        System.out.println("Welcome to the temperature calculator! This takes a certain amount of temperatures and calculates the average of them");
        System.out.println("It also tells you how many days had an above average temperature.");
        System.out.println("How many days' temperatures?");

        calcs(scan);
    }
    public static void calcs(Scanner scan){
        //Creates array and fills it via user input and a for loop
        int ArLength = scan.nextInt();
        int[] TempList = new int[ArLength];
        double CumSum = 0;
        for(int i = 0; i<ArLength; i++) {
            System.out.print("Day " + (i + 1)  + "'s high temp: ");
            int temp = scan.nextInt();
            System.out.println("");
            TempList[i] = temp;
            CumSum += temp;



        }
        int AboveAvg = 0;
        finish(CumSum,ArLength,AboveAvg,TempList);

    }
    public static void finish(double CumSum, int ArLength,int AboveAvg, int[] TempList){
        //Calculates and rounds the average
        CumSum = CumSum/ArLength;
        CumSum =(Math.round(CumSum * 10.0)) / 10.0;;
        System.out.println("Average temp = " + CumSum);
        for(int j = 0; j<ArLength;j++) {
            if (TempList[j] > CumSum){
                AboveAvg++;
            }
        }
        System.out.println(AboveAvg +" days were above average.");
    }
}

package Project1P2;

import java.util.Scanner;

/*This program takes user input and calculates the average temperature for n days. The program also identifies how many days are
above average*/
public class ChristopherTroinaWeatherAnalysis {
    public static void main(String[] args){
        //Step 1: Take user input for number of days and temperatures
        //Step 2: Record number of days with an array and a cumulative sum variable
        //Step 3: Calculate the average
        //Step 4: Figure out which days are above average
        //Step 5: Print results
        Scanner console= new Scanner(System.in);
        input(console);
    }
    public static void input(Scanner console){
        System.out.print("How many days' temperatures? ");
        //User input for number of days
        int days=console.nextInt();
        int[] temps=new int[days];
        //array for storing user input for temperature
        int sum=0;
        for(int i=1;i<=days;i++) {
            //user input for temperature being stored in array, along with cumulative sum variable
            System.out.print("Day " + i + "'s high temp: ");
            temps[i - 1] = console.nextInt();
            sum+=temps[i-1];
        }
        //calling average method
        average(temps, sum, days);
    }
    public static void average (int[] temps, int sum, int days){
        //calculating the average
        double avtemp=Math.round((sum/(double)days)*10.0)/10.0;
        //printing the average
        System.out.println("Average temp = "+avtemp);
        //figuring out the days above the average
        int above=0;
        for(int i=0;i<days;i++){
            if((double)temps[i]>avtemp){
                above++;
            }
        }
        //printing amount of days above the average
        System.out.println(above+" days were above average.");
    }
}


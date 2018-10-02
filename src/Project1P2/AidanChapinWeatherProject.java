package Project1P2;

import java.util.Scanner;
public class AidanChapinWeatherProject {
    public static int days;//integer day is public because every method needs it
    public static void main(String args[]){
        userInput();
    }
    public static void userInput() {//takes all info needed from user
        System.out.print("How many days' temperatures? ");//asks for input
        Scanner scan = new Scanner(System.in);
        days = scan.nextInt();//amount of days to take the average of
        double average = 0;//cumulative sum variable
        int[] temps = new int[days];//array we store temperatures in
        for (int x = 0; x < days; x++) {//asks for each day
            System.out.print("Day " + (x + 1) + "'s high temp: ");
            temps[x] = scan.nextInt();//stores temperatures in array
            average = average + temps[x];//adds temperature to cumulative sum variable
        }
        average(average, temps);//calls average method
    }
    public static void average(double average, int[] temps){//takes info from the userInput() method and
        //calculates the average temperature, and checks to see how many are above the average
        average = Math.round(((average/days)*10))/10.0;//round average to one decimal point
        int count = 0;//cumulative sum variable for days above average
        for(int x = 0; x < days; x++){//checks every day in the array and it's temperature
            if(temps[x] > average){//if the temperature is greater than average
                count++;//add a day to the cumulative sum variable
            }
        }
        System.out.println("Average temp = " + average);//prints average
        System.out.println(count + " days were above average.");//prints days above average
    }
}

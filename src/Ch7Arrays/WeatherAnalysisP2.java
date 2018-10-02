//This programs takes user-input and calculates the
//average temperature for n-days. The program also
//identifies how many days are above the average temp.
package Ch7Arrays;

import java.util.*;

public class WeatherAnalysisP2 {
    public static void main(String[] args) {
        //1: Ask for the number of days (integer days)
        //2: Create an array of ints of size days
        //3: Read-in the user input for the array (for loop)
        //4: Sum the values within the array (inside for loop)
        //5: Take the average
        //6: Compare the average with the values in the array
        //7: Print the output. (There are x days above the average)

        Scanner console = new Scanner(System.in);
        System.out.print("How many days would you like?");
        int days = console.nextInt();
        createArray(days, console);



    }

    public static void createArray(int days, Scanner console){
        int[] temps = new int[days];
        int total = 0;
        for(int i = 0; i < days; i++){
            System.out.print("Add a temperature: ");
            temps[i] = console.nextInt();
            total += temps[i];
        }
        takeAverage(temps, total, days);
    }

    public static void takeAverage(int[] temps, int total, int days){
        double average =  ((double)total / (double)days);
        average = (Math.round(average * 10.0)) / 10.0;
        int daysAbove = 0;
        for(int i = 0; i<temps.length; i++){
            if(temps[i] > average){
                daysAbove++;
            }
        }
        endProduct(average, daysAbove);

    }

    public static void endProduct(double average, int daysAbove){
        System.out.println("There are " + daysAbove + " days above the average temperature of " + average + " degrees.");
    }
}

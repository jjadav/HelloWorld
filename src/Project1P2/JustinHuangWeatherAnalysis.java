package Project1P2;

import java.util.Arrays;
import java.util.Scanner;

public class JustinHuangWeatherAnalysis {
    public static void main(String[] args){

            GetTemps();

    }
    public static void GetTemps() {
        //initializes scanner (user input)
        Scanner scan=new Scanner(System.in);

        System.out.print("How many days' temperatures? ");
//gets the number of inputs
        int x=scan.nextInt();

        int y=0;

        int sum=0;

        int[] ray=new int[x];
//gets the temperatures
        for(int i=1;i<x+1;i++) {
            System.out.print("Day "+i+"'s high temp: ");
            y=scan.nextInt();
            sum=y+sum;
            ray[i-1]=y;
        }
        Calculate(sum,x,ray);

    }
    public static void Calculate(int sum, int x,int[] ray) {
        //gets the average
        double avg=Math.round((sum/x)*10.0)/10.0;


        System.out.println("The average is: "+avg);

        int counter=1;
//looks at how many days are above average
        for(int i=0;i<ray.length-1;i++){

            if(ray[i]>avg){

                counter++;

            }

        }
        System.out.println(counter+" days were above average.");

    }
}

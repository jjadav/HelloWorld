package Project1P2;

import java.util.Scanner;

public class LukeDohertyWeatherAnalysis {
    public static void main(String[] args) {
        int days = 0; //days
        double temp = 0; //temperature
        double sum = 0; //for calc average

        Scanner scan = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        days = scan.nextInt();//uses days > user input
        double ddays = days / 1.0; //making days int into double
        double[] box = new double[days];//creates array
        intro(days, temp, box, scan);
        calculations(box, ddays, days, sum);//method for calc average/etc
    }
    public static void intro(int days, double temp, double[] box,Scanner scan){
        for(int i = 0; i < days; i++){//for loop counting/printing days
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temp = scan.nextDouble();
            box[i]= temp;
        }
    }
    public static void calculations(double[] box, double ddays,int days, double sum) {
        int end = 0;
        for (int j = 0; j < days; j++) {
            sum += box[j];//adding to array for average

        }
        sum = (sum / ddays);//average
        sum = (Math.round(sum * 10.0)) / 10.0;//rounding average
        System.out.println("Average temp = " + sum);
        for (int m = 0; m < days; m++) {
            if (box[m] > sum) {
                end++;//calc. temps above average
            }
        }
        System.out.println(end + " days were above average.");//print

    }
}


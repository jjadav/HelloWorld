package Project1P2;

import java.util.Scanner;

public class AbbyO_ConnellWeatherAnalysis {
    public static void  main(String[]args){
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("How many days would you like?");
        int days = input.nextInt();
        int days1= days;// days1 does not have 1 subtracted from it
        int weather[]= new int[days];

         days=days-1;// 1 is subtracted because the index starts at 0
         enter(days, days1, weather, input, sum);
        average(sum, days1, days, weather);


    }
    public static void average (int sum, int days1, int days, int[] weather   ){//finding the average
        System.out.println(sum);
        double average= sum/days1;
        average = (Math.round(average * 10.0)) / 10.0;
        System.out.println("The average weather is "+average);
        int larger=1;
        for(int i=0; i<days; i++){
            if(average < weather[i]){
                larger++;
            }
        }
        System.out.println(larger+" Were above average");
        int smaller=1;
        for(int i=0; i<days; i++){
            if(average < weather[i]){
                smaller++;
            }
        }
        System.out.println(smaller+" Were below average");
    }
    public static void enter (int days,int days1, int[] weather, Scanner input, int sum){//user input/ entering information
        for(int i=0;i<=days;i++){
            System.out.println("Enter data");
            int data= input.nextInt();
            weather[i]= data;
            sum= sum+data;

        }

    }
}

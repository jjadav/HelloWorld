package Ch7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        //Step1: declare an array
        int[] numbers = new int[10];    //an array of 10 integers
        System.out.println(Arrays.toString(numbers));

        //Step2: initialize an array
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));

        //declare and initialize an array
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        */

        //int randomNumber = (int)(Math.random()*11)+10; //creates a random number
                                             //between [1.0, 11.0)
        //System.out.println(randomNumber);
        //Step1: create an array of random size between 1-10

        //Formula:
        //(int)(Math.random() * ((Max - Min) + 1))+Min
        int randomSize = (int)(Math.random()*11)+10;
        int[] randomArray = new int[randomSize];

        //Step2: populate the array with random numbers between 1-10
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*11)+10;
        }

        //Step3: print the array
        System.out.println(randomArray.length);

        System.out.println(Arrays.toString(randomArray));

    }
}

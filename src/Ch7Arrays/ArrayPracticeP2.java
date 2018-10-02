package Ch7Arrays;

import java.util.Arrays;

public class ArrayPracticeP2 {
    public static void main(String[] args) {
        /*
        //Step1: declare a variable
        int x;
        int[] numbers1 = new int[5]; //an integer array of size 5
        //Step2: initialize the variable
        x = 5;
        System.out.println(Arrays.toString(numbers1)); //before populating the array
        for (int i = 0; i < 5; i++) {
            numbers1[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers1)); //after populating the array


        //OR
        //Step1&2: declare and initialize
        int y = 5;
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2)); //after populating the array
        */
        int randomNumber = (int)(Math.random()*10) + 1; //create random number
                                             //between [1.0, 11.0)
        //System.out.println(randomNumber);
        System.out.println(randomNumber);

        int[] randomArray = new int[randomNumber];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*10) + 1;
        }

        System.out.println(Arrays.toString(randomArray));
    }
}

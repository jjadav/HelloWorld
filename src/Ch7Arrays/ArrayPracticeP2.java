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

        int randomNumber = (int)(Math.random()*10) + 1; //create random number
                                             //between [1.0, 11.0)
        //System.out.println(randomNumber);
        System.out.println(randomNumber);

        int[] randomArray = new int[randomNumber];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*10) + 1;
        }

        System.out.println(Arrays.toString(randomArray));
        */
        //669260267
        int number = 57135203;
        System.out.println("Mode is: " + goodMode(number));
    }

    //Michael's algorithm for tally
    public static int badMode(int num) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        //We DO NOT know how many times this will run (0,1, or many times)
        while(num > 0){
            int digit = num % 10;
            if(digit == 0){
                count0++;
            }else if(digit == 1){
                count1++;
            }else if(digit == 2){
                count2++;
            }else if(digit == 3){
                count3++;
            }else if(digit == 4){
                count4++;
            }else if(digit == 5){
                count5++;
            }else if(digit == 6){
                count6++;
            }else if(digit == 7){
                count7++;
            }else if(digit == 8){
                count8++;
            }else{
                count9++;
            }
            num = num/10;
        }
        int max1 = Math.max(count0,Math.max(count1,Math.max(count2,count3)));
        int max2 = Math.max(count4,Math.max(count5,Math.max(count6,count7)));
        int max3 = Math.max(count8,count9);

        int maxFinal = Math.max(max1,Math.max(max2,max3));

        if(maxFinal == count0){
            return 0;
        }else if(maxFinal == count1){
            return 1;
        }else if(maxFinal == count2){
            return 2;
        }else if(maxFinal == count3){
            return 3;
        }else if(maxFinal == count4){
            return 4;
        }else if(maxFinal == count5){
            return 5;
        }else if(maxFinal == count6){
            return 6;
        }else if(maxFinal == count7){
            return 7;
        }else if(maxFinal == count8){
            return 8;
        }else{
            return count9;
        }
    }
    //Justin's algorithm for mode
    public static int goodMode (int num){
        //Step1: extract each digit from the number and use the
        //array to tally each digit
        int[] digitsArray = new int[10];
        while(num > 0){
            int digit = num % 10;
            digitsArray[digit]++;
            num = num / 10;
        }
        //Step2: traverse the array to find the index of the mode
        int bestIndex = 0;
        for (int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] > digitsArray[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;

        /*
        int modeIndex = 0;
        int mode = digitsArray[0];
        for (int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] > mode) {
                mode = digitsArray[i];
                modeIndex = i;
            } else if (digitsArray[i] == mode && i < modeIndex) {
                modeIndex = i;
            }
        }

        return modeIndex;
        */

        /*
        for(int i = 1; i < digitsArray.length; i++){
            int maxNum = digitsArray[i-1];
            if(digitsArray[i] > maxNum){
                maxNum = digitsArray[i];
            }

        }
        return digitsArray.indexOf(maxNum);
        */

    }
}

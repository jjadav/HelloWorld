package Ch7Arrays;

import java.util.Arrays;

//Create a program that prints the multiplication table
//from 1 through 5
public class Arrays2DP2 {
    public static void main(String[] args){
        //Step1: declare a 2D array
        int[][] table = new int[5][10];
        for(int row=0; row<table.length; row++){
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }

        for(int row=0; row<table.length; row++){
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row+1) * (col+1);
            }
            System.out.println();
        }

        for(int row=0; row<table.length; row++){
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }

        //System.out.println(Arrays.toString(table));


    }
}

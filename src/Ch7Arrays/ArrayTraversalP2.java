package Ch7Arrays;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArrayTraversalP2 {
    public static void main(String[] args) {
        int[] array = {5, 8, 7, 12};
        System.out.println("before calling Jonny's algo" +
                Arrays.toString(array));
        array=jonnyAlgo(array);
        System.out.println("after calling Jonny's algo" +
                Arrays.toString(array));
    }

    //Jonny's algorithm uses the concept of an in-array swap
    public static int[] jonnyAlgo(int[] ja) {
        for(int i=0;i<ja.length/2;i++){
            int temp=ja[i];
            ja[i]=ja[ja.length-i-1];
            ja[ja.length-i-1]=temp;
        }
        return ja;
    }

    //Abby's algorithm uses a temporary array
    public static int[] abbyAlgo(int[] aa) {
        //Step1: create a new temp integer array of the same size
        int[] temp = new int[aa.length];
        //Step2: copy the contents of original array into the new
        //array in reverse order
        for (int i = aa.length - 1; i >= 0; i--) {
            temp[aa.length - i - 1] = aa[i];
        }
        aa = temp;
        //System.out.println(Arrays.toString(aa));
        return aa;
    }
}

package Ch7Arrays;

import java.util.Arrays;

public class ArrayTraversalP7 {
    public static void main(String[] args){
        int[] array = {5, 2, 4, 1};
        System.out.println("before calling Michelle & Matthew's algo " +
                Arrays.toString(array));
        array=oliverAlgo(array);
        michelleMattAlgo(array);
        System.out.println("after calling Michelle & Matthew's algo " +
                Arrays.toString(array));
    }

    //Oliver algorithm reverses the array by using a temporary
    //array
    public static int[] oliverAlgo(int[] oa) {
        int[] reversed = new int[oa.length];
        for(int i = reversed.length-1; i>=0; i--){
            reversed[i] = oa[oa.length-i-1];
        }
        return reversed;
        //return oa;
        //System.out.println(Arrays.toString(reversed));
    }

    //Michelle & Matthew's algorithms suggests that we do an
    //in-array swap of first and last elements and continue to do
    //so until length of the array divide by 2

    public static void michelleMattAlgo(int[] mma) {
        int temp;
        for (int i = 0; i < mma.length / 2; i++) {
            temp = mma[i];
            mma[i] = mma[mma.length - i - 1];
            mma[mma.length - i - 1] = temp;
        }
    }
}

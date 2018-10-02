package Ch7Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }


    public static void reverseArray(int[] arr)
    {
        int mid = arr.length/2;
        for (int i = 0; i < mid; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void swapPairs(String[] a) {
        for (int i = 0; i < a.length - 1; i += 2) {
            String temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }
}

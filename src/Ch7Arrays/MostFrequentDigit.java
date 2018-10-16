package Ch7Arrays;

public class MostFrequentDigit {
    public static void main(String[] args) {
        System.out.println(liamPriceAlgo(669260267));
        System.out.println(liamPriceAlgo(57135203));

    }

    public static int liamPriceAlgo(int n) {
        //Step0: Create an array of integers
        int[] digitsTally = new int[10];
        //Step1: Extract each digit from n until n > 0
        while (n > 0) {
            int digit = n % 10;
            //Step2: Tally the digitsTally of n
            digitsTally[digit]++;
            n /= 10;
        }
        //Step3: Traverse the array to locate the index where
        //the largest value is stored. In the event of a tie,
        //select the index of the smaller mode
        int modeIndex=0;
        for (int i = 1; i < digitsTally.length; i++) {
            if (digitsTally[i] > digitsTally[modeIndex]) {
                modeIndex = i;
            }
        }
        return modeIndex;
    }
}

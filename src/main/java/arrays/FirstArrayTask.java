package arrays;

import java.util.Random;

public class FirstArrayTask {


    public static int getCountEvenNumbers(int[] array) {
        int numbersAmount = 0;
        for (int value : array) {
            if (value % 2 == 0) numbersAmount++;
        }
        return numbersAmount;
    }
}

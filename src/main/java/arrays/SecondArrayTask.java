package arrays;

public class SecondArrayTask {
    public static int fullSize(int[] firstArray, int[] secondArray) throws NegativeArraySizeException, OutOfMemoryError {
        return firstArray.length + secondArray.length;
    }
}

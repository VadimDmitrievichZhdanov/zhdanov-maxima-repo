import arrays.EndsWith;
import arrays.FirstArrayTask;
import arrays.SecondArrayTask;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testFirstArrayTask() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
        }
        System.out.println(FirstArrayTask.getCountEvenNumbers(array));
    }

    @Test
    public void testSecondArrayTask() {
        int[] array1 = new int[10];
        int[] array2 = new int[25];
        System.out.println(SecondArrayTask.fullSize(array1, array2));
    }

    @Test
    public void testEndsWith() {
        char[] array1 = new char[]{'h','i',' ','p','r','i','v','e','t'};
        char[] array2 = new char[]{'h','i',' ','p','r','i','v','u','t'};
        System.out.println(EndsWith.endsWith(array1, array2));
    }
}
import arrays.EndsWith;
import arrays.FirstArrayTask;
import arrays.SecondArrayTask;
import branchoperators.movie.MovieAccessService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

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
        Assert.assertEquals(35, SecondArrayTask.fullSize(array1, array2));
    }

    @Test
    public void testSecondArrayTask2() {
        int[] array1 = new int[0];
        int[] array2 = new int[0];
        Assert.assertEquals(0, SecondArrayTask.fullSize(array1, array2));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testSecondArrayTask3() {
        int[] array1 = new int[-1];
        int[] array2 = new int[0];
        Assertions.assertEquals(NegativeArraySizeException.class, SecondArrayTask.fullSize(array1, array2));
    }

    @Test(expected = OutOfMemoryError.class)
    public void testSecondArrayTask4() {
        int[] array1 = new int[999999999];
        int[] array2 = new int[100000000];
        Assertions.assertEquals(OutOfMemoryError.class, SecondArrayTask.fullSize(array1, array2));
    }

    @Test
    public void testEndsWithEqual() {
        char[] array1 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'e', 't'};
        char[] array2 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'e', 't'};
        System.out.println(EndsWith.endsWith(array1, array2));
    }

    @Test
    public void testEndsWithNotEqual3() {
        char[] array1 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'e', 't'};
        char[] array2 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'z', 'u', 'z'};
        System.out.println(EndsWith.endsWith(array1, array2));
    }

    @Test
    public void testEndsWithNotEqual2() {
        char[] array1 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'e', 't'};
        char[] array2 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'z', 'u', 't'};
        System.out.println(EndsWith.endsWith(array1, array2));
    }

    @Test
    public void testEndsWithNotEqual1() {
        char[] array1 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'e', 't'};
        char[] array2 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'u', 't'};
        System.out.println(EndsWith.endsWith(array1, array2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEndsWithNotEqualException() {
        char[] array1 = new char[]{'h', 'i', ' ', 'p', 'r', 'i', 'v', 'e', 't'};
        char[] array2 = new char[]{'h'};
        Assertions.assertEquals(ArrayIndexOutOfBoundsException.class, EndsWith.endsWith(array1, array2));
    }

    @Test
    public void testMovieAccessServiceIntern() {
        Assertions.assertEquals("Access is denied", MovieAccessService.accessMovie(5));
    }

    @Test
    public void testMovieAccessServiceAdult() {
        Assertions.assertEquals("Rating F. Access is allowed.", MovieAccessService.accessMovie(99));
    }

    @Test
    public void testMovieAccessServiceJunior() {
        Assertions.assertEquals("Rating R. Access is allowed.", MovieAccessService.accessMovie(20));
    }

    @Test
    public void testMovieAccessServiceNegative() {
        Assertions.assertEquals("Invalid age, check the visitor", MovieAccessService.accessMovie(-1));
    }
}
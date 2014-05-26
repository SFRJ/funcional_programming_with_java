import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.lineSeparator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RecursionPracticeTest {

    @Test
    public void fibonacci() {
        Integer[] numbers = {1,1,2,3,5,8,13,21,34,55,89,144};
        List<Integer> list = Arrays.asList(numbers);
        assertThat(RecursionPractice.fibonnaci(12), is(list));
    }

    @Test
    public void addsNumbers() {
        Integer[] numbers = {1,2,3,4};
        List<Integer> list = Arrays.asList(numbers);
        assertThat(RecursionPractice.addNumbers(list), is(10));
    }

    @Test
    public void factor() {
        assertThat(RecursionPractice.factor(5), is(120));
    }

    @Test
    public void largest() {
        Integer[] numbers = {1,9,3,4};
        List<Integer> list = Arrays.asList(numbers);
        assertThat(RecursionPractice.largestNumber(list), is(9));
    }

    @Test
    public void pascalTriangle() {
        RecursionPractice.printPascalRecursion(5);
    }
}

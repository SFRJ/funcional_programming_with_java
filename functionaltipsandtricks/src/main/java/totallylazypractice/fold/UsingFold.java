package totallylazypractice.fold;

import com.googlecode.totallylazy.Callable2;

import java.util.ArrayList;
import java.util.List;

import static com.googlecode.totallylazy.Sequences.sequence;

/*
Fold
Starting with a “seed” value, traverse through the collection and use each element
to build up a new final value where each element from the original collection “con-
tributes” to the final value. An example is summing a list of integers.
*/
public class UsingFold {

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        Integer foldedValue = sequence(numbers).fold(new Integer(0), sum());
        System.out.println(foldedValue);
    }

    private static Callable2<Integer, Integer, Integer> sum() {
        return new Callable2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer a, Integer b) throws Exception {
                return a + b;
            }
        };
    }
}

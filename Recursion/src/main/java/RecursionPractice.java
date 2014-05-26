import java.util.ArrayList;
import java.util.List;

import static java.lang.System.lineSeparator;

public class RecursionPractice {
    public static Integer addNumbers(List<Integer> list) {
        return list == null || list.isEmpty()  ? 0 : list.get(0) + addNumbers(list.subList(1,list.size()));
    }

    public static Integer factor(int number) {
        return number == 1 ? 1 : number * factor(number - 1);
    }

    public static Integer largestNumber(List<Integer> list) {
        if(list == null || list.size() == 0)
            return 0;
        return list.get(0) > largestNumber(list.subList(1,list.size())) ? list.get(0) : largestNumber(list.subList(1,list.size()));
    }

    public static List<Integer> fibonnaci(int limit) {
        //First 2 numbers of the list have to be given in order to do fibonacci
        List<Integer> fibonaccinumbers = new ArrayList<Integer>();
        fibonaccinumbers.add(1);
        fibonaccinumbers.add(1);
        //Wrapper function used to pass an additional argument to a subsidiary function which solves a more general problem
        return wrapper(limit,fibonaccinumbers);
    }

    private static List<Integer> wrapper(int limit, List<Integer> numbers) {
        //The base case of this recursive function(aka. Termination case)
        if(limit == numbers.size()) {
            return numbers;
        }
        //The solution of the trivial case(No recursion involved)
       int current = numbers.size() - 1;
       int previous = numbers.size() - 2;
       int number = numbers.get(current) + numbers.get(previous);
       numbers.add(number);
       //The recursive case(Tail recursion in this case)
       return wrapper(limit, numbers);
    }

    public static int recrPascal(int row, int col)
    {
        int val1, val2;
        if (row == 0 || col == 0 || row == col + 1)
        {
            return 1;
        }

        val1 = recrPascal(row - 1, col - 1);
        val2 = recrPascal(row - 1, col);

        return val1 + val2;
    }

    public static void printPascalRecursion(int maxRows)
    {
        for (int i = 0; i <= maxRows; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(recrPascal(i, j) + " ");
            }
            System.out.println();

        }
    }

}

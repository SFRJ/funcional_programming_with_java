package totallylazypractice.map;

import com.googlecode.totallylazy.Callable1;

import java.util.ArrayList;
import java.util.List;

import static com.googlecode.totallylazy.Sequences.sequence;

public class UsingMap {

/*
Map
Create a new collection where each element from the original collection is trans-
formed into a new value. Both the original collection and the new collection will
have the same size. (Not to be confused with the Map data structure.)
*/

    public void refillGlass(List<Glass> glass) {
        System.out.println("Before refill: \n" +
        glass.toString());
        System.out.println("After refill: \n" +
                sequence(glass).map(refill()).toList());

    }

    private Callable1<Glass, Object> refill() {
        return new Callable1<Glass, Object>() {
            @Override
            public Object call(Glass glass) throws Exception {
                if(glass.getContentPercentage() < 50) {
                    glass.setContentPercentage(100);
                }
                return glass;
            }
        };
    }

    public static void main(String[] args) {
        UsingMap usingMap = new UsingMap();
        final List<Glass> glasses = new ArrayList<Glass>() {
            {
                add(new Glass(70));
                add(new Glass(13));
                add(new Glass(10));
                add(new Glass(14));
                add(new Glass(0));
                add(new Glass(98));
            }
        };

        usingMap.refillGlass(glasses);
    }
}

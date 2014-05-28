package totallylazypractice.filter;

import com.googlecode.totallylazy.Predicate;

import java.util.List;

import static com.googlecode.totallylazy.Sequences.sequence;
/*
Filter
Create a new collection, keeping only the elements for which a filter method returns
true . The size of the new collection will be less than or equal to the size of the
original collection.
*/
public class UsingFilter {

    public void countOverAge() {
        List<Person> persons = sequence(
                new Person(18, "Peter"),
                new Person(19, "Mark"),
                new Person(15, "Nancy"))
                .filter(overAge()).toList();
        System.out.println("There are " + persons.size() + " over age persons in the list");
    }

    private Predicate<Person> overAge() {
        return new Predicate<Person>() {
            @Override
            public boolean matches(Person person) {
                return person.getAge() >= 18;
            }
        };
    }

    public static void main(String[] args) {
        UsingFilter usingFilter = new UsingFilter();
        usingFilter.countOverAge();
    }
}

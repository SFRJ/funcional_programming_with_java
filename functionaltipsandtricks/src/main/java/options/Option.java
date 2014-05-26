/*
    Functional programming for Java Developers(Dean Wampler) - page 17)
    In a pure functional language where values are immutable, each variable must be ini-
    tialized to a value that can be checked to make sure it is valid. This suggests that we
    should never allow a variable to reference our old friend, null. Null values are a common
    source of bugs. Tony Hoare, who invented the concept of null, has recently called it
    The Billion Dollar Mistake.
*/
package options;

//There will be different subclasses representing different options, the generic type will allow us work with the specifics of each subclass
public abstract class Option<T> {
    //The idea is to return true for the options that represent a valid object and false for the ones that would be null(This way we no longger return nulls)
    public abstract boolean hasValue();
    //This will return the Type itself
    public abstract T get();
    //Will return the current value if valid, otherwise it will return an alternative
    public T getOrElse(T alternative) {
        return hasValue() == true ? get() : alternative;
    }
}

package options;

//The None Option cannot be extended
public final class None<T> extends Option<T> {
    //Rather than using nulls exceptions will be thrown
    public static class NoneHasNoValue extends RuntimeException {}

    public None() {}
    //None objects don't have values
    public boolean hasValue() { return false; }
    //When you try to retrieve a None object you get an exception rather than a null pointer reference
    public T get() { throw new NoneHasNoValue(); }

    @Override
    public String toString() { return "None"; }

    @Override
    public boolean equals(Object other) {
        return (other == null || other.getClass() != None.class) ? false : true;
    }

    @Override
    public int hashCode() { return -1; }

}

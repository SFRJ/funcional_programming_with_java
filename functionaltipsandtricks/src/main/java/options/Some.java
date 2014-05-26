package options;

public final class Some<T> extends Option<T> {

    //The value of this object is immutable
    private final T value;

    public Some(T value) {
        this.value = value;
    }
    //All Some objects have a value
    public boolean hasValue() {
        return true;
    }
    //Some's value is read-only
    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass() != Some.class)
            return false;
        Some<?> that = (Some<?>) other;
        Object thatValue = that.get();
        return value.equals(thatValue);
    }

    @Override
    public int hashCode() {
        return 37 * value.hashCode();
    }

    @Override
    public String toString() {
        return "Some(" + value + ")";
    }

}


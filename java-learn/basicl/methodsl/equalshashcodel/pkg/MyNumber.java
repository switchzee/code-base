package jlearning.basicl.methodsl.equalshashcodel.pkg;

// .equals() and hashCode() are assumed consistent, which is:
// It is assumed that if 2 objects are equal (that is, equals() returns true), then their hashCodes() must return the same value. 
public class MyNumber {
    private Integer integer;

    public MyNumber(Integer num) {
        this.integer = num.intValue();
    }

    @Override
    public int hashCode() {
        return this.integer.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return this.integer.intValue() == ((Integer) obj).intValue();
        } else if (obj instanceof MyNumber) {
            return this.integer.intValue() == ((MyNumber) obj).integer.intValue();
        }
        return false;
    }

}

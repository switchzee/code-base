package jlearning.basicl.exceptionl.pkg;

public class Checker {
    // throws means this exception may occurs
    // checked exception must have throws
    public void checkLess(Integer num, Integer lim) throws MyCheckedException {
        // throws checked exception, unhandling leads to compile error
    }

    public void checkGreat(Integer num, Integer lim) {
        if (num <= lim) {
            throw new MyUnCheckedException("input number not great than " + lim.toString());
        }
    }
}

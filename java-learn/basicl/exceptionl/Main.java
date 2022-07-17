package jlearning.basicl.exceptionl;

import jlearning.basicl.exceptionl.pkg.Checker;
import static utils.PrintUtils.*;

public class Main {

    private static String trycatchfinally() {
        String msg = "I am initial";
        try {
            return msg;
        } catch (Exception e) {

        } finally {
            // no matter how to alter the returned variable
            // jvm returns the variable in try block
            msg = "I am finally altered";
        }
        return msg;
    }

    public static void main(String[] args) {
        Checker checker = new Checker();
        println(trycatchfinally()); // 1? which is abnormal
        checker.checkGreat(1, 2);
        try {
            checker.checkLess(1, 2);
        } catch (Exception e) {

        }
    }
}

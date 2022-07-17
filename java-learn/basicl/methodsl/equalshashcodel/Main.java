package jlearning.basicl.methodsl.equalshashcodel;

import jlearning.basicl.methodsl.equalshashcodel.pkg.MyNumber;

public class Main {
    private static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(1);
        MyNumber myNumber2 = new MyNumber(2);
        if (myNumber.equals(myNumber2)) {
            print("my number 1 and 2 are equal");
        } else {
            print("my numbers are not equal");
        }
    }
}

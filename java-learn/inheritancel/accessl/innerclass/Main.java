package jlearning.inheritancel.accessl.innerclass;

import jlearning.inheritancel.accessl.pkg.AccessClass;

class Outer {
    private int outer;
    private static int st = 0;

    public class Inner {
        public int inner;

        public Inner() {
            // inner class can access everything outside
            System.out.println(outer);
        }
    }

    public static class TopLevel {
        public int top;

        public TopLevel() {
            // can only access static fields of outer
            System.out.println(st);
        }
    }

    public Outer() {
        // initialize inner object
        Inner inner = new Inner();
    }

}

public class Main {
    public static void main(String[] args) {
        // access inner class must after instantiate outer
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        // but static inner class is in fact a top-level class
        Outer.TopLevel topLevel = new Outer.TopLevel();
    }

}

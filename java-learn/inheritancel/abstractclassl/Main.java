package jlearning.inheritancel.abstractclassl;

import jlearning.inheritancel.abstractclassl.pkg.*;
import jlearning.inheritancel.abstractclassl.pkg.Runnable;

public class Main {
    public static void main(String[] args) {
        // abstract class and interface cannot be instantiated

        // polymorphism
        Person p = new Man();
        System.out.println(p.getDescription());
        Runnable runable = new Man();
        runable.run();

        // accessiblilty
        // System.out.println(p.name); // default fileds cannot access by subclass
        // Man man = new Man();
        // System.out.println(man.defaultstr); // default fields cannot access by
        // different package
    }
}

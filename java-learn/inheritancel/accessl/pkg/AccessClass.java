package jlearning.inheritancel.accessl.pkg;

import static utils.PrintUtils.*;

// world > package > subclass > this class
public class AccessClass {
    // private can only be accessed in this class
    private void privateMethod() {
        println("i am private");
    }

    // public can be accessed in world
    public void publicMethod() {
        println("i am public");
    }

    // protected can be accessed subclass
    protected void protectedMethod() {
        println("i am protected");
    }

    // default can be accessed in same package
    void defaultMethod() {
        println("i am default");
    }

    // private can only access in this class
    public void accessPrivateMethod() {
        this.privateMethod();
    }
}

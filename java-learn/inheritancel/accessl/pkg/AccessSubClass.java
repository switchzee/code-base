package jlearning.inheritancel.accessl.pkg;

public class AccessSubClass extends AccessClass {
    public void method() {
        super.defaultMethod();
    }

    private void get() {
        AccessClass accessClass = new AccessClass();
    }
}

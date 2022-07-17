package jlearning.basicl.methodsl.finalizel;

class Finalization {
    public Finalization() {
        System.out.println("I am created.");
    }

    // execute finalize() before objec is GCed.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am about to be GC.");
    }
}

public class Main {
    public static void main(String[] args) {
        Finalization finalization = new Finalization();
        finalization = null;
        System.gc(); // GC execute finalize()
    }
}

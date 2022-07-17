package jlearning.inheritancel.abstractclassl.pkg;

public class Man extends Person implements Runnable {

    String defaultstr = "default str in man";

    @Override
    public String getDescription() {
        return "i am a man";
    }

    @Override
    public void run() {
        System.out.println("i am running");
    }

    @Override
    public void move() {
        System.out.println("i am moving");
    }
}

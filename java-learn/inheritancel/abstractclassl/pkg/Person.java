package jlearning.inheritancel.abstractclassl.pkg;

abstract public class Person extends Being {
    String name = "person"; // default fields

    public Person() {

    }

    public String getName() {
        return name;
    } // concrete methods

    public abstract String getDescription(); // abstract methods

}
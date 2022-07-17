package jlearning.inheritancel.inheritance;

// inheritance and polymorphism
class Person {
    String title;

    public Person() {
        this.title = "Person";
    }

    public Person(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("i amnormal man");
    }
}

class SuperMan extends Person {
    public SuperMan() {
        // Must call direct parent class's constructor
        // because parent should be construct first
        // otherwise child would not be born
        super("SuperMan");
    }

    @Override
    public void print() {
        System.out.println("i am superman");
    }

    public void unique() {
        System.out.println("flying");
    }
}

class Main {

    public static void main(String[] args) {
        Person per = new SuperMan();
        per.print();
        // child is a kind of parent
        if (per instanceof SuperMan) {
            per.print();
            SuperMan man = (SuperMan) per; // downcasting: not recomanded
            man.unique();
        }
        per = new Person();
        // parent is not a kind of child
        if (per instanceof SuperMan) {
            per.print();
        }
        // null is ok to use, but will always be false
        if (null instanceof SuperMan) {

        }
    }
}
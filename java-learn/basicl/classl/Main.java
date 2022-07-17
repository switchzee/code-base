package jlearning.basicl.classl;

class SimpleClass {
    private String ele;

    // nonstatic code block = nonstatic variable
    // execute whenever object is created
    // even before constructor
    {
        System.out.println("I am initial block");
    }

    // static code block = static variable
    // execute when class is loaded, so only once
    static {
        System.out.println("I am static initial block");
    }

    // constructor
    public SimpleClass() {
        this.ele = "string";
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        SimpleClass simpleClass2 = new SimpleClass();
    }
}

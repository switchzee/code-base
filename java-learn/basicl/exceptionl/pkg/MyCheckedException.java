package jlearning.basicl.exceptionl.pkg;

public class MyCheckedException extends Exception {
    private String message = "initial message";

    public String getMessage() {
        return message;
    }

    public MyCheckedException(String message) {
        this.message = message;
    }
}

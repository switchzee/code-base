package jlearning.basicl.exceptionl.pkg;

public class MyUnCheckedException extends RuntimeException {
    private String message = "initial message";

    public String getMessage() {
        return message;
    }

    public MyUnCheckedException(String message) {
        this.message = message;
    }
}

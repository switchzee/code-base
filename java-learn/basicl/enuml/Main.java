package jlearning.basicl.enuml;

import java.util.stream.Stream;

import jlearning.basicl.enuml.pkg.*;

import static utils.PrintUtils.*;

public class Main {
    private static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Order order = Order.FIRST;
        switch (order) { // switch can be used with enum
            case FIRST:
                break;
            case SECOND:
                break;
            case THIRD:
                break;
            case FOUTH:
                break;
            default:
                break;
            // no need to use Order.* cause jvm decide it for you
        }
        Enum<Order> mEnum = Order.FIRST; // enum class extends Enum by default
        if (mEnum instanceof Order) {
            print("i am instance of Order");
        } else if (mEnum instanceof Enum) {
            print("i am instance of Enum");
        }

        // get all enums and print them
        Stream.of(Order.values()).forEach((e) -> {
            println(e);
        });
    }
}

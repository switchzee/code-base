package jlearning.lambdal;

import static utils.PrintUtils.*;

import java.util.Arrays;
import java.util.Random;

import jlearning.lambdal.pkg.Factory;
import jlearning.lambdal.pkg.Item;
import jlearning.lambdal.pkg.NoReturnSingleParam;

public class Main {

    public static void main(String[] args) {
        // 1. lambda expression can be used to
        // implement functional interface (which is
        // one-method-interface)'s only method.
        NoReturnSingleParam noReturnSingleParam = (String msg) -> {
            println(msg);
        };

        // call the implemented function
        noReturnSingleParam.method("Hello lambda world");

        // use it to help sorting
        // because comparator is a functional interface
        Integer[] nums = new Integer[10];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = new Random().nextInt();
        }
        Arrays.sort(nums, (Integer a, Integer b) -> a - b);

        // reference to constructor
        // to make factory-mode class constructor
        Factory<Item> itemFactory = () -> new Item();
        Item item = itemFactory.getItem();
        println(item.getMsg());

        // create thread by implementing Runnable interface's
        // .run() method
        new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                println("hello lambda thread");
            }
        }).start();

        // 2. closure problem
        // Local variable num defined in an enclosing scope
        // must be final or effectively final
        Integer num = 2;
        NoReturnSingleParam noReturnSingleParam2 = (String a) -> {
            println(num);
        };
        noReturnSingleParam2.method("");
        // num += 2; compilation error: makes num not final
    }
}
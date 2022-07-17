package jlearning.streamsl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1. streams creation
        // infinite stream: due to lazyness
        Stream infStream = Stream.iterate(0, i -> i + 2);
        // 2. finite stream
        // from Collection
        Stream listStream = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        }.stream();
        Stream arrayStream = Stream.of(new int[] { 1, 2, 3, 4 });

        // nonfinal returns stream
        // final method: makes stream terminate
        List<Integer> sums = new ArrayList<Integer>();
    }
}

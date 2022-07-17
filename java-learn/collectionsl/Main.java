package jlearning.collectionsl;

import static utils.PrintUtils.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static void add(List<Integer> list, int n) {
        for (int i = 1; i <= n; ++i) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>() {
            {
                add("this");
                add("is");
                add("a");
                add("collection");
            }
        };

        // use iterator<> to iterate
        for (String str : collection) {
            println(str);
        }
        Iterator<String> iterator = collection.iterator();
        // which is equivalent to:
        while (iterator.hasNext()) {
            // return the ele and move forward
            // at once.
            String str = iterator.next();
            println(str);
        }
        List<Integer> integers = new ArrayList<Integer>();
        add(integers, 10);

        for (int i = 0; i < integers.size(); ++i) {
            integers.remove(i); // caution: index changes
        }
        println(integers);
        integers.clear();
        add(integers, 10);
        Iterator<Integer> iter = integers.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
            // iter.remove() will safe delete element
            // it removes last ele returned from iterator
            // use once per .next()
        }
        println(integers);

        // use lambda and for-each iterate collection
        integers.forEach((Integer ele) -> {
            println(ele);
        });

        // iterator can change the objects
        List<List<Integer>> ints = new ArrayList<>();
        ints.add(new ArrayList<>());
        ints.get(ints.size() - 1).add(1);
        for (List<Integer> ls : ints) {
            ls.add(2);
        }
        println(ints);
    }
}

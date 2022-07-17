package jlearning.collectionsl.Listl;

import java.util.*;
import static utils.PrintUtils.*;

public class Main {
    private static void initalList(List<Integer> ls, int b, int e) {
        ls.clear();
        for (int i = b; i <= e; ++i) {
            ls.add(i);
        }
    }

    public static void main(String[] args) {
        /* 1. LinkedList: doubly linked. */
        List<Integer> linkedList = new LinkedList<Integer>();
        initalList(linkedList, 1, 10); // 1,2,3,4,5,6,7,8,9,10
        // iterator is the gap between elements.
        ListIterator<Integer> iter = linkedList.listIterator();
        // iter is the head of list
        // iter.next() is the first ele
        // iter.add() adds ele before of current iter: fill the prev filed
        for (int i = -10; i <= -1; ++i) {
            iter.add(i);
        }
        println(linkedList);
        // add to end
        initalList(linkedList, 1, 3);
        iter = linkedList.listIterator(); // reset iterator
        while (iter.hasNext())
            iter.next();
        iter.add(4); // add to the end
        println(linkedList);

        // iter.remove() removes last visited ele
        // In order to do that:
        // it removes the prev if calls after .next
        // and removes the next if calls after .previous
        iter = linkedList.listIterator();
        iter.next(); // iterator between first and second ele 1|2
        iter.remove(); // removes 1: |2
        println(linkedList);
        iter.next(); // 2|3
        iter.next(); // 3|4
        println(iter.previous()); // 2|3
        iter.remove(); // removes 3: 2|4
        println(linkedList);

        // set replaces the last visited element to a new value
        iter.next(); // 4|
        iter.set(-1);
        println(linkedList);

    }
}

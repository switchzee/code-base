package jlearning.collectionsl.RawTypel;

import java.util.*;

/* raw type and ? */
public class Main {
    private static void printRaw(List ls) {
        ls.forEach((ele) -> {
            System.out.println(ele);
        });
    }

    private static void printObj(List<Object> ls) {
        ls.forEach((ele) -> {
            System.out.println(ele);
        });
    }

    public static void main(String[] args) {
        /* 1. raw-type */
        List<String> ls = new ArrayList<>(); // not raw: type is given
        List rs = new ArrayList<>(); // raw
        // add anything in raw type
        rs.add(1);
        rs.add(2);
        rs.add("raw");
        printRaw(rs);
        // as a parameter it can be anything list
        // hence lose type safety
        ls.add("I");
        ls.add("am");
        ls.add("not raw");
        printRaw(ls);
        // raw vs <Object>
        List<Object> os = new ArrayList<>();
        os.add(1);
        os.add(2);
        os.add("object");// <Object> can also add anything
        // printObj(ls); wrong: type not match
        printObj(rs); // whereas raw lose type safety

        /* 2. ? means i donot know this parameter type */
        List<?> nkLs = new ArrayList<>();
        // nkLs.add(1) // error: cannot add cause i donot know
    }
}
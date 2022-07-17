package jlearning.basicl.stringsl.regularexpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // detects integer or hex number
        String rexp = "[+-]?[0-9]+|0[Xx][0-9A-Fa-f]+";

        // get a pattern from a rexp
        Pattern pattern = Pattern.compile(rexp);
        String text = "12";

        // get macher of text
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            System.out.println(matcher.group());
        }
    }
}

package jlearning.keywordsl.finall.pkg;

import java.util.List;
import java.util.ArrayList;

// final on class: cannot be inherited
public final class Finals {
    // final on fileds: it cannot point to another object.
    private final List<String> strings = new ArrayList<>();

    // final on methods: subclass cannot overwrite it.
    public final void canNotOverwrite() {
        // this.strings = new ArrayList<>(); Error
        strings.add("obj"); // but the object it points to canbe altered
    }

    // final cannot on constructor
}

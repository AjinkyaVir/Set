package com.company.linkedhashset.exampleone;

import java.util.LinkedHashSet;

public class Demo {

    public static void main(String[] args) {

        // Adding one collection to another by using constructor approach
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Aju");
        linkedHashSet.add("Sau");

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>(linkedHashSet);
        linkedHashSet1.add("Anu");

        System.out.println(linkedHashSet1);

        // Adding one collection to another by using addAll method
        LinkedHashSet<String> lh1 = new LinkedHashSet<>();
        lh1.add("Aju");
        lh1.add("Sau");

        LinkedHashSet<String> lh2 = new LinkedHashSet<>();
        lh2.add("abhi");
        lh2.add("shra");

        LinkedHashSet<String> lh3 = new LinkedHashSet<>();
        lh3.addAll(lh1);
        lh3.addAll(lh2);
        lh3.add("Andy");
        lh3.add("Anu");
        System.out.println(lh3);

    }

}
